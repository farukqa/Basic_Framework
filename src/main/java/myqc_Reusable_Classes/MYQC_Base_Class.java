package myqc_Reusable_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class MYQC_Base_Class {
    public static WebDriver driver = null;


    @BeforeSuite()

    public static WebDriver initilizeDriver() throws IOException {

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\fhasan\\eclipse-workspace\\Basic Framework\\src\\main\\java\\myqc_Reusable_Classes\\data.properties");
        prop.load(fis);
        String browserName = prop.getProperty("browser");

        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\fhasan\\Desktop\\driver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            //add the precondition arguments
            options.addArguments("start-maximized", "incognito");
            driver = new ChromeDriver(options);
            // Implicit wait
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\fhasan\\Desktop\\driver\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }

        return driver;

    }
   // @BeforeSuite
  //  public static void before(){
      //  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  //  }
  // @AfterSuite
  //   public void closeBrowser(){
   //     driver.close();
  //   }



    //assert method is defined here

    public static void assertTest(String actual, String real) {
        Assert.assertEquals(actual, real);


    }

}


