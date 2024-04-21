package org.example;

import junit.framework.Assert;
import org.openqa.selenium.By;

public class ReferFriendResultPage extends Utils
{
    String expectedResultMessage = "Your message has been sent.";
    public void verifyReferMessage()
    {
        String actual = getTextFromElement(By.className("result"));
        Assert.assertEquals(getTextFromElement(By.className("result")),expectedResultMessage);
    }
}
