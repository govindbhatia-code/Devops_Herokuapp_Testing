package Header_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customers_Element {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.heroku.com");
		dr.findElement(By.xpath("//a[@aria-controls='mega-sub-menu-2169']")).click();
		dr.findElement(By.xpath("//a[@aria-controls='mega-sub-menu-2169']")).click();
		dr.navigate().back();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//a[@aria-controls='mega-sub-menu-2169']")).click();
		dr.findElement(By.xpath("//span[text()='Customer Stories']")).click();
		Thread.sleep(2000);
		dr.navigate().back();
		dr.findElement(By.xpath("//span[text()='Community Stories']")).click();
		Thread.sleep(2000);
		dr.navigate().back();
		
	}

}
