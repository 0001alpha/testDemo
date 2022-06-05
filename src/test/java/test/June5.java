package test;

import functionLibraries.CommonFunctions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

import java.security.Key;
import java.util.Iterator;
import java.util.Set;

public class June5  extends CommonFunctions {

    @Before
    public void beforeTest(){
        openBrowser();
        wait(driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")));
        WebElement closePopup = driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button"));
        closePopup.click();
    }

    @Test
    public void test(){
//sending two keys together e.g. sending capital letters
     Actions a = new Actions(driver);
     a.moveToElement(driver.findElement(By.xpath("//*[@id=\"header-search-form\"]/button"))).click().keyDown(Keys.SHIFT).sendKeys("hello"+"\n").build().perform();

     /*
//going from window to a newly opened window/tab
    //we need how many windows/tabs are opened  (index 0 will be current window and 1 will be 2nd window
        //collecting them in a collection/set
        Set<String> windows = driver.getWindowHandles();
        //windows = {parentWindowDetails,childWindowDetails}
        Iterator<String> it =windows.iterator();
        String parentID = it.next();
        String childID = it.next();
        driver.switchTo().window(childID);

        //coming back to parent window
        driver.switchTo().window(parentID);

//Frames

*/
    }

    @After
    public void afterTest(){
        //closeBrowser();
    }
}
