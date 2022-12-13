package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    // creating a new object from the webDriver
    WebDriver driver = null;
    P01_register registerPageElements = new P01_register();
    P03_homePage homePageElements = new P03_homePage();
    SoftAssert asserting = new SoftAssert();


    @Given ("user is navigating to register page")
    public void user_is_navigating_to_register_page(){
        homePageElements.registerLink(driver).click();

    }

    // registration steps
 @When("user is selecting  gender type")
    public void user_select_gender_type (){
        //locating the gender field and selecting the gender type
       registerPageElements.maleGenderType(driver).click();

 }
 @And ("^user is entering firstName \"(.*)\" and lastName \"(.*)\"$")
    public void enteringValidData(String firstName, String lastName ){
     registerPageElements.firstNameInput(driver).sendKeys(firstName);
     registerPageElements.lastNameInput(driver).sendKeys(lastName);
    }
 // selecting from drop down list
 @And ("user enter date of birth")
    public void user_enter_date_of_birth (){
    Select drpDay= new Select(registerPageElements.dayInput(driver));
    drpDay.selectByVisibleText("9");
     Select drpMonth= new Select(registerPageElements.monthInput(driver));
     drpMonth.selectByVisibleText("January");
     Select drpYear= new Select(registerPageElements.yearInput(driver));
     drpYear.selectByVisibleText("2000");

    }


 //entering email
 @And ("^user enter email \"(.*)\" field$")
    public void user_enter_email_field(String email){

        registerPageElements.emailInput(driver).sendKeys(email);
 }

    // entering company name
 @And ("^user enter company name \"(.*)\"$")
    public void user_enter_company_name (String companyName ){
       registerPageElements.companyInput(driver).sendKeys(companyName); }

 @And("^user fills password fields \"(.*)\" and \"(.*)\"$")
    public void user_fills_password_fields(String password , String confirm){
    registerPageElements.passwordInput(driver).sendKeys(password);
     registerPageElements.confirmedPassword(driver).sendKeys(confirm);

 }
 @And("user clicks on register button")
    public void user_clicks_on_register_button (){

        registerPageElements.registerButton(driver).click();
 }
 //comparing the expected result
 @Then("success message is displayed")
    public void success_message_is_displayed(){
    String actualResult = registerPageElements.registerSuccessMessage(driver).getText();
     String expectedResult = "Your registration completed";
    asserting.assertTrue(actualResult.contains(expectedResult));
    asserting.assertAll();
 }
 @And("the color is as specified")
 public void the_color_is_as_specified(){
     String actualTextColor= registerPageElements.registerSuccessMessage(driver).getCssValue("color");
     String expectedTextColor = "rgba(76, 177, 124, 1)";
     System.out.println(actualTextColor);
     asserting.assertTrue(expectedTextColor.contains(actualTextColor),"the text color not the specified green");
     asserting.assertAll();
 }

}
