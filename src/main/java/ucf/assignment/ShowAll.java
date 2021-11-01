package ucf.assignment;

import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.CheckBoxTableCell;

public class ShowAll
{
    TableColumn tableColumn;
    CheckBoxTableCell checkBoxTableCell;

    TableColumn getShowAll()
    {
        //get all of the items that are saved in our list and regardless of checkmark it will be visible
        //this method will be called after the Show Uncompleted Item button is pressed
        return tableColumn;
    }

    void setShowAll()
    {
        //sets all of the unchecked rows of list to display while others are
        //invisible but still saved
    }
}
