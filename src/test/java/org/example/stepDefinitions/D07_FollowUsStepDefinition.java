package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class D07_FollowUsStepDefinition {
    WebDriver driver = null;
    SoftAssert asserting = new SoftAssert();
    P03_homePage homePageElements = new P03_homePage();




    @When ("user is clicking on facebook icon")
    public void user_is_clicking_on_facebook_icon(){
        homePageElements.facebookIcon(Hooks.driver).click();
    }
    @Then("user is directed to company facebook page")
    public void user_is_directed_to_company_facebook_page(){
        String expectedUrl = "https://www.facebook.com/nopCommerce";
        String actualUrl = Hooks.driver.getCurrentUrl();
        asserting.assertEquals(actualUrl,expectedUrl,"user directed to wrong Page");

    }

    @When ("user is clicking on twitter icon")
    public void user_is_clicking_on_twitter_icon(){
       homePageElements.twitterIcon(Hooks.driver).click();

    }
    @Then("user is directed to company twitter page")
    public void user_is_directed_to_company_twitter_page(){
        String expectedUrl = "https://twitter.com/nopCommerce";
        String actualUrl = Hooks.driver.getCurrentUrl();
        asserting.assertEquals(actualUrl,expectedUrl,"user directed to wrong Page");

    }

    @When ("user is clicking on rss icon")
    public void user_is_clicking_on_rrs_icon(){
        homePageElements.rrsIcon(Hooks.driver).click();

    }
    @Then("user is directed to company rss page")
    public void user_is_directed_to_company_rrs_page(){
        String expectedUrl = "https://demo.nopcommerce.com/new-online-store-is-open";
        String actualUrl = Hooks.driver.getCurrentUrl();
        System.out.println(actualUrl);
        asserting.assertEquals(actualUrl,expectedUrl,"user directed to wrong Page");

    }

    @When ("user is clicking on youtube icon")
    public void user_is_clicking_on_youtube_icon(){
        homePageElements.youtubeIcon(Hooks.driver).click();

    }
    @Then("user is directed to company youtube page")
    public void user_is_directed_to_company_youtube_page(){
        String expectedUrl = "https://www.youtube.com/user/nopCommerce";
        String actualUrl = Hooks.driver.getCurrentUrl();
        asserting.assertEquals(actualUrl,expectedUrl,"user directed to wrong Page");

    }


}
