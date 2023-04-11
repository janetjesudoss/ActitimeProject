

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLoginEnabled {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	  boolean login=  driver.findElement(By.xpath("//button[text()='Log in']")).isEnabled();
if(login)
	System.out.println("Login button is enabled");
else
	System.out.println("Login button is not enabled");
driver.close();
		
		}
}
