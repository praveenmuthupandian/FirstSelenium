package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DateFileuploadAutosuggestion 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:5500/Date_FileUpload_AutoSuggestion/selenium-demo.html");
		
		driver.manage().window().maximize();
		
		//date picker
		WebElement datePicker=driver.findElement(By.id("datePicker"));	
		
		datePicker.sendKeys("09/06/2005");
		
		System.out.println("Date Selected");
		
		//file upload
		
		WebElement fileUpload=driver.findElement(By.id("fileUpload"));
		fileUpload.sendKeys("C:\\Users\\DELL\\Downloads\\PRAVEEN M- (Testing).pdf");
		
		System.out.println("Pdf Uploaded");
		
		//auto suggestion
		
		WebElement searchBox=driver.findElement(By.id("searchBox"));
		searchBox.sendKeys("java");
		
		System.out.println("Search entered");
		System.out.println("Suggestions :");
		
		List<WebElement> suggestion=driver.findElements(By.className("suggestion"));
		
		for(WebElement suggestions:suggestion)
		{
			String text=suggestions.getText();
			
			System.out.println(text);
				
				if(text.equalsIgnoreCase("java Springboot"))
				{
					suggestions.click();
					break;
				}
			
			
			
		}
		
		//submit button
		
		WebElement button=driver.findElement(By.id("submitButton"));
		button.click();
		
		//result
		
		String result=driver.findElement(By.id("result")).getText();
		
		System.out.println(result);
		
		driver.quit();
		
		
	}
}
