

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckGenderRadioButton {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException  {
			// TODO Auto-generated method stub
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	  //click on Create new account button
	   driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
	   Thread.sleep(3000);
		  int gen1y = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
		  System.out.println("Y axis of 1st radio button "+gen1y);
		  Thread.sleep(1000);
		  int gen2y = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
		  System.out.println("Y axis of 2nd radio button "+gen2y);
		  Thread.sleep(1000);
		  int gen3y = driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY();
		  System.out.println("Y axis of  3rd radio button "+gen3y);
		  if(gen1y==gen2y && gen2y==gen3y)
			  
		 
		  System.out.println("Y axis  of gender radio button are properly aligned ");
		  else
			  System.out.println("Y axis  of gender radio button are not properly aligned ");
		  driver.close();

}
}
