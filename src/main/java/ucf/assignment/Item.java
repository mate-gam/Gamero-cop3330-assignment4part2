package ucf.assignment;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.cell.CheckBoxListCell;

public class Item
{
    private String title;
    private String dueDate;
    private String description;
    private Button edit;
    private Button delete;
    private CheckBox check;

    public Item(String title, String dueDate, String description, Button edit, Button delete, CheckBox check) {
        this.title = title;
        this.dueDate = dueDate;
        this.description = description;
        this.edit = edit;
        this.edit.setText("Edit");
        this.delete = delete;
        this.delete.setText("Delete");
        this.check = check;
    }

    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String getDueDate()
    {
        return dueDate;
    }
    public void setDueDate(String dueDate)
    {
        this.dueDate = dueDate;
    }
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public void setEdit(Button edit)
    {
        this.edit = edit;
    }
    public Button getEdit()
    {
        return edit;
    }
    public void setDelete(Button delete)
    {
        this.delete = delete;
    }
    public Button getDelete()
    {
        return delete;
    }
    public void setCheck(CheckBox check)
    {
        this.check = check;
    }
    public CheckBox getCheck()
    {
        return check;
    }
}
