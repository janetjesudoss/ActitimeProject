

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	   WebDriver driver=new ChromeDriver();
	   driver.get("file:///C:/Users/hp/Desktop/linkedin.html");
	   Thread.sleep(2000);
	   //giving relative path and create file object
	   File f=new File("./data/Resumedummy.docx");
	   //creating absolute path
	   String absolutepath = f.getAbsolutePath();
	   driver.findElement(By.id("cv")).sendKeys(absolutepath);
		}

}
