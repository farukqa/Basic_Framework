package myqc_Regression_Test;

import myqc_All_Pages.Cafe_Selection_Page;
import myqc_All_Pages.MYQC_Home_Page;
import myqc_Reusable_Classes.MYQC_Base_Class;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC005_Cafe_Home_Page_Test extends MYQC_Base_Class {

    @Test
    public void loginToMYQC() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Cafe_Selection_Page cafe_home = PageFactory.initElements(driver,Cafe_Selection_Page.class);
        cafe_home.clickOnlineOrdering();
    }
}

