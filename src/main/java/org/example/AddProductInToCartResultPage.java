package org.example;

import junit.framework.Assert;
import org.openqa.selenium.By;

public class AddProductInToCartResultPage extends Utils
{
    String expectedNameOfProduct = "Build your own computer";
    public void VerifyProductNameIsSameAsYouAddProductInToCart()
    {
        String actual = getTextFromElement(By.className("product-name"));
        Assert.assertEquals(getTextFromElement(By.className("product-name")),expectedNameOfProduct);
    }
}
