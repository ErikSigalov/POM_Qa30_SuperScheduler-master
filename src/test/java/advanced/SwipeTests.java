package advanced;

import advancedscreens.DragScreen;
import configadvanced.ConfigAdvanced;
import org.testng.annotations.Test;

public class SwipeTests extends ConfigAdvanced {

    @Test
    public void swipeTestLR(){

        new DragScreen(driver)
                .selectSwipeButton()
                .selectSwipeableBasic()
                .swipeFromLeftToRight();

    }

    @Test
    public void swipeTestRL(){

        new DragScreen(driver)
                .selectSwipeButton()
                .selectSwipeableBasic()
               .swipeFromRightToLeft();

    }
}
