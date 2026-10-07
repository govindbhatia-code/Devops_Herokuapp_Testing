package Header_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pricing_Element {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver dr = new ChromeDriver();
		dr.get("https:www.heroku.com");
		dr.findElement(By.xpath("//li[@id='mega-menu-item-156']/child::a")).click();
		dr.findElement(By.xpath("//li[@id='mega-menu-item-156']/child::a")).click();
		dr.findElement(By.xpath("//a[text()='Dyno Pricing']")).click();
		Thread.sleep(2000);
		dr.navigate().back();
		dr.findElement(By.xpath("//a[text()='Data Services Pricing']")).click();
		Thread.sleep(2000);
		dr.navigate().back();
		dr.findElement(By.xpath("//a[text()='Heroku AI Pricing']")).click();
		Thread.sleep(2000);
		dr.navigate().back();
		dr.navigate().back();
		
	}

}
