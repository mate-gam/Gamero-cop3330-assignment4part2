package ucf.assignment;

import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.CheckBoxTableCell;

public class CompletedItems
{
    CheckBoxTableCell checkBoxTableCell;
    TableColumn checkBoxColumn;
    TableColumn getCheckedComplete()
    {
        //get all of the items that are checked
        //this method will be called after the Show Completed Item button is pressed
        return checkBoxColumn;
    }

    void setCheckedComplete()
    {
        //sets all of the checked rows of list to display while others are
        //invisible but still saved
    }
}
