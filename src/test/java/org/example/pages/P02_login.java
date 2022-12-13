package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;

public class P02_login {

  public  WebElement emailInput  (WebDriver driver){
      WebElement emailInput = Hooks.driver.findElement(By.id("Email"));
      return emailInput ;

    }
    public WebElement passwordInput(WebDriver driver){
      WebElement passwordInput  = Hooks.driver.findElement(By.id("Password"));
      return passwordInput;
    }
    public WebElement loginButton (WebDriver driver){
      WebElement loginButton = Hooks.driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
     return loginButton;
  }
  public WebElement myAccountTab (WebDriver driver){
      WebElement myAccountTab =Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(6) div.header div.header-upper div.header-links-wrapper div.header-links ul:nth-child(1) li:nth-child(1) > a.ico-account"));
      return myAccountTab;
  }
  public WebElement actualFailureMessage(WebDriver driver){
      WebElement actualFailureMessage=Hooks.driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]"));
      return actualFailureMessage  ;
    }


}
