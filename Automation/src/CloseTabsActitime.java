

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTabsActitime {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			//driver.findElement(By.className("popup_menu_button popup_menu_button_support popup_menu_button_pressed")).click();
			driver.findElement(By.xpath("//div[@class='menu_icon']/../..")).click();
			driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
			driver.findElement(By.xpath("//a[text()='Read Service Agreement']")).click();
			List<WebElement> allheadings = driver.findElements(By.xpath("//h2"));
			int count=allheadings.size();
			for(int i=0;i<count;i++)
			{
				System.out.println(allheadings.get(i).getText());
			}
			
		}
		

}
