package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class AlertTest {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Alert alert=driver.switchTo().alert();
		
		alert.accept();
		
		System.out.println("Sample Alert Accepted Successfully");
		
		driver.quit();
	}

}
