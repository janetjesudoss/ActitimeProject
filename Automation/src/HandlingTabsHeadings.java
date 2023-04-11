import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabsHeadings {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");		
	}
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("About your actiTIME")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Read Service Agreement")).click();
	Set<String> allwh = driver.getWindowHandles();
		for(String i:allwh)
		{
		driver.switchTo().window(i)	;
		String currenttitle=driver.getTitle();
		Thread.sleep(5000);
		System.out.println("currenttitle "+currenttitle);
	if(currenttitle.contains("Online"))
	{
	List<WebElement> headings = driver.findElements(By.xpath("//h2"));	
	for(int j=0;j<headings.size();j++)
	{
		System.out.println(headings.get(j).getText());
	}
	
	}
	//driver.close();
	}
		//Thread.sleep(20000);
//driver.close();			
}

}
