package ucf.assignment;

import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.CheckBoxTableCell;

public class UncompletedItems
{
    TableColumn tableColumn;
    CheckBoxTableCell checkBoxTableCell;
    TableColumn getUncheckedComplete()
    {
        //get all of the items that are not checked
        //this method will be called after the Show Uncompleted Item button is pressed
        return tableColumn;
    }

    void setUncheckedComplete()
    {
        //sets all of the unchecked rows of list to display while others are
        //invisible but still saved
    }
}
