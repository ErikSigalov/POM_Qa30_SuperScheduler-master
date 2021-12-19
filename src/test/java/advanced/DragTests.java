package advanced;

import advancedscreens.DragScreen;
import configadvanced.ConfigAdvanced;
import org.testng.annotations.Test;

public class DragTests extends ConfigAdvanced {
    @Test
    public void dragDown(){

        new DragScreen(driver)
                .selectDraggableBasic()
               // .dragDown();
        .dragDownWindow();

    }

    @Test
    public void dragUp(){

        new DragScreen(driver)
                .selectDraggableBasic()
                // .dragDown();
                .dragUp();

    }
}
