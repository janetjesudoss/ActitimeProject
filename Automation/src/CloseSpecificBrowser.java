

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowser {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			System.out.println("Enter the window to be closed");
			Scanner sc=new Scanner(System.in);
			String eTitle=sc.nextLine();
			WebDriver driver=new ChromeDriver();
			driver.get("https://secure.indeed.com/");
			driver.findElement(By.id("apple-signin-button")).click();
			driver.findElement(By.id("login-facebook-button")).click();
			Set<String> allwh = driver.getWindowHandles();
			int count=allwh.size();
			for(String i:allwh)
			{
				driver.switchTo().window(i);
				String atitle = driver.getTitle();
				if(!(atitle.contains(eTitle)))
				{
					driver.close();
				}
				
			}
		}

}
