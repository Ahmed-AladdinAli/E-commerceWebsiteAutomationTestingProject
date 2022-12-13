package org.example.stepDefinitions;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class D05_hoverCategoriesStepDef {
    P03_homePage homePageComponents = new P03_homePage();
    WebDriver driver = null;
    SoftAssert asserting = new SoftAssert();
    String subCategory;


    @When("user hover on a main category")
    public void user_hover_on_a_main_category(){
        Actions action = new Actions(Hooks.driver);
      action.moveToElement(homePageComponents.mainCategory(Hooks.driver)).build().perform();
    }
    @And("user clicks on a subCategory")
    public void user_clicks_on_a_subCategory(){
        String subCategory = homePageComponents.computersSubCategory(Hooks.driver).getText();
        System.out.println(subCategory);
        homePageComponents.computersSubCategory(Hooks.driver).click();
    }

    @Then("user is navigating to the right page")
    public void user_is_navigating_to_the_right_page_ (){
        String pageName = homePageComponents.pageTitle(Hooks.driver).getText();
        asserting.assertEquals(pageName,subCategory,"user navigated to wrong page");

    }

}
