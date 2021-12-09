package scheduler;

import config.ConfigurationScheduler;
import models.Auth;
import org.testng.Assert;
import org.testng.annotations.Test;
import schedulerscreens.LoginScreen;
import schedulerscreens.SplashScreen;

public class LoginTest extends ConfigurationScheduler {

    @Test
    public void loginSuccessTest(){

        boolean isFabPresent = new SplashScreen(driver)
                .checkVersion("0.0.3")
                .fillEmail("noa@gmail.com")
                .fillPassword("Nnoa12345$")
                .clickLoginBtn()
                .skipWizard()
                .isFabAddPresent();
        Assert.assertTrue(isFabPresent);


    }

    @Test
    public void loginStartLoginScreen(){

        boolean isFabPresent = new LoginScreen(driver)
                .fillEmail("your8@gmail.com")
                .fillPassword("Yy123456$")
                .clickLoginBtn()
                .skipWizard()
                .isFabAddPresent();
        Assert.assertTrue(isFabPresent);
    }

    @Test
    public void loginAuthTest() {
        boolean isFabPresent =
                new LoginScreen(driver)
                        .loginComplex(Auth.builder().email("your2@gmail.com").password("Yy123456$").build())
                        .skipWizard()
                        .isFabAddPresent();
        Assert.assertTrue(isFabPresent);

    }
    @Test
    public void loginComplexCheckErrorMesage(){
        boolean isLoginButtonPresent =
                new LoginScreen(driver)
                        .loginComplexWithErrorMessage(Auth.builder().email("your2@gmail.com").password("Yy123456").build())
                        .checkErrorMessage("Wrong email or password")
                        .confirmErrorMessage()
                        .isLoginButtonPresent();
        Assert.assertTrue(isLoginButtonPresent);
    }
}