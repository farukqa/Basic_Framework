package myqc_Regression_Test;

import myqc_All_Pages.MYQC_Pre_Login_Page;
import myqc_Reusable_Classes.MYQC_Base_Class;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC002_MYQC_Login_Selection_Test extends MYQC_Base_Class {


    @Test
    public void Go_To_MYQC_Login_Page_Test() throws InterruptedException, IOException {
        //driver = initilizeDriver();
        //creating anb object of the CUST4_MYQC_Login_Selection_Page
        MYQC_Pre_Login_Page go_To_MYQC_Page = PageFactory.initElements(driver, MYQC_Pre_Login_Page.class);
        //Clicking on the button to go to the MYQC login page
        go_To_MYQC_Page.preClickLogin();


    }

}


