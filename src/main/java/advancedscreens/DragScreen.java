package advancedscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class DragScreen extends BaseScreenADV {
    public DragScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@resource-id='com.h6ah4i.android.example.advrecyclerview:id/button'][2]")
    MobileElement selectDraggable;

    @FindBy(xpath = "//*[@class='androidx.appcompat.app.ActionBar$Tab'][2]")
    MobileElement swipeButton;


    public DraggableBasicScreen selectDraggableBasic(){
        selectDraggable.click();
        return new DraggableBasicScreen(driver);
    }

    public SwipeScreen selectSwipeButton(){
        swipeButton.click();
        return new SwipeScreen(driver);
    }
}
