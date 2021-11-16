package ucf.assignment;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ViewListController implements Initializable {
    public TableView<Item> tableView;
    public TableColumn<Item, String> nameCol;
    public TableColumn<Item, String> dateCol;
    public TableColumn<Item, String> checkCol;
    public TableColumn<Item, String> deleteCol;
    public TableColumn<Item, String> editCol;
    public TextField txtboxListTitle;
    public TextArea txtboxItemTitle;
    public TextArea txtboxDueDate;
    public TextArea txtboxDescription;
    ArrayList<Button> buttonEdit = new ArrayList<>();
    ArrayList<Button> buttonDelete = new ArrayList<>();
    FileChooser fileChoose = new FileChooser();

    public ObservableList<Item> data =
            FXCollections.observableArrayList();
    public ObservableList<Item> checked =
            FXCollections.observableArrayList();
    public ObservableList<Item> unchecked =
            FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        fileChoose.setInitialDirectory(new File("C:\\Users\\gamer\\OneDrive\\Documents\\School"));
        nameCol.setCellValueFactory(
                new PropertyValueFactory<>("title"));

        dateCol.setCellValueFactory(
                new PropertyValueFactory<>("dueDate"));

        checkCol.setCellValueFactory(
                new PropertyValueFactory<>("check"));

        editCol.setCellValueFactory((
                new PropertyValueFactory<>("edit")));

        deleteCol.setCellValueFactory((
                new PropertyValueFactory<>("delete")));

        tableView.setItems(data);
    }

    //Checking for valid Date
    public Boolean validDate(String date)
    {
        if (date.length() != 10)
            return false;
        for(int i = 0; i < 4; i++)
        {
            if(!Character.isDigit(date.charAt(i)))
                return false;
        }
        for(int i = 5; i < 7; i++)
        {
            if(!Character.isDigit(date.charAt(i)))
                return false;
        }
        for(int i = 8; i < 10; i++)
        {
            if(!Character.isDigit(date.charAt(i)))
                return false;
        }
        if ('-' != date.charAt(4))
            return false;
        if ('-' != date.charAt(7))
            return false;
        return true;
    }

    public boolean validDescription(String description)
    {
        return description.length() >= 1 && description.length() <= 256;
    }

    public void showCompletedItems(ActionEvent actionEvent) throws IOException {
        //shows all the check items in the tableview
        int counter = 0;
        for (int k = 0; k < data.size(); k++)
        {
            for (int i = 0; i < checked.size(); i++)
            {
                if (data.get(k) == checked.get(i))
                {
                    counter++;
                }
            }
            if (counter == 0)
            {
                if (data.get(k).getCheck().isSelected())
                {
                    checked.add(data.get(k));
                }
            }

        }
        tableView.setItems(checked);
    }

    public void showUncompleted(ActionEvent actionEvent) {
        //shows all the unchecked items in the cell
        int counter = 0;
        for (int k = 0; k < data.size(); k++)
        {
            for(int i = 0; i < unchecked.size();i++)
            {
                if (data.get(k) == unchecked.get(i))
                {
                    counter++;
                }
            }
            if(counter == 0)
            {
                if (!data.get(k).getCheck().isSelected())
                {
                    unchecked.add(data.get(k));
                }
            }
        }
        tableView.setItems(unchecked);
    }
    public void warningStage() throws IOException {
        FXMLLoader viewListPaneLoader = new FXMLLoader(App.class.getResource("errorPage.fxml"));
        Parent viewListPane = viewListPaneLoader.load();
        Scene viewListScene = new Scene(viewListPane, 350, 250);

        Stage newStage = new Stage();
        newStage.setTitle("Edit Item");
        newStage.setScene(viewListScene);
        newStage.show();
    }

    public void addNewItem(ActionEvent actionEvent) throws IOException {
        //add new Item in the List
        //changes scene to itemInList to add new Item
        ViewListController viewListController = new ViewListController();
        boolean validDate = viewListController.validDate(txtboxDueDate.getText());
        boolean validDescription = viewListController.validDescription(txtboxDescription.getText());
        if (!validDate || !validDescription)
            warningStage();

        if(validDate && validDescription)
        {
            buttonEdit.add(new Button());
            buttonDelete.add(new Button());
            CheckBox checkBox = new CheckBox();

            Item item = new Item(txtboxItemTitle.getText(), txtboxDueDate.getText(),txtboxDescription.getText(),
                    buttonEdit.get(buttonEdit.size()-1), buttonDelete.get(buttonDelete.size()-1), checkBox);
            buttonDelete.get(buttonDelete.size()-1).setOnAction(e -> {
                data.remove(item);
            });
            buttonEdit.get(buttonEdit.size()-1).setOnAction(e -> {
                Item item1 = data.get(buttonEdit.size()-1);
                String itemTitle = item1.getTitle();

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("editItem.fxml"));
                try{
                    loader.load();
                } catch (IOException e1){
                    System.out.println(e1);
                }
                EditItemController editItemController = loader.getController();
                editItemController.myFunction(itemTitle);

                Parent parent = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(parent));
                stage.showAndWait();
            });
            data.add(item);
            tableView.setItems(data);

            //resets the txtbox to be empty
            txtboxItemTitle.setText("");
            txtboxDueDate.setText("");
            txtboxDescription.setText("");
        }
    }
    public void saveAllItems(ActionEvent actionEvent) throws IOException {
        //save all the items to an external csv file
        boolean bool = true;
        Writer writer = null;
        File file = null;
        while (bool)
        {
            file = fileChoose.showOpenDialog(new Stage());

            String fileName = file.getName();
            String extension = fileName.substring(fileName.lastIndexOf("."));
            if(extension.equals(".csv"));
            {
                bool = false;
            }
        }
        writer = new BufferedWriter(new FileWriter(file));
        for (Item item : data)
        {
            String itemValue = item.getTitle() + "," + item.getDueDate() + "," + item.getDescription();
            writer.write(itemValue);
        }
        writer.flush();
        writer.close();
    }

    public void loadAllItems(ActionEvent actionEvent) throws IOException {
        //loads all the items from an external csv file
        File file = fileChoose.showOpenDialog(new Stage());
        String fileName = file.getPath();
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII))
        {
            String line = br.readLine();

            while (line != null)
            {
                buttonDelete.add(new Button());
                buttonEdit.add(new Button());
                CheckBox checkBox = new CheckBox();

                String[] itemAttributes = line.split(",");
                Item item = new Item(itemAttributes[0], itemAttributes[1], itemAttributes[2],
                        buttonEdit.get(buttonEdit.size()-1), buttonDelete.get(buttonDelete.size()-1), checkBox);
                buttonDelete.get(buttonDelete.size()-1).setOnAction(e -> {
                    data.remove(item);
                });
                data.add(item);
                line = br.readLine();
            }
        }
        //add items in csv file to tableview
    }

    public void showAllItems(ActionEvent actionEvent) {
        //shows all the items regardless if check column is checked
        tableView.setItems(data);
    }

    public void removeAllItems(ActionEvent actionEvent) {
        data.clear();
        unchecked.clear();
        checked.clear();
    }
}