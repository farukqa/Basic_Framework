package myqc_All_Pages;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MYQC_Login_Page {
    // constructor that will be automatically called as soon as the object of the class is created
    WebDriver driver;
    public MYQC_Login_Page(WebDriver driver) {
        this.driver = driver;
    }

    // locator for the username
    @FindBy(how = How.ID, using = "loginName")
    public static WebElement username;

    // locator for the username
    @FindBy(how = How.ID, using = "loginPassword")
    public static WebElement password;

    // locator for the login button
    @FindBy(how = How.ID, using = "loginButton")
    public static WebElement loginButton;

    // Method to send info in the log in field
    public void username(String text) {
        username.sendKeys(text);

    }
    // Method to send password
    public void password(String text) {
        password.sendKeys(text);

    }
    // Method to click the login button
    public void clickLogin() {
        loginButton.click();


    }

}

