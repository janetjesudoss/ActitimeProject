

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartProdNPrice {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.flipkart.com/");
	  driver.findElement(By.name("q")).sendKeys("iPhone 14 pro max");
	  
	  Thread.sleep(2000);
	//span[contains(text(),'iphone 14 pro max')]
	  List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'iphone 14 pro max')]"));
	  
      int count=allsugg.size();
      for(WebElement i:allsugg)
      {
    	  System.out.println(i);
      }
      
}
}