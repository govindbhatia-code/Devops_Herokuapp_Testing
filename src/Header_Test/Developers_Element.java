package Header_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Developers_Element {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.heroku.com");
		
		dr.findElement(By.xpath("//a[@aria-controls=\"mega-sub-menu-170\"]")).click();
		dr.findElement(By.xpath("//a[@aria-controls=\"mega-sub-menu-170\"]")).click();
		dr.navigate().back();
		dr.navigate().refresh();
		
		dr.findElement(By.xpath("//a[@aria-controls=\"mega-sub-menu-170\"]")).click();
		dr.findElement(By.xpath("//span[text()=\"Dev Center\"]")).click();
		Thread.sleep(2000);
		dr.navigate().back();
		dr.navigate().refresh();
		
		dr.findElement(By.xpath("//a[@aria-controls=\"mega-sub-menu-170\"]")).click();
//		dr.findElement(By.xpath("//a[@aria-current=\"page\"]/parent::li[@id=\"mega-menu-item-184")).click();
		dr.findElement(By.xpath("//a[@aria-current=\"page\"]")).click();
		Thread.sleep(2000);
		dr.navigate().back();
		dr.navigate().refresh();
	}

}
