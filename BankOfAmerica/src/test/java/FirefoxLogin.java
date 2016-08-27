import BoA.BankOfAmericaLogin;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by tzaman on 8/24/16.
 */
public class FirefoxLogin extends BankOfAmericaLogin {
    @Test
    public void test() throws InterruptedException {
        driver.findElement(By.cssSelector("#onlineId1")).sendKeys("User");
        driver.findElement(By.cssSelector("#passcode1")).sendKeys("1234567890");
        driver.findElement(By.cssSelector("#hp-sign-in-btn")).click();


        Thread.sleep(3000);
    }
}
