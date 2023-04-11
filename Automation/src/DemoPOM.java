import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class DemoPOM {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	//@FindBy(id="username")
	//static WebElement untbx;
	public static void main(String args[]) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		WebElement untbx = driver.findElement(By.id("username"));
		driver.navigate().refresh();
		untbx.sendKeys("admin");
}
}
