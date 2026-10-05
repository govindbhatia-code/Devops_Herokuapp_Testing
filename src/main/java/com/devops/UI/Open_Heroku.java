package com.devops.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Heroku {

    public static WebDriver launchHeroku() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.heroku.com");
        return driver;
    }

    public static void main(String[] args) {
        WebDriver driver = launchHeroku();
        driver.quit();
    }
}
