package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLoginTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("Admin", "admin123");

        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains("OrangeHRM"));
    }
}
