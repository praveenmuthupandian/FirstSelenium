package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
public class WindowHandleTest {

	public static void main(String[] args)
	{  
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/java/default.asp");
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[6]/p/a")).click();
		
		String window=driver.getWindowHandle();
		System.out.println("Parent :"+window);
		
		Set<String> windows=driver.getWindowHandles(); //unique IDs
		for(String handle:windows)
		{
			System.out.println(handle);
		}
		 List<String> handles=new ArrayList<>(windows); //set does't support index value
		 
		 driver.switchTo().window(handles.get(1)); //switch to child 
		 System.out.println(driver.getCurrentUrl());
		 driver.close();
		 
		 driver.switchTo().window(handles.get(0)); //switch to parent
		 System.out.println(driver.getCurrentUrl());
		 
		 driver.quit();
		 
		 
	}

}
