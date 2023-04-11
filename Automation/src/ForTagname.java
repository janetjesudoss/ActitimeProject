

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForTagname {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://demo.actitime.com/");
	  String tagname=driver.findElement(By.xpath("//a[text()='Forgot your password?']")).getTagName();
	  String value=driver.findElement(By.xpath("//a[text()='Forgot your password?']")).getText();
	  System.out.println("Tag name is "+tagname);
	  System.out.println("Value of href attribute is "+value);
driver.close();
}
}
