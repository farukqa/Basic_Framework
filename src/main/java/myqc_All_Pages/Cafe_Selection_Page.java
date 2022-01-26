package myqc_All_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Cafe_Selection_Page {
    // constructor that will be automatically called as soon as the object of the class is created
    WebDriver driver;

    public Cafe_Selection_Page(WebDriver driver) {
        this.driver = driver;
    }
    //*[@id="stores-available"]/li[1]/div[1]/h2

    // locator for the Cafeteria
    @FindBy(how = How.XPATH, using = "//*[@id=\"stores-available\"]/li[1]/div[2]/img")
    public static WebElement cafe1;

    // Method to click the login button
    public void clickOnlineOrdering() {
        cafe1.click();

    }
}

