

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSugg {


	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.google.com/");
	   driver.findElement(By.name("q")).sendKeys("java");
	 //span[contains(text(),'java')]
	   Thread.sleep(2000);
	   List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
	   Thread.sleep(2000);
	   int count=allSugg.size();
	   for(int i=0;i<count;i++)
	   {
		   System.out.println(allSugg.get(i).getText());
	   }
	   allSugg.get(0).click();
	   
		}
}



