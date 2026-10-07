package com.devops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class App {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();   
        driver1.get("http://www.heroku.com");

        // Checking Sign Up
        WebElement signUp = driver1.findElement(By.xpath("//a[@id=\'logged-out-signup\']"));
        Actions actions = new Actions(driver1);
        actions.moveToElement(signUp).click().perform();
        Thread.sleep(5000);
        driver1.navigate().back();

        // Scrolling to the bottom and back to the top
        actions.scrollToElement(driver1.findElement(By.tagName("html"))).perform();
        Thread.sleep(5000);
        actions.moveToElement(driver1.findElement(By.tagName("html"))).scrollToElement(driver1.findElement(By.tagName("body"))).perform();

        // Checking Login
        WebElement login = driver1.findElement(By.xpath("//a[@id=\'logged-out-login\']"));
        actions.moveToElement(login).click().perform();
        Thread.sleep(2000);

        // Entering login details
        driver1.findElement(By.xpath("//input[@id=\'email\']")).sendKeys("testemail123@gmail.com");
        driver1.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("testpassword@123456");
        Thread.sleep(5000);

        // Clicking Submit button
        WebElement submitButton = driver1.findElement(By.xpath("/html/body/div/div/div/div/form/button"));
        actions.moveToElement(submitButton).click().perform();
        Thread.sleep(5000);
        driver1.quit();
    }
}
