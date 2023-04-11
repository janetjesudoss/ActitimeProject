

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LBOnlyDuplicates {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	   WebDriver driver=new ChromeDriver();
	   driver.get("file:///C:/Users/hp/Desktop/listbox.html");
	   
       WebElement mtrlistbox = driver.findElement(By.id("mtr"));
       Select s=new Select(mtrlistbox);
       List<WebElement> mtrlist = s.getOptions();
       int count=mtrlist.size();
       ArrayList<String> h=new ArrayList<String>();
     
       System.out.println("Printing only duplicates: ");
       for(int i=0;i<count;i++)
       {
    	   if(h.contains(mtrlist.get(i).getText()))
    			   {
    		      System.out.println(mtrlist.get(i).getText());
    			   }
    	  h.add(mtrlist.get(i).getText()) ;
       }
      
       driver.close();

}
}