import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
	
	private WebElement untbx;
	private WebElement pwtbx;
	private WebElement lognbtn;
	public LoginPage(WebDriver driver)  //constructor
	{
		
		untbx=driver.findElement(By.id("username"));
		pwtbx=driver.findElement(By.name("pwd"));
		lognbtn=driver.findElement(By.xpath("//div[text()='Login ']"));
	}
	//business logic method
	public void setLogin(String un,String pw) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lognbtn.click();
	

}
}
