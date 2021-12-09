package scheduler;

import config.ConfigurationScheduler;
import models.Auth;
import models.Event;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import schedulerscreens.HomeScreen;
import schedulerscreens.LoginScreen;

public class EventTest extends ConfigurationScheduler {

    @BeforeMethod
    public void preCondition(){
        new LoginScreen(driver)
                .loginComplex(Auth.builder().email("noa@gmail.com").password("Nnoa12345$").build())
                .skipWizard()
                .isFabAddPresent();
    }

    @Test
    public void createNewEventTest(){
        boolean isfabAddPresent = new HomeScreen(driver)
                .initCreationEvent()
                .createNewEvent(Event.builder()
                        .title("Event")
                        .type("new")
                        .breaks(2)
                        .wage(50).build())
                .isFabAddPresent();
        Assert.assertTrue(isfabAddPresent);
    }
}
