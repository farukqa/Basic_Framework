package myqc_Regression_Test;

import myqc_All_Pages.MYQC_Login_Page;
import myqc_Reusable_Classes.MYQC_Base_Class;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TC003_MYQC_Login_Test extends MYQC_Base_Class{

    @Test
    public void loginToMYQC() throws IOException {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        // Create an object of File Class to open xlsx file
        File file = new File("C:\\Users\\fhasan\\Desktop\\idPass.xlsx");
        // Create an object of FileInputStream class to read excel file
        FileInputStream fis = new FileInputStream(file);
        // Create a workbook instance that refers to .xlsx file
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        // Create a sheet object
        XSSFSheet sheet = wb.getSheet("Sheet1");
        // Create a row object to retrieve row at index 1
        XSSFRow row1 = sheet.getRow(1);
        //Create a cell object to retrieve cell at index 1
        XSSFCell cell1 = sheet.getRow(1).getCell(0);
        String id = cell1.getStringCellValue();
       XSSFCell cell = sheet.getRow(1).getCell(1);
        // save the cell info in a variable
        String pass = cell.getStringCellValue();
        System.out.println("The pass is: "+ pass);

//https://www.toolsqa.com/selenium-webdriver/excel-in-selenium/


        MYQC_Login_Page login_To_MYQC = PageFactory.initElements(driver, MYQC_Login_Page.class);
        login_To_MYQC.username(id);
        login_To_MYQC.password(pass);
        login_To_MYQC.clickLogin();


    }

}

