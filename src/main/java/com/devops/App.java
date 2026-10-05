package com.devops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.devops.Header_Test.Developers_Element;
import com.devops.Header_Test.Products_Element;
import com.devops.properties.XPATHManager;

import com.devops.UI.Open_Heroku;

public class App {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = Open_Heroku.launchHeroku();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    // Checking Sign Up
    public void testSignUp(WebDriver dr) throws InterruptedException {
        WebElement signUp = dr.findElement(By.xpath(XPATHManager.getXpath("signUp")));
        Actions actions = new Actions(dr);
        actions.moveToElement(signUp).click().perform();
        Thread.sleep(5000);
        dr.navigate().back();
    }

    // Scrolling to the bottom and back to the top
    public void testScroll(WebDriver dr) throws InterruptedException {
        Actions actions = new Actions(dr);
        actions.scrollToElement(dr.findElement(By.tagName("html"))).perform();
        Thread.sleep(5000);
        actions.moveToElement(dr.findElement(By.tagName("html"))).scrollToElement(dr.findElement(By.tagName("body"))).perform();
    }

    // Checking Login
    public void testLogin(WebDriver dr) throws InterruptedException {
        WebElement login = dr.findElement(By.xpath(XPATHManager.getXpath("login")));
        Actions actions = new Actions(dr);
        actions.moveToElement(login).click().perform();
        Thread.sleep(2000);

        // Entering login details
        dr.findElement(By.xpath(XPATHManager.getXpath("emailInput"))).sendKeys("testemail123@gmail.com");
        dr.findElement(By.xpath(XPATHManager.getXpath("passwordInput"))).sendKeys("testpassword@123456");
        Thread.sleep(5000);

        // Clicking Submit button
        WebElement submitButton = dr.findElement(By.xpath(XPATHManager.getXpath("submitButton")));
        actions.moveToElement(submitButton).click().perform();
        Thread.sleep(5000);

        dr.navigate().back();
        dr.navigate().back();
    }

    @Test
    public void testHeaderTest() throws InterruptedException {
        // Sign Up Test
        testSignUp(driver);

        // Scroll Test
        testScroll(driver);

        // Login Test
        testLogin(driver);

        // Products Menu Test
        Products_Element.testProductsMenu(driver);

        // Developers Menu Test
        Developers_Element.testDevelopersMenu(driver);
    }

    public static void main(String[] args) throws InterruptedException {
        App app = new App();
        app.setUp();
        app.testHeaderTest();
        app.tearDown();
    }
}
