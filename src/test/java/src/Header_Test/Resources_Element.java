package Header_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resources_Element {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.heroku.com");
		dr.findElement(By.xpath("//a[@aria-controls='mega-sub-menu-160']")).click();
		Thread.sleep(2000);
		
		// Blog
		dr.findElement(By.xpath("//span[text()='Blog']")).click();
		Thread.sleep(2000);
		dr.navigate().back();
		
		// What is Heroku?
		dr.findElement(By.xpath("//span[text()='What is Heroku?']")).click();
		Thread.sleep(2000);
		dr.navigate().back();
		
		// Events
		dr.findElement(By.xpath("//span[text()='Events']")).click();
		Thread.sleep(2000);
		dr.navigate().back();
		
		// Partners
		dr.findElement(By.xpath("//span[text()='Partners']")).click();
		Thread.sleep(2000);
		dr.navigate().back();
		
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("window.scrollBy(0, 80);");
		
		// Compliance Center
		dr.findElement(By.xpath("//span[text()='Compliance Center']")).click();
		Thread.sleep(2000);
		dr.navigate().back();
		
		// Help Center
		dr.findElement(By.xpath("//span[text()='Help Center']")).click();
		Thread.sleep(2000);
		dr.navigate().back();
		
		
	}

}
