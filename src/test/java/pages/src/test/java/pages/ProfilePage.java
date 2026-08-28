package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {

    WebDriver driver;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By profileTitle = By.xpath("//h6[contains(text(), 'Personal Details')]");
    By firstName = By.xpath("//input[@name='firstName']");
    By lastName = By.xpath("//input[@name='lastName']");
    By email = By.xpath("//input[@name='email']");
    By phone = By.xpath("//input[@name='phone']");
    By saveButton = By.xpath("//button[@type='submit'][contains(., 'Save')]");
    By successMessage = By.xpath("//div[@class='oxd-toast oxd-toast--success']");
    By profileImage = By.xpath("//img[@class='profile-pic']");
    By uploadButton = By.xpath("//input[@type='file']");
    By changePasswordLink = By.xpath("//a[contains(text(), 'Change Password')]");

    /**
     * Verify if profile page is loaded
     */
    public boolean isProfilePageLoaded() {
        try {
            return driver.findElement(profileTitle).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Get first name value
     */
    public String getFirstName() {
        return driver.findElement(firstName).getAttribute("value");
    }

    /**
     * Get last name value
     */
    public String getLastName() {
        return driver.findElement(lastName).getAttribute("value");
    }

    /**
     * Get email value
     */
    public String getEmail() {
        return driver.findElement(email).getAttribute("value");
    }

    /**
     * Get phone value
     */
    public String getPhone() {
        return driver.findElement(phone).getAttribute("value");
    }

    /**
     * Update first name
     */
    public void updateFirstName(String firstNameValue) {
        WebElement firstNameField = driver.findElement(firstName);
        firstNameField.clear();
        firstNameField.sendKeys(firstNameValue);
    }

    /**
     * Update last name
     */
    public void updateLastName(String lastNameValue) {
        WebElement lastNameField = driver.findElement(lastName);
        lastNameField.clear();
        lastNameField.sendKeys(lastNameValue);
    }

    /**
     * Update phone
     */
    public void updatePhone(String phoneValue) {
        WebElement phoneField = driver.findElement(phone);
        phoneField.clear();
        phoneField.sendKeys(phoneValue);
    }

    /**
     * Save profile changes
     */
    public void saveProfile() {
        driver.findElement(saveButton).click();
    }

    /**
     * Verify if success message is displayed
     */
    public boolean isSuccessMessageDisplayed() {
        try {
            WebElement message = driver.findElement(successMessage);
            return message.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Get success message text
     */
    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }

    /**
     * Click on change password link
     */
    public void clickChangePasswordLink() {
        driver.findElement(changePasswordLink).click();
    }

    /**
     * Verify if profile image is displayed
     */
    public boolean isProfileImageDisplayed() {
        try {
            return driver.findElement(profileImage).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
