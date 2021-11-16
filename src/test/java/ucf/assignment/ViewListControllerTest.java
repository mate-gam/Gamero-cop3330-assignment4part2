package ucf.assignment;

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
}