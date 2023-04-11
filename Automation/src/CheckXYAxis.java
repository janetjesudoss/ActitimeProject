

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckXYAxis {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args)  {
			// TODO Auto-generated method stub
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	  //x and y and  axis of login button
	   int x1= driver.findElement(By.name("login")).getLocation().getX();
		  int y1= driver.findElement(By.name("login")).getLocation().getY();
		  System.out.println("X axis  dimension of login button is "+x1+" px");
		  System.out.println("Y axis  dimension of login button is "+y1+" px");
		  driver.close();
}
}
