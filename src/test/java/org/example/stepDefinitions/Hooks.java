package org.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class Hooks {
    public static WebDriver driver;

    @Before
    public static void user_is_opening_browser() throws InterruptedException {
        String chromePath = System.getProperty("user.dir")
                + "\\src\\main\\resources\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chromePath);
        // opening the browser
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }


    @After
    public static void user_is_closing_browser () throws InterruptedException{
        Thread.sleep(4000);
        driver.quit();
    }
}
