package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils
{
    //Create Object For BrowserManager Class
    BrowserManager browserManager = new BrowserManager();

    @BeforeMethod // Create Annotation
    public void setup()
    {
        browserManager.openBrowser();
    }

    @AfterMethod // Create Annotation
    public void tearDown()
    {
        //browserManager.closeBrowser();
    }
}
