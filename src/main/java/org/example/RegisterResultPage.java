package org.example;

import junit.framework.Assert;
import org.openqa.selenium.By;

public class RegisterResultPage extends Utils
{
    String expectedResultMessage = "Your registration completed";
    public void verifyRegisterMessage()
    {
        sleep(1);
        String actual = getTextFromElement(By.className("result"));
      Assert.assertEquals(getTextFromElement(By.className("result")),expectedResultMessage);
    }
}
