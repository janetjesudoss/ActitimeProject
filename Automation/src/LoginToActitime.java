

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToActitime {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args)  {
			// TODO Auto-generated method stub
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://demo.actitime.com/");
	  //enter username
	   driver.findElement(By.name("username")).sendKeys("admin");
	 //enter password
	   driver.findElement(By.name("pwd")).sendKeys("manager");
	   //click on login button
	   driver.findElement(By.xpath("//div[text()='Login ']")).click();
	  System.out.println("Logged into the actitime application");
//driver.close();
}

}
