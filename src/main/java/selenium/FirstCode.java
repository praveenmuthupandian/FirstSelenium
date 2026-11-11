package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCode {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String actualTitle =driver.getTitle();
		
		String expectedTitle="Google";
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Test Passed");		
		}
		else
		{
			System.out.println("Test failed");
		}	
		
		driver.quit();	
		}

}
