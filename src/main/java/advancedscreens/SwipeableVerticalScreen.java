package advancedscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SwipeableVerticalScreen extends BaseScreenADV{
    public SwipeableVerticalScreen(AppiumDriver<MobileElement> driver) {

        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='com.h6ah4i.android.example.advrecyclerview:id/container' and @class = 'android.widget.FrameLayout']")
    List<MobileElement> list;

    public SwipeableVerticalScreen swipeToUp() {
        MobileElement el = list.get(0);
        Rectangle rect = el.getRect();


        int yFrom = rect.getY() + (rect.getHeight()-20);
        //int xFrom = rect.getX() + (rect.getWidth()/5);
        //int xFrom = rect.getX() + (rect.getWidth()/10%);
        int x = rect.getX() + rect.getWidth()/2;

        int yTo = rect.getY()+20;
        //int xTo = rect.getX() + (rect.getWidth()-10);

        TouchAction<?> Action = new TouchAction<>(driver);
        Action.longPress(PointOption.point(x,yFrom))
                .moveTo(PointOption.point(x,yTo))
                .release()
                .perform();

        return this;
    }

    public SwipeableVerticalScreen swipeToDown() {
        MobileElement el = list.get(3);
        Rectangle rect = el.getRect();


        int yFrom = rect.getY()+20;
        //int xFrom = rect.getX() + (rect.getWidth()/5);
        //int xFrom = rect.getX() + (rect.getWidth()/10%);
        int x = rect.getX() + rect.getWidth() / 2;

        int yTo = rect.getY() + (rect.getHeight()-20);
        //int xTo = rect.getX() + (rect.getWidth()-10);

        TouchAction<?> Action = new TouchAction<>(driver);
        Action.longPress(PointOption.point(x,yFrom))
                .moveTo(PointOption.point(x,yTo))
                .release()
                .perform();

        return this;
    }
}
