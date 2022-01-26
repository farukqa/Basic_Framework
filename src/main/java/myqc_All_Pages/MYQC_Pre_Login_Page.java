package myqc_All_Pages;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class MYQC_Pre_Login_Page {

    // constructor that will be automatically called as soon as the object of the class is created
    WebDriver driver;
    public MYQC_Pre_Login_Page(WebDriver driver) {
        this.driver = driver;
    }

    // locator for the login button
    @FindBy(how = How.LINK_TEXT, using = "Login with Quickcharge Authentication")
    public static WebElement preLoginButton;

    // Method to click the login button
    public void preClickLogin() {
        preLoginButton.click();

    }
    public String setPreLoginButtonText(){
        return preLoginButton.getText();


    }
}


