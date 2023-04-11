import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoScreenShot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		// create webdriver object
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
	//since ChromeDriver already upcasted tp webdriver TakeScreenshot methods
		//will be hidden so we have to either downcast to ChromeDriver or 
		//typecast to TakeScreenshot always typecasting is secure so we do that
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShot/ss.png");
		FileUtils.copyFile(src, dest);
		driver.close();
		
	}
}
