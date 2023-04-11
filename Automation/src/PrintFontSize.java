

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintFontSize {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException  {
			// TODO Auto-generated method stub
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   String color=driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
	   String fontsize=driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
System.out.println("Colour of the font is "+color);
System.out.println("Font size of the font is "+fontsize);
driver.close();
}
}
