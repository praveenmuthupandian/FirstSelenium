package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import java.nio.file.Files;
import java.io.File;
import java.io.IOException;
import java.nio.file.StandardCopyOption;

public class ScreenshotElementTest2 
{
	public static void takeScreenshot(WebElement element, String filename) throws IOException
	{
		File folder=new File("screenshots");
		
		if(!folder.exists())
		{
			folder.mkdirs();
		}
		
		File source=element.getScreenshotAs(OutputType.FILE);
		
		File destination=new File(folder,filename);
		
		Files.copy(
		        source.toPath(),
		        destination.toPath(),
		        StandardCopyOption.REPLACE_EXISTING
		);
		
		System.out.println("Screenshot saved"+ destination.getAbsolutePath());
		
	
	}

	public static void main(String[] args) throws IOException
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://127.0.0.1:5500/Login.html");
		
		WebElement loginBox=driver.findElement(By.id("username"));
		WebElement passwordBox=driver.findElement(By.id("password"));
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		
		takeScreenshot(loginBox, "loginBox.png");
		takeScreenshot(passwordBox,"password.png");
		takeScreenshot(loginButton,"loginButton.png");
		
		driver.quit();

	}

}
