

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCheckbox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://demo.actitime.com/");
	  boolean sel=  driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
if(sel)
	System.out.println("Keep me logged in checkbox is selected");
else
	System.out.println("Keep me logged in checkbox is not selected");
driver.close();
		
		}


}
