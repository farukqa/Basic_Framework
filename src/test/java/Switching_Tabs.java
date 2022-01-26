import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

interface I1{}
interface I2{}


final class C1 implements I1{}
class C2 implements I2{}
public class Switching_Tabs{

    public static void main(){
        C1 o1 = new C1();
        C2 o2 = new C2();
        Integer o3 = 4;

     //   I2 y = (I2)o1; //compiler complains here !!
      //  I2 x = (I2)o1; //compiler complains too
    }

}


/*public class Switching_Tabs {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\fhasan\\Desktop\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.get("https://mmhcustfour.mmhcloud.com/myqc/#logout-page");
        //driver.navigate().to("https://mmhcustfour.mmhcloud.com/myqc/#logout-page");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement button = driver.findElement(By.id("logoutMyQCLink"));
        button.getText();
        File image = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //Now the file needs to be pasted in a location to be seen. We can a define a path from intelliJ ana a file format to save the image
        String path = "C:\\Users\\fhasan\\eclipse-workspace\\Basic Framework\\src\\test\\Screenshots";
        String imageName = "PreLogin"+".jpeg";
        FileUtils.copyFile(image,new File(path+imageName));

        ((JavascriptExecutor)driver).executeScript("window.open('https://mmhcustfour.mmhcloud.com/myqc/#main')");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        driver.switchTo().window(tabs.get(0));

*/





 //   }
//}

