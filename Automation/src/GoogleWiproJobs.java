

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleWiproJobs {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.findElement(By.name("q")).sendKeys("Wipro Jobs"+Keys.ENTER);
			List<WebElement> alllinks = driver.findElements(By.tagName("a"));
			System.out.println("count of links/urls present is "+alllinks.size());
			System.out.println("Printing all the urls: ");
			for(int i=0;i<alllinks.size();i++)
			{
				String url = alllinks.get(i).getAttribute("href");
						System.out.println(url);
			}
			
		}
			

}
