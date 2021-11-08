package ucf.assignment;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
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

    public ObservableList<Item> data =
            FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nameCol.setCellValueFactory(
                new PropertyValueFactory<>("title"));

        dateCol.setCellValueFactory(
                new PropertyValueFactory<>("dueDate"));

        checkCol.setCellValueFactory(
                new PropertyValueFactory<>("description"));

        tableView.setItems(data);
    }

    public void showCompletedItems(ActionEvent actionEvent) throws IOException {
        //shows all the check items in the tableview
    }

    public void showUncompleted(ActionEvent actionEvent) {
        //shows all the unchecked items in the cell
    }

    public void addNewItem(ActionEvent actionEvent) throws IOException {
        //add new Item in the List
        //changes scene to itemInList to add new Item
        Item item = new Item(txtboxItemTitle.getText(), txtboxDueDate.getText(), txtboxDescription.getText());
        data.add(item);
        tableView.setItems(data);
        txtboxItemTitle.setText("");
        txtboxDueDate.setText("");
        txtboxDescription.setText("");
    }

    public void deleteNewItem(ActionEvent actionEvent) {
        //deletes the item that was check in the delete column
    }

    public void saveAllItems(ActionEvent actionEvent) {
        //save all the items to an external csv file
    }

    public void loadAllItems(ActionEvent actionEvent) {
        //loads all the items from an external csv file
    }

    public void showAllItems(ActionEvent actionEvent) {
        //shows all the items regardless if check column is checked
    }

    public void editTitleName(ActionEvent inputMethodEvent) {
        //changes name of list
        //textbox text is the old name
        //when changed the the new name is saved and changed everywhere
    }
}