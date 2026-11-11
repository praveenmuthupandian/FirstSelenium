package selenium;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
public class FluentWaitTest {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://127.0.0.1:5500/FluentWaitTest.html");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin123");
		driver.findElement(By.id("loginBtn")).click();
		String output=driver.findElement(By.id("message")).getText();
		
		if(output.equals("Invalid Username or Password!"))
		{
			System.out.println("Invalid Credential");
			driver.quit();
		}
		else
		{
			FluentWait<WebDriver> wait=new FluentWait<>(driver)
					.withTimeout(Duration.ofSeconds(20))
					.pollingEvery(Duration.ofSeconds(2))
					.ignoring(NoSuchElementException.class);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dashboard")));
			
			driver.findElement(By.id("dashboard")).click();
			
			String mess=driver.findElement(By.id("message")).getText();
			System.out.println(mess);
			driver.quit();
		}
	}
}
