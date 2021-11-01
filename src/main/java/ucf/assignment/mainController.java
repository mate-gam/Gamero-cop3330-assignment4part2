package ucf.assignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class mainController {
    public Button btnCreateListMain;
    public Button btnDeleteToDoList;
    public Button btnSaveAllList;
    public Button btnLoadAllLists;
    public TableView tableViewMain;
    public TableColumn colToDoList;
    public TableColumn colViewList;
    public TableColumn colCheck;
    private Button bntViewList; //Creates button in the table view to view list

    @FXML

    public void createList(ActionEvent actionEvent) {
        //changes scene to createList.fxml
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