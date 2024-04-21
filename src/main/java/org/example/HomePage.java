package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils
{
    public void clickOnRegisterButton()
    {
        // click On Register
        clickOnElement(By.className("ico-register"));
    }
    public void clickOnLoginButton()
    {
        // Click On Login
        clickOnElement(By.className("ico-login"));
    }
}