package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class D06_HomeSlidersStepDefinition {
    WebDriver driver = null;
    SoftAssert asserting = new SoftAssert();
    String subCategory;
    P03_homePage homePageElements = new P03_homePage();


    @When("user is clicking on the first slider in the homePage")
    public void user_is_clicking_on_the_first_slider_in_the_homePage(){

        homePageElements.firstSlider(Hooks.driver).click();
    }
    @Then("user is navigating to the right page sc1")
    public void user_is_navigating_to_the_right_page_sc1(){
       String expectedUrl ="https://demo.nopcommerce.com/nokia-lumia-1020";
       String actualUrl = Hooks.driver.getCurrentUrl();
        System.out.println(actualUrl);
       asserting.assertEquals(expectedUrl,actualUrl,"user directed to wrong page ");
       asserting.assertAll();
    }

    @When("user is clicking on the second slider in the homePage")
    public void user_is_clicking_on_the_second_slider_in_the_homePage(){

        homePageElements.secondSlider(Hooks.driver).click();
    }

    @Then("user is navigating to the right page TC6 sc2")
    public void user_is_navigating_to_the_right_page_TC6_sc2(){
        String expectedUrl ="https://demo.nopcommerce.com/iphone-6";
        String actualUrl = Hooks.driver.getCurrentUrl();
        System.out.println(actualUrl);
       asserting.assertEquals(expectedUrl,actualUrl,"user directed to wrong page ");
       asserting.assertAll();

    }

}
