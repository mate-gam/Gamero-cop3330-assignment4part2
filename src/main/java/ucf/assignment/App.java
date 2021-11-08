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

        //Getting loader and pane for editItem
        FXMLLoader editItemPaneLoader = new FXMLLoader(App.class.getResource("editItem.fxml"));
        Parent editItemPane = editItemPaneLoader.load();
        Scene editItemScene = new Scene(editItemPane, 600, 400);

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