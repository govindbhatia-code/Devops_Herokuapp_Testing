package com.devops.Header_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.devops.properties.XPATHManager;
import com.devops.UI.Open_Heroku;

public class Developers_Element {

    public static void testDevelopersMenu(WebDriver dr) throws InterruptedException {
        // Toggle Developers mega menu
        dr.findElement(By.xpath(XPATHManager.getXpath("developersMenu"))).click();
        Thread.sleep(2000);
        dr.findElement(By.xpath(XPATHManager.getXpath("developersMenu"))).click();
        Thread.sleep(2000);
        dr.navigate().back();
        dr.navigate().refresh();

        // Dev Center
        dr.findElement(By.xpath(XPATHManager.getXpath("developersMenu"))).click();
        dr.findElement(By.xpath(XPATHManager.getXpath("devCenter"))).click();
        Thread.sleep(2000);
        dr.navigate().back();
        dr.navigate().refresh();

        // Current Page Link
        dr.findElement(By.xpath(XPATHManager.getXpath("developersMenu"))).click();
        dr.findElement(By.xpath(XPATHManager.getXpath("devCurrentPage"))).click();
        Thread.sleep(2000);
        dr.navigate().back();
        dr.navigate().refresh();
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver dr = Open_Heroku.launchHeroku();
        testDevelopersMenu(dr);
        dr.quit();
    }
}
