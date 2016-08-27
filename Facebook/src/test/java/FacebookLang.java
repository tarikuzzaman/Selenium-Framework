import New.FacebookBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by PlayBoy on 8/23/16.
 */
public class FacebookLang extends FacebookBase {
    @Test
    public void test() throws InterruptedException {
        //driver.findElement(By.cssSelector("._42ft._4jy0._517i._517h._51sy._5f0v")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("User");
        driver.findElement(By.cssSelector("#pass")).sendKeys("1239hfkwfvr94782udjcba,ll");
        driver.findElement(By.cssSelector("#u_0_n")).click();


        Thread.sleep(2000);
        //driver.findElement(By.cssSelector("#js_d")).click();

    }
}
