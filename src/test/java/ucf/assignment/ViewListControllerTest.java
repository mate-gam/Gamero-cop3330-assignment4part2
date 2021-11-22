/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Mateo Gamero
 */
package ucf.assignment;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ViewListControllerTest {

    @Test
    void validDate() {
        ViewListController viewListController = new ViewListController();
        assertTrue(true, String.valueOf(viewListController.validDate("5555-55-55")));
    }

    @Test
    void validDescription() {
        ViewListController viewListController = new ViewListController();
        assertTrue(true, String.valueOf(viewListController.validDescription("sdfg")));
    }

    @Test
    void addNewItem() {
        ViewListController viewListController = new ViewListController();
    }

    @Test
    void remove()
    {
        ViewListController viewListController = new ViewListController();
        ObservableList<Item> data = FXCollections.observableArrayList();
        ObservableList<Item> clear = FXCollections.observableArrayList();
        data.add(new Item());
        assertEquals(clear, viewListController.remove(data));
    }
}
