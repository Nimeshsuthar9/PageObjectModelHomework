package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest
{
  // Create Object For Home Page Class
  HomePage homePage = new HomePage();
  // Create Object For Register Page Class
  RegisterPage registerPage = new RegisterPage();
  // Create Object For Register Result Message Class
  RegisterResultPage registerResultPage = new RegisterResultPage();
  // Create Object For Login Page Class
  LoginPage loginPage = new LoginPage();
  // Create Object For Refer to Friend Page Class
  ReferAProductToFriend referAProductToFriend = new ReferAProductToFriend();
  // Create Object For Refer Product Result Message Class
  ReferFriendResultPage referFriendResultPage = new ReferFriendResultPage();
  // Create Object For Add Product In To Cart And Check Page Class
  AddProductInToCartAndCheckPage addProductInToCartAndCheckPage = new AddProductInToCartAndCheckPage();
    // Create Object For Add Product Into Cart Result Page Class
  AddProductInToCartResultPage addProductInToCartResultPage = new AddProductInToCartResultPage();

  @Test
  public void verifyUserShouldAbleToRegisterSuccessfully()
  {
    // click on register button
    homePage.clickOnRegisterButton();
    // Enter Registration Details
    registerPage.enterRegisterDetails();
    // Verify User Register Successfully
    registerResultPage.verifyRegisterMessage();
  }
  @Test
  public void verifyRegisterUserCanReferProduct() {
    // click on register button
    homePage.clickOnRegisterButton();
    // Enter Registration Details
    registerPage.enterRegisterDetails();
    // Verify User Register Successfully
    registerResultPage.verifyRegisterMessage();
    // Click On Login Button
    homePage.clickOnLoginButton();
    // Enter Username And Password For Login
    loginPage.enterLoginDetails();
    // click on product to refer
    referAProductToFriend.referProductToFriend();
    // Verify User is Able to Verify Product
    referFriendResultPage.verifyReferMessage();
  }
  @Test
  public void verifyUserCanAddSameProductInToCart()
  {
    // Add Product InTo Cart
    addProductInToCartAndCheckPage.addProductToCart();
    // To Verify The Product Which You Add InTo Cart Is Same Or Not
    addProductInToCartResultPage.VerifyProductNameIsSameAsYouAddProductInToCart();
  }
}