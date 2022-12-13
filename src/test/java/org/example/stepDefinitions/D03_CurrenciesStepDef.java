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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Array;
import java.util.List;

public class D03_CurrenciesStepDef {

    P03_homePage homePageElements = new P03_homePage();
    WebDriver driver = null;
    SoftAssert asserting = new SoftAssert();
    WebElement q=null;
    String allPrices = null;

    @When("user is selecting Euro currency from the dropdown list on the top left of home page")
    public void user_is_selecting_Euro_currency_from_the_dropdown_list_on_the_top_left_of_home_page(){
       Select drpCurrency=new Select(homePageElements.currencies(driver));
       drpCurrency.selectByVisibleText("Euro");
    }
    @Then("the 4 products in the home page will show Euro symbol")
    public void the_4_products_in_the_home_page_will_show_Euro_symbol(){
      List<WebElement> prices = homePageElements.productsPrices(driver);

      for(int i = 0 ; i<prices.size();i++){
          q=prices.get(i);
          allPrices =  q.getText();

      }
        System.out.println(allPrices);
      String expectedResult = "€";
     asserting.assertTrue(allPrices.contains(expectedResult),"the prices doesn't converted into Euro");
      asserting.assertAll();
    }



}
