package selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class ImplicitAndExplicitWaitTest {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:5500/ExplicitTest.html");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//explicit Wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.findElement(By.id("loadButton")).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("username")));
		
		driver.findElement(By.id("username")).sendKeys("");
		System.out.println("Username Selection Visibled");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginButton")));
		System.out.println("Login Button Visibled");
		
		driver.findElement(By.id("loginButton")).click();
		String res=driver.findElement(By.id("message")).getText();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("message"),res));
		System.out.println("Result Message Visibled :"+res);
		
		
		driver.quit();
		
		
		

	}

}
