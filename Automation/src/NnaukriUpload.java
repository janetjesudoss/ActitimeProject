

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NnaukriUpload {
	

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	   WebDriver driver=new ChromeDriver();
      driver.get("https://www.naukri.com/");
      driver.findElement(By.id("login_Layer")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("janetjesudoss@gmail.com");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@type='password']")).sendKeys("naukri@123");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//button[text()='Login']")).click();
     // driver.close();
      
}
}