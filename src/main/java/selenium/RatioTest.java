package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class RatioTest {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://127.0.0.1:5500/Ratio.html");
		
		WebElement male=driver.findElement(By.id("male"));
		
		//male-check
		System.out.println("Male Displayed: "+ male.isDisplayed());
		
		System.out.println("Male Enabled: "+ male.isEnabled());
		
		if(!male.isSelected())
		{
			male.click();
		}
		
		System.out.println("Male Selected: "+ male.isSelected());
		System.out.println("-----------------------------------");
		
		//female-check
		WebElement female=driver.findElement(By.id("female"));
		
		System.out.println("feMale Displayed: "+ female.isDisplayed());
		
		System.out.println("feMale Enabled: "+ female.isEnabled());
		
		if(!female.isSelected())
		{
			female.click();
		}
		
		System.out.println("Male selected after female clicked: "+male.isSelected());
		
		System.out.println("Female Selected: "+female.isSelected());
		System.out.println("----------------------------------------");
		
		//other-check
		
		WebElement other=driver.findElement(By.id("other"));
		
		System.out.println("Other Displayed: "+ other.isDisplayed());
		
		System.out.println("Other Enabled: "+ other.isEnabled());
		
		if(!other.isSelected())
		{
			other.click();
		}
		
		System.out.println("male and female Selected after other clicked: " +(male.isSelected() && female.isSelected()));
		System.out.println("Other selected: "+other.isSelected());
		System.out.println("----------------------------------------");
		
		//button-check
		driver.findElement(By.id("btn")).click();
		
		String result=driver.findElement(By.id("result")).getText();
		
		System.out.println("Result: "+result);
		driver.quit();		

	}

}
