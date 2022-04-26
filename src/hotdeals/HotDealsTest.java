package hotdeals;

import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;
import utilities.Utility;

public class HotDealsTest extends Utility {
    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void SaleProductsArrangeAlphabetically() throws InterruptedException {
        // Mouse hover on the “Hot deals” link
        // mouseHover(By.xpath("//div[@id='header-area']//span[@class='primary-title']"));
        mouseHover(By.xpath("//div[@id='header-area']//span[contains(text(),'Hot deals')]"));
        Thread.sleep(2000);
        // Mouse hover on the “Sale”  link and click
        mouseHover(By.xpath("//div[@id='header-area']//span[contains(text(),'Sale')]"));
        //Thread.sleep(2000);
        //Verify the text “Sale”
        verifyText("Sale","Sale","Wrong text");
        getTextFromElement(By.xpath("//h1[@id='page-title']"));
        // Mouse hover on “Sort By” and select “Name A-Z”
        mouseHover(By.xpath("//span[@class='sort-by-label']"));
        mouseHover(By.xpath("//a[normalize-space()='Name A - Z']"));
        //Verify that the product arrange alphabetically
        String actualMsg = getTextFromElement(By.xpath("//a[normalize-space()='Name A - Z']"));
        verifyText("\n" + "       Name A - Z", actualMsg, "Not in alphabetical order");
    }
    @Test
    public void SaleProductsPriceArrangeLowToHigh() throws InterruptedException {
        //Mouse hover on the “Hot deals” link
        mouseHover(By.xpath("//div[@id='header-area']//span[contains(text(),'Hot deals')]"));
        Thread.sleep(2000);
        //Mouse hover on the “Sale”  link and click
        mouseHover(By.xpath("//div[@id='header-area']//span[contains(text(),'Sale')]"));
        Thread.sleep(2000);
        //Verify the text “Sale”
//        verifyText("Sale","Sale","Wrong message");
//        getTextFromElement(By.xpath("//h1[@id='page-title']"));
        //Verify the text “Sale”
        String actualMessage = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        verifyText("Sale", actualMessage, "Not matched with original text");
        //Mouse hover on “Sort By” and select “Price Low-High”
        mouseHover(By.xpath("//span[@class='sort-by-label']"));
        mouseHover(By.xpath("//a[normalize-space()='Price Low - High']"));
        //Verify that the product’s price arrange Low to High
        String actualMsg = getTextFromElement(By.xpath("//span[contains(text(),'Name A - Z')]"));
        verifyText("Name A - Z", actualMsg, "Not in alphabetical order");
    }

    @Test
    public void SaleProductsArrangeByRates() throws InterruptedException {
        // Mouse hover on the “Hot deals” link
        mouseHover(By.xpath("//div[@id='header-area']//span[contains(text(),'Hot deals')]"));
        Thread.sleep(2000);
        // Mouse hover on the “Sale”  link and click
        mouseHover(By.xpath("//div[@id='header-area']//span[contains(text(),'Sale')]"));
        // Verify the text “Sale”
        verifyText("Sale","Sale","Wrong message");
        String actualMessage = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        //Mouse hover on “Sort By” and select “Rates”
        mouseHover(By.xpath("//span[@class='sort-by-label']"));
        mouseHover(By.xpath("//a[normalize-space()='Rates']"));
        //Verify that the product’s arrange Rates
        verifyText("Rates", "Rates", "Wrong Tab");
        String actualMessage1 = getTextFromElement(By.xpath("//span[contains(text(),'Rates')]"));
    }

    @Test
    public void BestSellersProductsArrangeByZToA() throws InterruptedException {
        //Mouse hover on the “Hot deals” link
        mouseHover(By.xpath("//div[@id='header-area']//span[contains(text(),'Hot deals')]"));
        Thread.sleep(2000);
        //Mouse hover on the “Bestsellers”  link and click
        mouseHover(By.xpath("//div[@id='header-area']//span[contains(text(),'Bestseller')]"));
        mouseHoverClick(By.xpath("//div[@id='header-area']//span[contains(text(),'Bestseller')]"));
        //Verify the text “Bestsellers”
        verifyText("Bestsellers", "Bestsellers", "match with original text");
        getTextFromElement(By.xpath("//div[@id='header-area']//span[contains(text(),'Bestseller')]"));
        //Mouse hover on “Sort By” and select “Name Z-A”
        mouseHover(By.xpath("//span[@class='sort-by-label']"));
        mouseHoverClick(By.xpath("//a[@data-sort-by='translations.name' and @data-sort-order='desc']"));
        verifyText("Name Z-A", "Name Z-A", "Wrong order");
        getTextFromElement(By.xpath("span[contains(text(),'Name Z-A']"));
    }
    @Test
    public void BestSellersProductsPriceArrangeHighToLow()throws InterruptedException{
       // Mouse hover on the “Hot deals” link
        mouseHover(By.xpath("//div[@id='header-area']//span[contains(text(),'Hot deals')]"));
        Thread.sleep(2000);
        //Mouse hover on the “Bestsellers” link and click
        mouseHover(By.xpath("//div[@id='header-area']//span[contains(text(),'Bestseller')]"));
        mouseHoverClick(By.xpath("//div[@id='header-area']//span[contains(text(),'Bestseller')]"));
        //Verify the text “Bestsellers”
        verifyText("Bestsellers", "Bestsellers", "match with original text");
        getTextFromElement(By.xpath("//div[@id='header-area']//span[contains(text(),'Bestseller')]"));
        // Mouse hover on “Sort By” and select “Price High-Low”
        mouseHover(By.xpath("//span[@class='sort-by-label']"));
        mouseHoverClick(By.xpath("//a[@data-sort-by='p.price' and @data-sort-order='desc']"));
        // Verify that the product arrange by Price High-Low
        verifyText("Price High-Low", "Price High-Low", "Not in order");
        getTextFromElement(By.xpath("//a[@data-sort-by='p.price' and @data-sort-order='desc']"));
    }
    @Test
    public void BestSellersProductsArrangeByRates()throws InterruptedException{
        //Mouse hover on the “Hot deals” link
        mouseHover(By.xpath("//div[@id='header-area']//span[contains(text(),'Hot deals')]"));
        Thread.sleep(2000);
        //Mouse hover on the “Bestsellers”  link and click
        mouseHover(By.xpath("//div[@id='header-area']//span[contains(text(),'Bestsellers')]"));
        clickOnElement(By.xpath("//div[@id='header-area']//span[contains(text(),'Bestsellers')]"));
        //Verify the text “Bestsellers”
        verifyText("Bestsellers", "Bestsellers", "Text not Verified");
        getTextFromElement(By.xpath("//h1[@id='page-title']"));
        //Mouse hover on “Sort By” and select “Rates”
        mouseHover(By.xpath("//span[@class='sort-by-label']"));
        mouseHoverClick(By.xpath("//a[@data-sort-by='r.rating' and @data-sort-order='asc']"));
        // Verify that the product arrange by Rates
        verifyText("Rates", "Rates", "Not in order");
        getTextFromElement(By.xpath("//span[contains(text(),'Rates')]"));
    }
    @After
    public void tearDown() {
        // closeBrowsers();
    }
    }






