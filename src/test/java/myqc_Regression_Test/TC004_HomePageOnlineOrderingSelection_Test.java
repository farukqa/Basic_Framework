package myqc_Regression_Test;

import myqc_All_Pages.MYQC_Home_Page;
import myqc_All_Pages.MYQC_Login_Page;
import myqc_Reusable_Classes.MYQC_Base_Class;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class TC004_HomePageOnlineOrderingSelection_Test extends MYQC_Base_Class {

    @Test
    public void loginToMYQC() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        MYQC_Home_Page home_page = PageFactory.initElements(driver, MYQC_Home_Page.class);
        home_page.clickOnlineOrdering();
    }
}

