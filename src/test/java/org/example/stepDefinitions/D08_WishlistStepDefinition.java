package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.example.pages.P02_login;
import org.example.pages.P03_homePage;
import org.example.pages.P04_WishedList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import javax.management.remote.rmi._RMIConnection_Stub;

public class D08_WishlistStepDefinition {

     public  WebDriver driver =null ;
     P03_homePage homePageElements = new P03_homePage();
     P01_register registerPageElements = new P01_register();
     P02_login loginPageElements = new P02_login();
     P04_WishedList WishedListElements = new P04_WishedList();
    public int numberOfQuantities;

    P04_WishedList WishedListPageElements = new P04_WishedList();
    String quantity = null;
    SoftAssert asserting = new SoftAssert();

    @Given ("user is navigating to register page for TC8 sc1")
    public void user_is_navigating_to_register_page_for_TC8_sc1(){
       homePageElements.registerLink(Hooks.driver).click();

    }

    // registration steps
    @And ("user is selecting  gender type for TC8 sc1")
    public void user_select_gender_type_for_TC8_sc1 (){
        //locating the gender field and selecting the gender type
       registerPageElements.maleGenderType(Hooks.driver).click();

    }
    @And ("^user is entering firstName \"(.*)\" and lastName \"(.*)\" for TC8 sc1$")
    public void user_is_entering_valid_data_for_TC8_sc1(String firstName, String lastName ){
        registerPageElements.firstNameInput(Hooks.driver).sendKeys(firstName);
        registerPageElements.lastNameInput(Hooks.driver).sendKeys(lastName);
    }
    // selecting from drop down list
    @And ("user enter date of birth for TC8 sc1")
    public void user_enter_date_of_birth_for_TC8_sc1 (){
        Select drpDay= new Select(registerPageElements.dayInput(Hooks.driver));
        drpDay.selectByVisibleText("9");
        Select drpMonth= new Select(registerPageElements.monthInput(Hooks.driver));
        drpMonth.selectByVisibleText("January");
        Select drpYear= new Select(registerPageElements.yearInput(Hooks.driver));
        drpYear.selectByVisibleText("2000");

    }


    //entering email
    @And ("^user enter email \"(.*)\" field for TC8 sc1$")
    public void user_enter_email_field(String email){

        registerPageElements.emailInput(Hooks.driver).sendKeys(email);
    }

    // entering company name
    @And ("^user enter company name \"(.*)\" for TC8 sc1$")
    public void user_enter_company_name (String companyName ){
        registerPageElements.companyInput(Hooks.driver).sendKeys(companyName); }

    @And("^user fills password fields \"(.*)\" and \"(.*)\" for TC8 sc1$")
    public void user_fills_password_fields(String password , String confirm){
        registerPageElements.passwordInput(Hooks.driver).sendKeys(password);
        registerPageElements.confirmedPassword(Hooks.driver).sendKeys(confirm);

    }
    @And("user clicks on register button for TC8 sc1")
    public void user_clicks_on_register_button (){

        registerPageElements.registerButton(Hooks.driver).click();
    }

    @And ("user is navigating to home page after registration for TC8 sc1")
    public void user_is_navigating_to_home_page_after_registration_for_TC8_sc1(){
        registerPageElements.logoIcon(Hooks.driver).click();
    }
    @And ("user is navigating to login page for TC8 sc1")

    public void user_is_navigating_to_login_page_for_TC8_sc1(){
       homePageElements.loginLink(Hooks.driver).click();
    }

    @And ("^user logging with valid data \"(.*)\" and \"(.*)\" for TC8 sc1$")
    public void user_logging_with_valid_data_for_TC8_sc1(String username, String password ){
        loginPageElements.emailInput(Hooks.driver).sendKeys(username);
        loginPageElements.passwordInput(Hooks.driver).sendKeys(password);
        loginPageElements.loginButton(Hooks.driver).click();
    }
    @When("user is clicking on heart icon")
    public void user_is_clicking_on_heart_icon()throws InterruptedException{
        homePageElements.heartIcon(Hooks.driver).click();
        Thread.sleep(2000);
    }
    @Then("a success message appears")
    public void a_success_message_appears(){
        WebElement successMessage =homePageElements.wishSuccessMessage(Hooks.driver);

        boolean messageStatus =successMessage.isDisplayed();
       String actualMessage =  successMessage.getText();
       String actualColor =  successMessage.getCssValue("color");
        String actualBGColor =  Hooks.driver.findElement(By.id("bar-notification")).getCssValue("background-color");
        System.out.println("message is displayed"+ "=" + messageStatus);
        System.out.println(actualColor);
        System.out.println(actualBGColor);
        System.out.println(actualMessage);

       String expectedMessage = "The product has been added to your ";
       String expectedBGColor= "rgba(75, 176, 122, 1)";
       String expectedColor = "rgba(255, 255, 255, 1)";
       asserting.assertTrue(actualMessage.contains(expectedMessage),"the message success message doesn't appear");
       asserting.assertEquals(actualColor,expectedColor,"color of the message is not as expected");
      // asserting.assertEquals(actualBGColor,expectedBGColor,"the BG color is not as expected");
       asserting.assertAll();
        Hooks.driver.findElement(By.cssSelector("body:nth-child(2) div.bar-notification-container:nth-child(5) div.bar-notification.success > span.close")).click();
    }

    // second scenario

    @And ("user is navigating to login page for TC8 sc2")

        public void user_is_navigating_to_login_page(){
            homePageElements.loginLink(Hooks.driver).click();
        }

    @And ("^user logging with valid data \"(.*)\" and \"(.*)\" for TC8 sc2$")
    public void enteringValidData(String username, String password ){
        loginPageElements.emailInput(Hooks.driver).sendKeys(username);
        loginPageElements.passwordInput(Hooks.driver).sendKeys(password);
        loginPageElements.loginButton(Hooks.driver).click();
    }
    @And ("user is navigating to wishlist page")
    public void user_is_navigating_to_wishlist_page()throws InterruptedException{
        homePageElements.wishListLink(Hooks.driver).click();
    }
    @When ("user is checking the number of items wished in the table")
    public void user_is_checking_the_number_of_items_wished_in_the_table(){
        WebElement wishedItems = WishedListPageElements.wishedItems(Hooks.driver);
        quantity = wishedItems.getAttribute("value");
        try{
        numberOfQuantities = Integer.parseInt(quantity);}
        catch(NumberFormatException e){
            System.out.println("the input can't convert into integer");
        }
        System.out.println(numberOfQuantities);
    }
    @Then ("quantity value should be larger than 0")
    public void quantity_value_should_be_larger_than_0(){

        asserting.assertTrue(numberOfQuantities>0,"the quantity not as expected");
    }
}
