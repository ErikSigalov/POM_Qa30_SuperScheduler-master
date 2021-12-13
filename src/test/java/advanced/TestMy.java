package advanced;

import advancedscreens.DragScreen;
import configadvanced.ConfigAdvanced;
import models.Event;
import org.testng.Assert;
import org.testng.annotations.Test;
import schedulerscreens.HomeScreen;

public class TestMy extends ConfigAdvanced {

    @Test
    public void launch1(){

       new DragScreen(driver)
               .selectDraggableBasic();

    }
    @Test
    public void launch2(){

        new DragScreen(driver)
                .selectSwipeButton()
                .selectSwipeableBasic();

    }

}
