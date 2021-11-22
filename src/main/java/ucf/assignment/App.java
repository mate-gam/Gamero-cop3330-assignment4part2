/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Mateo Gamero
 */
package ucf.assignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    //main javafx code
    @Override
    public void start(Stage stage) throws IOException {
        //Instantiates scenes
        //Getting loader and pane for viewList
        FXMLLoader viewListPaneLoader = new FXMLLoader(App.class.getResource("viewList.fxml"));
        Parent viewListPane = viewListPaneLoader.load();
        Scene viewListScene = new Scene(viewListPane, 713, 603);

        stage.setTitle("To Do List");
        stage.setScene(viewListScene);
        stage.show();
        //change scene when any of the buttons are pressed
    }

    public static void main(String[] args) {
        launch();
    }
}
