

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	   WebDriver driver=new ChromeDriver();
	   driver.get("file:///C:/Users/hp/Desktop/input.html");
	   //another xpath is group by -->(//input[@type='text' ])[1]
	 
	   /*driver.findElement(By.xpath("//input[@type='text'  and @value='A']")).sendKeys(Keys.CONTROL,"a");
	   driver.findElement(By.xpath("//input[@type='text'  and @value='A']")).sendKeys(Keys.CONTROL,"c");
	   driver.findElement(By.xpath("//input[@type='text'  and @value='B']")).sendKeys(Keys.CONTROL,"a");
	   driver.findElement(By.xpath("//input[@type='text'  and @value='B']")).sendKeys(Keys.CONTROL,"v");*/
	   driver.findElement(By.xpath("//input[@type='text'  and @value='A']")).sendKeys(Keys.CONTROL,"ac");
	   driver.findElement(By.xpath("//input[@type='text'  and @value='B']")).sendKeys(Keys.CONTROL,"av");
	   
	   
	   
		}

}
