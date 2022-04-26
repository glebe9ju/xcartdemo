package homepage;

import com.beust.ah.A;
import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToShippingPageSuccessfully() {
        //Click on the “Shipping” link
        clickOnElement(By.xpath("//div[@id='header-area']//span[contains(text(),'Shipping')]"));
        //Verify the text “Shipping”
        String actualText = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        String expectedText = "Shipping";
        Assert.assertEquals("Wrong contaxt",expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToNewPagesuccessfully() {
        // Click on the “New!” link
        clickOnElement(By.xpath("//div[@id='header-area']//span[contains(text(),'New')]"));
        // Verify the text “New arrivals”
        String actualText = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        String expectedText = "New arrivals";
        Assert.assertEquals("Wrong Spelling", expectedText, actualText);
    }
        @Test
         public void  UserShouldNavigateToComingsoonPageSuccessfully(){
           // Click on the “Coming soon” link
        clickOnElement(By.xpath("//div[@id='header-area']//span[contains(text(),'Coming soon')]"));
            //Verify the text “Coming soon”
            String actualText = getTextFromElement(By.xpath("//h1[@id='page-title']"));
            String expectedText = "Coming soon";
            Assert.assertEquals("Wrong Title",expectedText,actualText);
        }
       @Test
        public void UserShouldNavigateToContactUsPageSuccessfully(){
       // Click on the “Contact us” link
           clickOnElement(By.xpath("//div[@id='header-area']//span[contains(text(),'Contact us')]"));
        //4.2 Verify the text “Contact us”
           String actualText = getTextFromElement(By.xpath("//h1[@id='page-title']"));
           String expectedText = "Contact us";
           Assert.assertEquals("Wrong Title", expectedText,actualText);
    }
    @After
    public void tearDown() {
        // closeBrowsers();
    }
}