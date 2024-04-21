package org.example;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Utils extends BasePage
{
    //Create New Click On Element Method For Reusability
    public void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }
    // Create new Type Text  method for Reusability
    public static void typeText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }
    // Create new To Get Text From Element  method for Reusability
    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }
    // Create new Get Date and Time method for Reusability
    public static String randomDate()
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhmm");
        Date date = new Date();
        return dateFormat.format(date);
    }
    //Create New Select By Visible Text Method For DropDown list For Reusability
    public static void selectByVisibleText(By by, String text)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    //Create New Select By Value Method For DropDown list For Reusability
    public static void selectByValue(By by,String text)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }
    //Create New Select By Index Method For DropDown list For Reusability
    public static void selectByIndex(By by,int index)
    {
        Select select =new Select(driver.findElement(by));
        select.selectByIndex(index);
    }
    //Create Implicit Wait Method For Reusability
    public static void  implicitWaitMethod()
    {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }
    //Create Explicit Wait Method For Reusability
    public static void explicitWaitMethod(By by)
    {
        WebElement driverWait = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(by));
    }
    //Create Sleep Method For Reusability
    public static void sleep(int time)
    {
        try
        {
            Thread.sleep(time*10);

        }
        catch (InterruptedException e)
        {
            throw  new RuntimeException(e);
        }
    }
}
