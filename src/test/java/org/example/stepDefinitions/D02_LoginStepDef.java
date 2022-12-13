package org.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_LoginStepDef {
    WebDriver driver = null;
    SoftAssert asserting = new SoftAssert();
    P02_login loginPageElements = new P02_login();
    P03_homePage homepageElements = new P03_homePage();



    @Given ("user is navigating to login page")
    public void user_is_navigating_to_login_page(){
        homepageElements.loginLink(driver).click();
    }
    @When("^user logging with valid data \"(.*)\" and \"(.*)\"$")
    public void enteringValidData(String username, String password ){
        loginPageElements.emailInput(driver).sendKeys(username);
        loginPageElements.passwordInput(driver).sendKeys(password);
    }

   @And("user is pressing on login button")
   public void user_is_pressing_on_login_button (){
        loginPageElements.loginButton(driver).click();
   }
   @Then("user is logging to system successfully")
   public void user_is_logging_to_system_successfully () {
        String currentUrl = Hooks.driver.getCurrentUrl();
        String expectedUrl= "https://demo.nopcommerce.com/";
        asserting.assertTrue(currentUrl.contains(expectedUrl), "the current url is not the expected url ");

       asserting.assertTrue(loginPageElements.myAccountTab(driver).isDisplayed()
               ,"My account doesn't displayed");
        asserting.assertAll();
    }


    //scenario 2

    @Given ("user is navigating to login page for TC2 negative scenario")
    public void user_is_navigating_to_login_page_for_TC2_negative_scenario (){
    homepageElements.loginLink(driver).click();
    }
    @When("^user logging with invalid data \"(.*)\" and \"(.*)\"$")
    public void enteringInValidData(String username, String password ){
        loginPageElements.emailInput(driver).sendKeys(username);
        loginPageElements.passwordInput(driver).sendKeys(password);
    }
    @And("user is pressing on login button for TC2 negative scenario")
    public void user_is_pressing_on_login_button_for_TC2_negative_scenario (){
        loginPageElements.loginButton(driver).click();
    }
    @Then("user could not login to the system")
    public void user_could_not_login_to_the_system() {
        String expectedFailureMessage = "Login was unsuccessful.";
          String actualFailureMessage=loginPageElements.actualFailureMessage(driver).getText();
           asserting.assertTrue(actualFailureMessage.contains(expectedFailureMessage),"the message is not as expected");
          String expectedMessageColor ="#e4434b";
           String actualMessageColorRGBA = loginPageElements.actualFailureMessage(driver).getCssValue("color");
           String actualMessageColorHex = Color.fromString(actualMessageColorRGBA).asHex();
           asserting.assertEquals(actualMessageColorHex,expectedMessageColor,"the message color is not as expected");
           asserting.assertAll();
   }

}