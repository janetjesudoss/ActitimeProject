

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CancelInAlertPopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://demo.automationtesting.in/Alerts.html");
	   driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
	   driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	   driver.switchTo().alert().dismiss();
	  if(driver.findElement(By.xpath("//p[contains(text(),'You Pressed Cancel')]")).isDisplayed())
	  {
		  System.out.println("Verified that -You Pressed Cancel text is displayed");
	  }
	   
		
		driver.close();
		}

}
