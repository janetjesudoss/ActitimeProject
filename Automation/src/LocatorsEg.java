

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsEg {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	   WebDriver driver=new ChromeDriver();
	   driver.get("file:///C:/Users/hp/Desktop/Demo.html");
	   driver.findElement(By.tagName("a")).click();
	   
	   Thread.sleep(2000);
	   driver.navigate().back();
	   driver.findElement(By.name("n1")).click();
	   
	   Thread.sleep(2000);
	   driver.navigate().back();
	   driver.findElement(By.className("c1")).click();
	   
	   Thread.sleep(2000);
	   driver.navigate().back();
	   driver.findElement(By.id("d1")).click();
	   driver.close();
	   
	   
		}
}
