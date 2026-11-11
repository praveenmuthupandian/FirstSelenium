package js;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class JsTest1 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://127.0.0.1:5500/Date_FileUpload_AutoSuggestion/JSExecutor/index.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		WebElement username=driver.findElement(By.id("username"));
		js.executeScript("arguments[0].value='praveen'",username);
		js.executeScript("arguments[0].style.border='3px solid red'", username);
		
		WebElement password=driver.findElement(By.id("password"));
		js.executeScript("arguments[0].value='1234'", password);
		js.executeScript("arguments[0].style.border='3px solid red'", password);
		
		WebElement login=driver.findElement(By.id("loginButton"));
		js.executeScript("arguments[0].click();", login);
			

	}

}
