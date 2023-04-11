

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectLBox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/hp/Desktop/listbox.html");
			WebElement listbox = driver.findElement(By.id("mtr"));
			Select s=new Select(listbox);
			s.selectByIndex(0);
			s.selectByValue("v");
			s.selectByVisibleText("dosa");
			s.deselectByIndex(2);
		    s.deselectByValue("d");
		    s.deselectByVisibleText("idly");
		    System.out.println("is dropdown multiple "+s.isMultiple());
		    
		    WebElement cplistbox = driver.findElement(By.id("cp"));
		    Select s2=new Select(cplistbox);
		    WebElement first = s2.getFirstSelectedOption();
		    String text=first.getText();
		    System.out.println("first option of checkpost listbox "+text);
		    List<WebElement> allseloptions = s2.getAllSelectedOptions();
		    
		    int count=allseloptions.size();
		    System.out.println("Printing all select options--");
		    for(int i=0;i<count;i++)
		    {
		    	System.out.println(allseloptions.get(i).getText());
		    }
		    
		    
		}

}
