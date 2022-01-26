
package myqc_Regression_Test;

import myqc_All_Pages.MYQC_Pre_Login_Page;
import myqc_Reusable_Classes.MYQC_Base_Class;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;



public class TC001_MYQC_Pre_Login_Button_Test extends MYQC_Base_Class {

    @Test
    public void MYQC_Pre_Login_Button_Text_Test() throws InterruptedException, IOException {
        // calling the method from the MYQC base class
        driver = initilizeDriver();
        //creating an object of the MYQC_Pre_Login_Selection_Page
        MYQC_Pre_Login_Page MYQC_Pre_Login_Page = PageFactory.initElements(driver, MYQC_Pre_Login_Page.class);
        //opening the MYQC application on the browser
        driver.get("https://mmhcustfour.mmhcloud.com/myqc/#main");
        assertTest(MYQC_Pre_Login_Page.setPreLoginButtonText(), "Login with Quickcharge Authentication");
    }
}



