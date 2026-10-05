package com.devops.Header_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.devops.properties.XPATHManager;
import com.devops.UI.Open_Heroku;

public class Products_Element {

    public static void testProductsMenu(WebDriver dr) throws InterruptedException {
        // Toggle Products mega menu
        dr.findElement(By.xpath(XPATHManager.getXpath("productsMenu"))).click();
        Thread.sleep(2000);
        dr.findElement(By.xpath(XPATHManager.getXpath("productsMenu"))).click();
        Thread.sleep(2000);
        dr.navigate().back();
        dr.navigate().refresh();

        // Heroku Platform
        dr.findElement(By.xpath(XPATHManager.getXpath("productsMenu"))).click();
        dr.findElement(By.xpath(XPATHManager.getXpath("herokuPlatform"))).click();
        Thread.sleep(2000);
        dr.navigate().back();
        dr.navigate().refresh();

        // Heroku AI
        dr.findElement(By.xpath(XPATHManager.getXpath("productsMenu"))).click();
        dr.findElement(By.xpath(XPATHManager.getXpath("herokuAI"))).click();
        Thread.sleep(2000);
        dr.navigate().back();
        dr.navigate().refresh();

        // Heroku Data Services
        dr.findElement(By.xpath(XPATHManager.getXpath("productsMenu"))).click();
        dr.findElement(By.xpath(XPATHManager.getXpath("herokuDataServices"))).click();
        Thread.sleep(2000);
        dr.navigate().back();
        dr.navigate().refresh();

        // Heroku Enterprise
        dr.findElement(By.xpath(XPATHManager.getXpath("productsMenu"))).click();
        dr.findElement(By.xpath(XPATHManager.getXpath("herokuEnterprise"))).click();
        Thread.sleep(2000);
        dr.navigate().back();
        dr.navigate().refresh();

        JavascriptExecutor js = (JavascriptExecutor) dr;
        js.executeScript("window.scrollBy(0, 100);");

        // Heroku Success
        dr.findElement(By.xpath(XPATHManager.getXpath("productsMenu"))).click();
        dr.findElement(By.xpath(XPATHManager.getXpath("herokuSuccess"))).click();
        Thread.sleep(2000);
        dr.navigate().back();
        dr.navigate().refresh();

        // Heroku Elements Marketplace
        dr.findElement(By.xpath(XPATHManager.getXpath("productsMenu"))).click();
        dr.findElement(By.xpath(XPATHManager.getXpath("herokuElementsMarketplace"))).click();
        Thread.sleep(2000);
        dr.navigate().back();
        dr.navigate().refresh();
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver dr = Open_Heroku.launchHeroku();
        testProductsMenu(dr);
        dr.quit();
    }
}
