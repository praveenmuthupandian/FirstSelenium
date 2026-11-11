package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:5500/Login.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("adin123");
		
		driver.findElement(By.id("loginButton")).click();
		
		String message=driver.findElement(By.id("message")).getText();
		
		System.out.println("Message: "+message);
		
		driver.quit();
		
		

	}

}
