

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForPageSource {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.google.com");
	  String htmlsource= driver.getPageSource();
	  System.out.println("Printing page source: "+htmlsource);
	  driver.close();
	   
		}

}
