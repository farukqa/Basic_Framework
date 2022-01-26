package myqc_All_Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MYQC_Home_Page {
    // constructor that will be automatically called as soon as the object of the class is created
    WebDriver driver;
    public MYQC_Home_Page(WebDriver driver) {
        this.driver = driver;
    }
    // locator for the Online Ordering option
    @FindBy(how = How.CSS, using = "#nav-order")
    public static WebElement online_Ordering;

    // Method to click the login button
    public void clickOnlineOrdering() {
        online_Ordering.click();


    }

}



