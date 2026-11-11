package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessTest1 
{
	public static void main(String[] args)
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new");
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.google.com");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.quit();
		
		
	}

}
