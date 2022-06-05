package test;

import functionLibraries.CommonFunctions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FavouriteTest  extends CommonFunctions {

    @Before
    public void beforeTest(){
        openBrowser();
    }

    @Test
    public void verifyFavouritesWithNoProduct(){
        wait(driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")));
        WebElement closePopup = driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button"));
        //wait.until(ExpectedConditions.visibilityOf(closePopup));
        closePopup.click();

        wait(driver.findElement(By.xpath("//*[@id=\"meganav-link-1\"]/div")));
        Actions actions = new Actions(driver);
        WebElement menMenu = driver.findElement(By.xpath("//*[@id=\"meganav-link-1\"]/div"));
        actions.moveToElement(menMenu).build().perform();

    }

    /*
    @Test
    public void verifyFavouritesPageWithPdt(){

    }
    */
    @After
    public void afterTest(){
     //closeBrowser();
    }
}
