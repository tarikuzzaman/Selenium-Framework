import New.FacebookBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by PlayBoy on 8/23/16.
 */
public class FacebookLogin extends FacebookBase {
    @Test
    public void test1(){
        driver.findElement(By.cssSelector("#email")).sendKeys("User");
        driver.findElement(By.cssSelector("#pass")).sendKeys("jfwbywetrgf2465784921");
        driver.findElement(By.cssSelector("#u_0_n")).click();
    }
}
