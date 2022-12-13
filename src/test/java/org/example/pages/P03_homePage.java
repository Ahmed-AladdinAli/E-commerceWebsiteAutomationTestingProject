package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;

import java.util.List;

public class P03_homePage {

   public WebElement registerLink (WebDriver driver){
        WebElement registerLink = Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
        return registerLink;
    }

    public WebElement loginLink(WebDriver driver){
        WebElement loginLink =Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    return loginLink;
    }
    public WebElement currencies (WebDriver driver){
       WebElement currencies = Hooks.driver.findElement(By.id("customerCurrency"));
       return currencies;
    }
    public List<WebElement> productsPrices (WebDriver driver){
       List <WebElement> productsPrices= Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
       return productsPrices;
    }
    public WebElement searchInput (WebDriver driver){
      WebElement searchInput = Hooks.driver.findElement(By.name("q"));
      return searchInput ;
    }
    public WebElement searchButton(WebDriver driver){
       WebElement searchButton = Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
       return searchButton;
   }
   public WebElement mainCategory(WebDriver driver){
       WebElement mainCategory =  Hooks.driver.findElement(By.cssSelector("a[href=\"/computers\"]"));
       return mainCategory;
   }
   public WebElement computersSubCategory(WebDriver driver){
       WebElement computersSubCategory= Hooks.driver.findElement(By.cssSelector("a[href=\"/computers\"]"));
       return computersSubCategory;
   }
   public WebElement pageTitle (WebDriver driver){
     WebElement pageTitle =  Hooks.driver.findElement(By.
               xpath("//body/div[6]/div[2]/ul[2]/li[1]/ul[1]/li[1]/a[1]"));
       return pageTitle;
   }
   public WebElement firstSlider(WebDriver driver){
       WebElement firstSlider = Hooks.driver.findElement(By.linkText("1"));
       return firstSlider;
   }
   public WebElement secondSlider (WebDriver driver){
       WebElement secondSlider =
               Hooks.driver.findElement(By.linkText("2"));
       return secondSlider;
   }
   public WebElement facebookIcon(WebDriver driver){
       WebElement facebookIcon = Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(6) div.footer div.footer-upper div.footer-block.follow-us:nth-child(4) div.social ul.networks li.facebook > a:nth-child(1)"));
       return facebookIcon;
   }
   public WebElement twitterIcon(WebDriver driver){
       WebElement twitterIcon =  Hooks.driver.findElement(By.xpath("//a[contains(text(),'Twitter')]"));
       return twitterIcon;
   }
   public WebElement rrsIcon (WebDriver driver) {
       WebElement rrsIcon = Hooks.driver.findElement(By.linkText("RSS"));
       return rrsIcon;
   }
   public WebElement youtubeIcon(WebDriver driver){
       WebElement youtubeIcon = Hooks.driver.findElement(By.partialLinkText("YouTu"));
       return youtubeIcon;
   }
   public WebElement heartIcon(WebDriver driver){
       WebElement heartIcon = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
       return heartIcon;
   }
   public WebElement wishSuccessMessage(WebDriver driver){
       WebElement wishSuccessMessage =Hooks.driver.findElement(By.xpath("/html/body/div[5]/div/p"));
       return wishSuccessMessage;
   }
   public WebElement wishListLink(WebDriver driver){
       WebElement wishListLink = Hooks.driver.findElement(By.xpath("//span[contains(text(),'Wishlist')]"));
       return wishListLink;
   }

}
