package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class DashboardPage {

    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By dashboardTitle = By.xpath("//h6[contains(text(), 'Dashboard')]");
    By navigationMenu = By.xpath("//nav[@class='oxd-navbar']");
    By dashboardWidgets = By.xpath("//div[@class='orangehrm-dashboard-widget']");
    By adminLink = By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");
    By pimLink = By.xpath("//a[@href='/web/index.php/pim/viewPimModule']");
    By leaveLink = By.xpath("//a[@href='/web/index.php/leave/viewLeaveModule']");
    By userProfile = By.xpath("//img[@alt='profile picture']");
    By logout = By.xpath("//a[contains(text(), 'Logout')]");

    /**
     * Verify if dashboard page is loaded
     */
    public boolean isDashboardLoaded() {
        try {
            WebElement element = driver.findElement(dashboardTitle);
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Verify if navigation menu is visible
     */
    public boolean isNavigationMenuVisible() {
        try {
            return driver.findElement(navigationMenu).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Get count of dashboard widgets
     */
    public int getDashboardWidgetCount() {
        List<WebElement> widgets = driver.findElements(dashboardWidgets);
        return widgets.size();
    }

    /**
     * Click on Admin menu
     */
    public void clickAdminMenu() {
        driver.findElement(adminLink).click();
    }

    /**
     * Click on PIM (Employee) menu
     */
    public void clickPIMMenu() {
        driver.findElement(pimLink).click();
    }

    /**
     * Click on Leave menu
     */
    public void clickLeaveMenu() {
        driver.findElement(leaveLink).click();
    }

    /**
     * Click on user profile
     */
    public void clickUserProfile() {
        driver.findElement(userProfile).click();
    }

    /**
     * Logout from application
     */
    public void logout() {
        clickUserProfile();
        driver.findElement(logout).click();
    }

    /**
     * Get dashboard title
     */
    public String getDashboardTitle() {
        return driver.findElement(dashboardTitle).getText();
    }
}
