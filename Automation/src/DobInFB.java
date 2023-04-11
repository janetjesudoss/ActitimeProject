

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DobInFB {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   driver.findElement(By.linkText("Create new account")).click();
	   Thread.sleep(2000);
	   WebElement date=driver.findElement(By.id("day"));
			   Thread.sleep(2000);
			   WebElement month=driver.findElement(By.id("month"));
					   Thread.sleep(2000);
			   WebElement year=driver.findElement(By.id("year"));
					   Thread.sleep(2000);
					   
					   Select d1=new Select(date);
					   Select m1=new Select(month);
					   Select y1=new Select(year);
					   d1.selectByValue("25");
					   Thread.sleep(2000);
					   m1.selectByIndex(7);
					   Thread.sleep(2000);
					   y1.selectByVisibleText("1983");
					   
					   Thread.sleep(2000);
					   
	   

}
}
