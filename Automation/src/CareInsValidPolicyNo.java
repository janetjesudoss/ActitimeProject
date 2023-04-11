

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsValidPolicyNo {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	   //--->policy number
	   driver.findElement(By.id("policynumber")).sendKeys("123");
	 //--->date of birth
	   driver.findElement(By.id("dob")).click();
	 //select[@class='ui-datepicker-month']
	   //--->month in DOB
	   WebElement mnthlistbox = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	 //select[@class='ui-datepicker-year']
	 
	   	Select month=new Select(mnthlistbox);
	   	month.selectByIndex(7);
	   Thread.sleep(2000);
	 //--->year in DOB
	   WebElement yearlistbox = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	   Thread.sleep(2000);
	 
	   Select year=new Select(yearlistbox);
	   
	   Thread.sleep(2000);
 year.selectByVisibleText("1983");  //ERROR
	   
	 //--->date in DOB
	 //a[@data-date='25']
	   Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[@data-date='25']")).click();
	  
	  //--->contact no 
	  driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
	  Thread.sleep(2000);
	  //--->renew button
	  driver.findElement(By.id("renew_policy_submit")).click(); //ERROR
	  Thread.sleep(2000);
	    //verifying error message 
	  
	  if(driver.findElement(By.xpath("//span[text()='Please enter valid Policy No.']")).isDisplayed())
		  System.out.println("Verified that Enter valid policy number message is displayed");
		
		//driver.close();
		}


}
