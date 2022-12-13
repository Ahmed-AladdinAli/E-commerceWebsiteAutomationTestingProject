package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.sql.SQLOutput;
import java.util.List;

public class D04_searchStepDef {
    WebDriver driver = null;
    P03_homePage homePageElements = new P03_homePage();
    SoftAssert asserting = new SoftAssert();
    WebElement q = null;
    String searchedProduct = null;
    int itemsNumber ;


    @When("^user is entering the searching data as ([^\"]*)$")
    public void user_is_entering_the_searching_data_as_searchingByName (String searchingByName)  {
        homePageElements.searchInput(driver).sendKeys(searchingByName);
        homePageElements.searchButton(driver).click();
    }

    @Then("the products will be shown")
        public void the_products_will_be_shown(){
       String actualUrl= Hooks.driver.getCurrentUrl();
       String expectUrl = "https://demo.nopcommerce.com/search?q=";
       asserting.assertTrue(actualUrl.contains(expectUrl),"searching is not working");

     List<WebElement> products = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]"));
    for(int i =0 ; i<products.size(); i++){
        q = products.get(i);
        searchedProduct = q.getText();
        itemsNumber = products.size();
    }
        System.out.println(itemsNumber );
        System.out.println(searchedProduct);
        asserting.assertAll();
    }

//2nd scenario
    @When("^user is entering searching data as ([^\"]*)$")
    public void user_is_entering_the_searching_data_as_searchingBySerialNumber(String searchingBySerialNumber)  {
        homePageElements.searchInput(driver).sendKeys(searchingBySerialNumber);
        homePageElements.searchButton(driver).click();
    }
    @Then("products will be shown")
    public void products_will_be_shown(){
        String actualUrl= Hooks.driver.getCurrentUrl();
        String expectUrl = "https://demo.nopcommerce.com/search?q=";
        asserting.assertTrue(actualUrl.contains(expectUrl),"searching is not working");

        List<WebElement> products = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]"));
        for(int i =0 ; i<products.size(); i++){
            q = products.get(i);
            searchedProduct = q.getText();
            itemsNumber = products.size();
        }
        System.out.println(itemsNumber );
        System.out.println(searchedProduct);
        asserting.assertAll();
    }

    }


