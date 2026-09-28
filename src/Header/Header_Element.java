package Header;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Header_Element {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.heroku.com");
		
		
		dr.findElement(By.xpath("//a[@aria-controls=\"mega-sub-menu-118\"]")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//a[@aria-controls=\"mega-sub-menu-118\"]")).click();
		dr.navigate().back();
		dr.navigate().refresh();
		
		
		
//		dr.findElement(By.xpath("//a[@aria-controls=\"mega-sub-menu-118\"]")).click();
////		dr.findElement(By.xpath("//li[@id=\"mega-menu-item-118\"]")).click();
//		dr.findElement(By.xpath("//span[text()=\"Heroku Platform\"]")).click();
//		Thread.sleep(2000);
//		dr.navigate().back();
//		dr.navigate().refresh();
//		
//		
//		dr.findElement(By.xpath("//a[@aria-controls=\"mega-sub-menu-118\"]")).click();
//		dr.findElement(By.xpath("//span[text()=\"Heroku AI\"]")).click();
//		Thread.sleep(2000);
//		dr.navigate().back();
//		dr.navigate().refresh();
//		
//		
//		dr.findElement(By.xpath("//a[@aria-controls=\"mega-sub-menu-118\"]")).click();
//		dr.findElement(By.xpath("//span[text()=\"Heroku Data Services\"]")).click();
//		Thread.sleep(2000);
//		dr.navigate().back();
//		dr.navigate().refresh();
//		
//		
//		dr.findElement(By.xpath("//a[@aria-controls=\"mega-sub-menu-118\"]")).click();
//		dr.findElement(By.xpath("//span[text()=\"Heroku Enterprise\"]")).click();
//		Thread.sleep(2000);
//		dr.navigate().back();
//		dr.navigate().refresh();
//		
		
		dr.findElement(By.xpath("//a[@aria-controls=\"mega-sub-menu-118\"]")).click();
		dr.findElement(By.xpath("//span[text()=\"Heroku Success\"]")).click();
		Thread.sleep(2000);
		dr.navigate().back();
		dr.navigate().refresh();
		
		
		dr.findElement(By.xpath("//a[@aria-controls=\"mega-sub-menu-118\"]")).click();
		dr.findElement(By.xpath("//span[text()=\"Heroku Elements Marketplace\"]")).click();
		Thread.sleep(2000);
		dr.navigate().back();
		dr.navigate().refresh();
		
	}

}
