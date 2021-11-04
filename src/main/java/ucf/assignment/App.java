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
        //Getting loader and pane for mainPage
        FXMLLoader mainPagePaneLoader = new FXMLLoader(App.class.getResource("mainPage.fxml"));
        Parent mainPagePane = mainPagePaneLoader.load();
        Scene mainPageScene = new Scene(mainPagePane, 600, 400);

        //Getting loader and pane for createList
        FXMLLoader createListPaneLoader = new FXMLLoader(App.class.getResource("createList.fxml"));
        Parent createListPane = createListPaneLoader.load();
        Scene createListScene = new Scene(createListPane, 600, 400);

        //Getting loader and pane for createItem
        FXMLLoader createItemPaneLoader = new FXMLLoader(App.class.getResource("createItem.fxml"));
        Parent createItemPane = createItemPaneLoader.load();
        Scene createItemScene = new Scene(createItemPane, 600, 400);

        //Gettomg loader and pane for editItem
        FXMLLoader editItemPaneLoader = new FXMLLoader(App.class.getResource("editItem.fxml"));
        Parent editItemPane = editItemPaneLoader.load();
        Scene editItemScene = new Scene(editItemPane, 600, 400);

        //Getting loader and pane for viewList
        FXMLLoader viewListPaneLoader = new FXMLLoader(App.class.getResource("viewList.fxml"));
        Parent viewListPane = viewListPaneLoader.load();
        Scene viewListScene = new Scene(viewListPane, 600, 400);

        //Sending the createList scene to MainController
        MainController mainController = (MainController)  mainPagePaneLoader.getController();
        mainController.setCreateListScene(createListScene);

        //Sending the mainPage scene to CreateListController
        CreateListController createListController = (CreateListController) createListPaneLoader.getController();
        createListController.setMainPageScene(mainPageScene);

        stage.setTitle("To Do List");
        stage.setScene(mainPageScene);
        stage.show();
        //change scene when any of the buttons are pressed
    }

    public static void main(String[] args) {
        launch();
    }
}