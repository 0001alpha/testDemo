package test;

import functionLibraries.CommonFunctions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class LogIn extends CommonFunctions {

    @Before
    public void beforeTest(){
        openBrowser();
        wait(driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")));
        WebElement closePopup = driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button"));
        closePopup.click();

    }


    @Test
    public void LogInWithValidDetails() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='component__Username-sc-4hkj4z-3 kMUqdT']")).click();
        driver.findElement(By.cssSelector("#EmailOrAccountNumber")).sendKeys("amritamalik.b@gmail.com");
        driver.findElement(By.cssSelector("#Password")).sendKeys("pw123Ac89");
   //     driver.findElement(By.cssSelector("#SignInNow")).click();


        WebElement passwordElement = driver.findElement(By.cssSelector("#SignInNow"));
        passwordElement.sendKeys("pw123Ac89");
        sleep(2000);

        passwordElement.submit();
        sleep(2000);

    }

    @After
    public void afterTest(){

    }

}
