package org.example;

import org.openqa.selenium.By;

public class ReferAProductToFriend extends Utils
{
    public void referProductToFriend()
    {
        // click on product to refer
        clickOnElement(By.xpath("//img[@title='Show details for Apple MacBook Pro 13-inch']"));
        // Click on email friend
        clickOnElement(By.xpath("//button[@class='button-2 email-a-friend-button']"));
        // Entre the friend email
        typeText(By.xpath("//input[@id='FriendEmail']"), "ddss@gmail.com");
        // Click on send email button
        clickOnElement(By.xpath("//button[@class='button-1 send-email-a-friend-button']"));
    }
}
