package utilities;

import browsertesting.BaseTest;
import com.beust.jcommander.internal.Nullable;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class Utility extends BaseTest {
    // This method will click on element
    public void clickOnElement(By by) {
        WebElement element = driver.findElement(by);
        element.click();
    }
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
    public void switchToAlert() {
        driver.switchTo().alert().accept();
    }
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }
    public void dropDown(By by) {
        WebElement dropdown = driver.findElement(by);
        Select select = new Select(dropdown);
    }
    public void selectByVisibleText(By by) {
        WebElement selectByVisibleText = driver.findElement(by);
        Select select = new Select(selectByVisibleText);
    }
    public void selectByVisibleTextFromDropDown() {
        WebElement dropdown1 = driver.findElement(By.name("country"));
        Select select1 = new Select(dropdown1);
    }
    public void mouseHoverClick(By by) throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement mouseHoover = driver.findElement(by);
        Thread.sleep(3000);
        actions.moveToElement(mouseHoover).click().build().perform();
    }

    public void mouseHover(By by) throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement mouseHoover = driver.findElement(by);
        Thread.sleep(3000);
        actions.moveToElement(mouseHoover).build().perform();
    }
    public void scrolldown (By by) throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement mouseScrollDown = driver.findElement(by);
        Thread.sleep(3000);
        actions.moveToElement(mouseScrollDown).build().perform();
    }
//    Alert alert = driver.switchTo().alert(); // Creating Alert object reference and switch to alert
//        System.out.println(alert.getText());
//        alert.accept(); // Accepting alert

    //
//    public void mouseHover(By by)throws InterruptedException
//    {
//        WebElement mouseHover =driver.findElement(by);
//        Actions action = new Actions(driver);
//        action.moveToElement(mouseHover).click().build().perform();
//    }
//    public void mouseHoverClick(By by) throws InterruptedException
//    {
//        Actions actions = new Actions(driver);
//        WebElement click = driver.findElement(by);
//        actions.moveToElement(click).click().build().perform();
//    }
    public void verifyText(String exceptedMessage, String actualMessage, @Nullable String errorMessage) {
        Assert.assertEquals(errorMessage == null ? "" : errorMessage, exceptedMessage, actualMessage);
    }
    public void selectbutton(By by){
        //WebElement selectbutton =
    }
}