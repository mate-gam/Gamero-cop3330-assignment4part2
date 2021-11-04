package ucf.assignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class MainController {
    public Button btnCreateListMain;
    public Button btnDeleteToDoList;
    public Button btnSaveAllList;
    public Button btnLoadAllLists;
    public TableView tableViewMain;
    public TableColumn colToDoList;
    public TableColumn colViewList;
    public TableColumn colCheck;
    private Button bntViewList; //Creates button in the table view to view list

    private Scene createListScene;

    @FXML

    public void setCreateListScene(Scene scene)
    {
        createListScene = scene;
    }

    public void createList(ActionEvent actionEvent) {
        //changes scene to createList.fxml
        Stage mainPageStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        mainPageStage.setScene(createListScene);
    }

    public void deleteCheckedList(ActionEvent actionEvent) {
        //deletes the list that are checked in the table view
    }

    public void saveAllTodoList(ActionEvent actionEvent) {
        //saves all the lists to a csv file
    }

    public void loadAllLists(ActionEvent actionEvent) {
        //loads all the lists from a csv file
    }
}