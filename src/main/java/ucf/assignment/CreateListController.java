package ucf.assignment;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateListController
{
    App app = new App();
    public TextArea txtboxNameList;
    public Button btnCreateNewList;

    private Scene mainPageScene;

    public void setMainPageScene(Scene scene)
    {
        mainPageScene = scene;
    }

    public void createList(ActionEvent actionEvent) throws IOException {
        //Creates List with new List in table view on main page
        //Direct user back to main page after
        Stage createListStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        createListStage.setScene(mainPageScene);
    }
}
