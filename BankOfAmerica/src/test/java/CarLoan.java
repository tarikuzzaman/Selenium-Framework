import BoA.BankOfAmericaLogin;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by tzaman on 8/24/16.
 */
public class CarLoan extends BankOfAmericaLogin {
    @Test
    public void test() throws InterruptedException {
        driver.findElement(By.cssSelector("#nav-search-query")).sendKeys("Auto Loan");
        driver.findElement(By.cssSelector("#submit track-me")).click();


        Thread.sleep(3000);
    }
}