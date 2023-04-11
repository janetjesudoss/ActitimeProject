

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckHeightWidth {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args)  {
			// TODO Auto-generated method stub
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://demo.actitime.com/");
	  //height and width of username
	  int h1= driver.findElement(By.name("login")).getSize().getHeight();
	  int w1= driver.findElement(By.name("username")).getSize().getWidth();
	 //height and width of password
	  int h2= driver.findElement(By.name("pwd")).getSize().getHeight();
	   int w2=driver.findElement(By.name("pwd")).getSize().getWidth();
	   //checking if equal
	   if(h1==h2 && w1==w2)		   
	  System.out.println("Username and Password textbox dimensions are equal");
	   else
	   System.out.println("Username and Password textbox dimensions are equal");
driver.close();
}

}
