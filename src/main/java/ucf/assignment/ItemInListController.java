package ucf.assignment;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class ItemInListController {
    public TextArea txtboxItemTitle;
    public TextArea txtboxDueDate;
    public TextArea txtboxItemDescription;
    public Button btnCreateItem;
    private Scene viewListScene;

    public void createItem(ActionEvent actionEvent) {
        //create item for the to do list viewed in the
        //viewList page
        //return user to viewList page with the list they
        //added the item to
        Stage createItemStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        createItemStage.setScene(viewListScene);
    }

    public void setViewListScene(Scene scene)
    {
        viewListScene = scene;
    }
}
