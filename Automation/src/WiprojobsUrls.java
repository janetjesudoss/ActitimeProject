import java.awt.RenderingHints.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiprojobsUrls {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");		
	}
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("wipro jobs"+Keys.ENTER);
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		for(int i=0;i<alllinks.size();i++)
		{
			String hrefvalue = alllinks.get(i).getAttribute("href");
			System.out.println(hrefvalue);
		}
		
	}


}
