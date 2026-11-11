package selenium;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
public class ScreenshotTest1 
{

	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:5500/Login.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin123");
		
		driver.findElement(By.id("loginButton")).click();
		
		String message=driver.findElement(By.id("message")).getText();
		
		System.out.println("Message: "+message);
		
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("login_fail.png");
		
		Files.copy(
				source.toPath(),
				destination.toPath(),
				java.nio.file.StandardCopyOption.REPLACE_EXISTING);
		
		System.out.println("Screenshot saved :"+destination.getAbsolutePath());
		driver.quit();
		
	}

}
