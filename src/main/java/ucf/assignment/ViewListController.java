package ucf.assignment;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.CheckBoxTableCell;

public class ViewListController
{
    public TableView tableView;
    public TextField txtboxTitle;
    private Button btnEdit; //btn in tableview to edit the Item
    private CheckBoxTableCell deleteCheck; //checkbox in table to delete
    private CheckBoxTableCell checkCheck; //checkbox in table to complete
    public void showCompletedItems(ActionEvent actionEvent) {
        //shows all the check items in the tableview
    }

    public void showUncompleted(ActionEvent actionEvent) {
        //shows all the unchecked items in the cell
    }

    public void addNewItem(ActionEvent actionEvent) {
        //add new Item in the List
        //changes scene to itemInList to add new Item
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
