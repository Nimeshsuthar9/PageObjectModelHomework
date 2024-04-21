package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils
{
    public void enterRegisterDetails()
    {
        // choose male or female
        clickOnElement(By.id("gender-male"));

        // Type first name
        typeText(By.id("FirstName"), "Nimesh");

        // Type last name
        typeText(By.id("LastName"), "Suthar");

        // Type email
        typeText(By.id("Email"), "nimesh"+randomDate()+"@gmail.com");

        //Select Date From Date of Birth By Using Select By Visible Text
        selectByVisibleText(By.name("DateOfBirthDay"),"9");
        //Select Month From Date Of Birth By Using SelectByValue
        selectByValue(By.name("DateOfBirthMonth"),"12");
        //Select Year From Date Of Birth By Using SelectByIndex
        selectByIndex(By.name("DateOfBirthYear"),86);

        // Type password
        typeText(By.id("Password"), "1234567");

        // Type confirm password
        typeText(By.id("ConfirmPassword"), "1234567");

        // click on Register button
        clickOnElement(By.id("register-button"));

    }
}
