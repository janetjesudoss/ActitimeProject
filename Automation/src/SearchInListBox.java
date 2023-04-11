

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchInListBox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	   WebDriver driver=new ChromeDriver();
	   driver.get("file:///C:/Users/hp/Desktop/listbox.html");
	   Thread.sleep(2000);
       WebElement mtrlistbox = driver.findElement(By.id("mtr"));
       Select s=new Select(mtrlistbox);
       Thread.sleep(2000);
       List<WebElement> mtrlist = s.getOptions();       
       int count=mtrlist.size();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value to search : ");
       
       String searchtext=sc.nextLine();
       //Thread.sleep(5000);
       ArrayList<String> h=new ArrayList<String>();
       
       for(int i=0;i<count;i++)
       {
    	   
    	  h.add(mtrlist.get(i).getText()) ;
       }
      // Thread.sleep(5000);
       System.out.println("the values in list "+h);
       if(h.contains(searchtext))
	   {
      System.out.println("The entered text "+searchtext+" is present in  the MTR list");
	   }
       else
    	   System.out.println("not present");   
       
      driver.close();

}
}


