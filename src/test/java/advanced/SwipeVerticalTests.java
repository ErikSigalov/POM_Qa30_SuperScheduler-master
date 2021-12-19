package advanced;

import advancedscreens.DragScreen;
import configadvanced.ConfigAdvanced;
import org.testng.annotations.Test;

public class SwipeVerticalTests extends ConfigAdvanced {

    @Test
    public void swipeVerticalTestToUp(){

        new DragScreen(driver)
                .selectSwipeButton()
                .selectSwipeableVertical()
                .swipeToUp();

    }

    @Test
    public void swipeVerticalTestToDown(){

        new DragScreen(driver)
                .selectSwipeButton()
                .selectSwipeableVertical()
                .swipeToDown();


    }
}
