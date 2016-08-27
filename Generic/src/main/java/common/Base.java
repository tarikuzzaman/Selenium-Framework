package common;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

/**
 * Created by PlayBoy on 8/23/16.
 */
public class Base {
    public WebDriver driver = null;
    @BeforeMethod
    @Parameters({"url","os"})
    public void setUp(String url, String os){
        if(os.equals("Mac")) {
                System.out.print("MAC");
                System.setProperty("webdriver.gecko.driver", "/Users/tzaman/Workspace/Tarikuz zaman/Generic/selenium-browser-driver/geckodriver");
        }
        else {


            System.setProperty("webdriver.gecko.driver", "C:/Users/rrt/workspace-July2016/WebApp-Automation/Generic/selenium-browser-driver/geckodriver.exe");

        }
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.navigate().to(url);
            driver.manage().window().maximize();

    }

    @AfterMethod
    public void cleanUp() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    public void clickByCss(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }
    public void typeByCss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }
    public void sleepFor(int sec)throws InterruptedException {
        Thread.sleep(sec * 1000);
    }
}
