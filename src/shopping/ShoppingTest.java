package shopping;

import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Mouse;
import utilities.Utility;

public class ShoppingTest extends Utility {
    String baseUrl = " https://mobile.x-cart.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void ThatUserShouldPlaceOrderSuccessfullyForOllieTheAppControlledRobot() throws InterruptedException {
        //Mouse hover on the “Hot deals” link
        mouseHover(By.xpath("//div[@id='header-area']//span[contains(text(),'Hot deals')]"));
        //Mouse hover on the “Bestsellers”  link and click
        mouseHoverClick(By.xpath("//div[@id='header-area']//span[contains(text(),'Bestsellers')]"));
        //Verify the text “Bestsellers”
        verifyText("Bestsellers", "Bestsellers", "Text not Verified");
        getTextFromElement(By.xpath("//h1[@id='page-title']"));
        //Mouse hover on “Sort By” and select “Name A-Z”
        mouseHover(By.xpath("//span[@class='sort-by-label']"));
        mouseHoverClick(By.xpath("//a[@data-sort-by='translations.name' and @data-sort-order='asc']"));
        //Click on “Add to cart” button of the product “Ollie - The App Controlled Robot”
        clickOnElement(By.xpath("//button[contains(@class,'regular-button add-to-cart product-add2cart productid-30')]//span[contains(text(),'Add to cart')]"));
        // Verify the message “Product has been added to your cart” display in  green bar
        verifyText("Product has been added to your cart", "Product has been added to your cart", "Wrong message");
        getTextFromElement(By.xpath("//li[contains(text(),'Product has been added to your cart')]"));
        //Click on X sign to close the message
        clickOnElement(By.xpath("//a[@class='close']"));
        // Click on “Your cart” icon and Click on “View cart”
        clickOnElement(By.xpath("//div[@class='minicart-items-number']"));
        clickOnElement(By.xpath("//a[@class='regular-button cart']"));
        //Verify the text “Your shopping cart - 1 item”
        verifyText("Your shopping cart - 1 item", "Your shopping cart - 1 item", "Wrong message");
        getTextFromElement(By.xpath("//h1[@id='page-title']"));
        // Verify the Subtotal $99.00
        verifyText("Subtotal $399.00", "Subtotal $399.00", "Not match");
        getTextFromElement(By.xpath("//a[@class='regular-main-button checkout']"));
        //Verify the total $106.23
        verifyText("total $411.48", "total $411.48", "Not match");
        getTextFromElement(By.xpath("//span[contains(text(),'411')]"));
        //Click on “Go to checkout” button
        clickOnElement(By.xpath("//span[contains(text(),'Go to checkout')]"));
        //Verify the text “Log in to your account”
        verifyText("Log in to your account", "Log in to your account", "Error");
        getTextFromElement(By.xpath("//h3[contains(text(),'Log in to your account')]"));
        //Enter Email address
        sendTextToElement(By.xpath("//input[@id='email']"), "abc@yahoo.com");
        //Click on “Continue” Button
        clickOnElement(By.xpath("//span[contains(text(),'Continue')]"));
        //Verify the text “Secure Checkout”
        verifyText("Secure Checkout", "Secure Checkout", "Error");
        getTextFromElement(By.xpath("//h1[@class='title']"));
        //Fill all the mandatory fields
        sendTextToElement(By.xpath("//input[@id='shippingaddress-firstname']"), "Nathan");
        sendTextToElement(By.xpath("//input[@id='shippingaddress-lastname']"), "Simon");
        sendTextToElement(By.xpath("//input[@id='shippingaddress-street']"), "90,Casiobury Close");
        sendTextToElement(By.xpath("//input[@id='shippingaddress-city']"), "Cardiff");
        sendTextToElement(By.xpath("//select[@id='shippingaddress-country-code']"), "TW3 8YK");
        sendTextToElement(By.xpath("//input[@id='shippingaddress-custom-state']"), "Wales");
        sendTextToElement(By.xpath("//input[@id='shippingaddress-zipcode']"), "90007");
        sendTextToElement(By.xpath("//input[@id='email']"), "abc@yahoo.com");
        //Check the check box “Create an account for later use”
        clickOnElement(By.xpath("//input[@id='create_profile']"));
        //Enter the password
        sendTextToElement(By.xpath("//input[@id='password']"), "test123");
        //Select the Delivery Method to “Local Shipping”
        clickOnElement(By.xpath("//input[@id='method128']"));
        //Select Payment Method “COD”
        clickOnElement(By.xpath("//input[@id='pmethod6']"));
        //Verify the total $99.00




   /*
1.22
1.23 Click on “Place Order” Button
1.24 Verify the text “Thank you for your order”

 */
    }

    @Test
    public void UserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        //Mouse hover on the “Hot deals” link
        mouseHover(By.xpath("//div[@id='header-area']//span[contains(text(),'Hot deals')]"));
        //		1.2 Mouse hover on the “Bestseller”  link and click
        mouseHoverClick(By.xpath("//div[@id='header-area']//span[contains(text(),'Bestsellers')]"));
        //1.3 Verify the text “Bestsellers”
        verifyText("Bestsellers", "Bestsellers", "Text not Verified");
        getTextFromElement(By.xpath("//h1[@id='page-title']"));
        //	1.4 Mouse hover on “Sort By” and select “Name A-Z”
        mouseHover(By.xpath("//span[contains(text(),'Sort by:')]"));
        mouseHoverClick(By.xpath("//a[@data-sort-by='translations.name' and @data-sort-order='asc']"));
        //		1.5 Click on “Add to cart” button of the product “Vinyl Idolz: Ghostbusters”
        scrolldown(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[9]/div[1]/div[2]/div[4]/div[1]/button[1]"));
        clickOnElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[9]/div[1]/div[2]/div[4]/div[1]/button[1]"));

        //Verify the message “Product has been added to your cart” display in  green bar
        verifyText("Product has been added to your cart", "Product has been added to your cart", "Error");
        getTextFromElement(By.xpath("//li[contains(text(),'Product has been added to your cart')]"));
        // Click on X sign to close the message
        clickOnElement(By.xpath("//a[@class='close']"));
        //1.8 Click on “Your cart” icon and Click on “View cart” button
        clickOnElement(By.xpath("//div[@class='lc-minicart lc-minicart-horizontal collapsed recently-updated']"));
        clickOnElement(By.xpath("//span[contains(text(),'View cart')]"));
//        clickOnElement(By.xpath("//div[@title='Your cart']"));
//        clickOnElement(By.xpath("//span[contains(text(),'View cart')]"));
        //1.9 Verify the text “Your shopping cart - 1 item”
        verifyText("Your shopping cart - 1 item", "Your shopping cart - 1 item", "Error");
        getTextFromElement(By.xpath("//h1[@id='page-title']"));
        //Click on “Empty your cart” link
        clickOnElement(By.xpath("//a[contains(text(),'Empty your cart')]"));
        //Click “Ok” on alert
        acceptAlert();
        //Verify the text “Are you sure you want to clear your cart?” on alert


//Verify the message “Item(s) deleted from your cart”
        verifyText("Item(s) deleted from your cart", "Item(s) deleted from your cart", "Error in message");
        getTextFromElement(By.xpath(" //li[contains(text(),'Item(s) deleted from your cart')]"));
        //Verify the text “Your cart is empty”
        verifyText("Your cart is empty", "Your cart is empty", "Text not Verified");
        getTextFromElement(By.xpath("//h1[@id='page-title']"));
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}








