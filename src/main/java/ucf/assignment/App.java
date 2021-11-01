package ucf.assignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    //main javafx code
    @Override
    public void start(Stage stage) throws IOException {
        //Loads main page
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("mainPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("To Do List");
        stage.setScene(scene);
        stage.show();
        //change scene when any of the buttons are pressed
    }

    public static void main(String[] args) {
        launch();
    }
}