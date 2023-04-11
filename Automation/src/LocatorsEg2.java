

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsEg2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	   WebDriver driver=new ChromeDriver();
	   driver.get("file:///C:/Users/hp/Desktop/Demo.html");
	   driver.findElement(By.linkText("Google")).click();
	   Thread.sleep(500);
	   driver.navigate().back();
	   driver.findElement(By.partialLinkText("Goo")).click();
	   Thread.sleep(500);
	   driver.navigate().back();
	   driver.findElement(By.cssSelector("a[class='c1']")).click();
	   Thread.sleep(500);
	   driver.navigate().back();
	   driver.findElement(By.cssSelector("a[name='n1'")).click();
	   Thread.sleep(500);
	   driver.navigate().back();
	   driver.findElement(By.cssSelector("a[id='d1'")).click();
	   Thread.sleep(500);
	   driver.navigate().back();
	   driver.findElement(By.cssSelector("a[href='https://www.jspiders.com']")).click();
       driver.close();
}
}
