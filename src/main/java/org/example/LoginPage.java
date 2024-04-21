package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils
{
    public void enterLoginDetails()
    {
        // Type Email
        typeText(By.id("Email"),"nimesh"+randomDate()+"@gmail.com");
        // Type Password
        typeText(By.id("Password"),"1234567");
        //Click on Login Button
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
    }

}
