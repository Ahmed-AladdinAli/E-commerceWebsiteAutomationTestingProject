package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;

import static org.example.stepDefinitions.Hooks.driver;

public class P01_register {

   public WebElement maleGenderType (WebDriver driver){
        WebElement maleGenderType =  Hooks.driver.findElement(By.id("gender-male"));
        return maleGenderType;
    }
    public WebElement firstNameInput (WebDriver driver){
       WebElement firstNameInput = Hooks.driver.findElement(By.id("FirstName"));
       return firstNameInput;
    }
    public WebElement lastNameInput (WebDriver driver){
       WebElement lastNameInput  = Hooks.driver.findElement(By.id("LastName"));
       return lastNameInput;
    }
    public WebElement dayInput (WebDriver driver){
       WebElement dayInput = Hooks.driver.findElement(By.name("DateOfBirthDay"));
       return dayInput;
    }
    public WebElement monthInput(WebDriver driver){
       WebElement monthInput = Hooks.driver.findElement(By.name("DateOfBirthMonth"));
       return monthInput;
    }
    public WebElement yearInput(WebDriver driver){
       WebElement yearInput = Hooks.driver.findElement(By.name("DateOfBirthYear"));
   return yearInput;
    }
    public WebElement emailInput(WebDriver driver){
      WebElement emailInput =   Hooks.driver.findElement(By.id("Email")) ;
      return emailInput;
    }
    public WebElement companyInput(WebDriver driver){
       WebElement companyInput = Hooks.driver.findElement(By.id("Company"));
       return companyInput;
    }
    public WebElement passwordInput(WebDriver driver){
       WebElement passwordInput =  Hooks.driver.findElement(By.id("Password"));
       return passwordInput;
    }
    public WebElement confirmedPassword(WebDriver driver){
       WebElement confirmedPassword = Hooks.driver.findElement(By.id("ConfirmPassword"));
       return confirmedPassword;
    }
    public WebElement registerButton (WebDriver driver){
       WebElement registerButton = Hooks.driver.findElement(By.id("register-button"));
       return registerButton;
    }
    public WebElement registerSuccessMessage(WebDriver driver){
       WebElement registerSuccessMessage = Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
       return registerSuccessMessage;
    }
    public WebElement logoIcon(WebDriver driver){
       WebElement logoIcon = Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(6) div.header div.header-lower div.header-logo a:nth-child(1) > img:nth-child(1)"));
       return logoIcon;
    }


}
