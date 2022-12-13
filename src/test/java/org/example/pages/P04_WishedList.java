package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;

public class P04_WishedList {


    public WebElement wishedItems (WebDriver driver){
        //      WebElement wishedItems = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[6]/input)"));
     WebElement wishedItems = Hooks.driver.findElement(By.xpath("//tbody/tr[1]/td[6]/input[1]"));
        return wishedItems;
    }
}
