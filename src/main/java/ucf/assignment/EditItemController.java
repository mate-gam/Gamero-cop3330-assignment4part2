/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Mateo Gamero
 */
package ucf.assignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EditItemController{
    public TextArea txtboxEditDescription; //the previous description is already going to be here
    public TextArea txtboxEditDate;//previous will be in textbox
    public TextArea txtboxEditItemName;//previous will be in txtbox
    public Button btnEditItem;
    public Label label;

    public static void mainStage() throws IOException
    {
        FXMLLoader viewListPaneLoader = new FXMLLoader(App.class.getResource("viewList.fxml"));
        Parent viewListPane = viewListPaneLoader.load();
        Scene viewListScene = new Scene(viewListPane, 713, 400);

        Stage newStage = new Stage();
        newStage.setTitle("Edit Item");
        newStage.setScene(viewListScene);
        newStage.show();
    }


    public void editItem(ActionEvent actionEvent) throws IOException {
        //gets all the info from the textbox and then edits the item
        //calls all of the functions that are needed to edit
        //goes back to the list they were viewing
        Stage stage = (Stage) btnEditItem.getScene().getWindow();
        stage.close();
    }

    public void myFunction(String text)
    {
        txtboxEditItemName.setText(text);
        label.setText(text);
    }
    public void setTxtboxEditItemName (String txtboxEditItemName)
    {
        this.txtboxEditItemName.setText(txtboxEditItemName);
    }
    public String getTxtboxEditItemName()
    {
        return this.txtboxEditItemName.getText();
    }
}
