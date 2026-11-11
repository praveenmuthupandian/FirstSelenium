package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
public class DropDownTest {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://127.0.0.1:5500/DropDown.html");
		driver.manage().window().maximize();
		// <!-- Standard Dropdown -->
		WebElement city=driver.findElement(By.id("city"));
		
		Select select=new Select(city);
		
		select.selectByVisibleText("Madurai");
		
	
		WebElement selected =select.getFirstSelectedOption();
		System.out.println("Selected Option:"+selected.getText());
		
		
		List<WebElement> option=select.getOptions();
		System.out.println("....All Cities...");
		for(WebElement options:option)
		{
			System.out.println(options.getText());
		}
		
		// <!-- Multi Select -->
		WebElement skills=driver.findElement(By.id("skills"));
		Select selectSkill=new Select(skills);
		
		selectSkill.selectByVisibleText("Java");
		selectSkill.selectByVisibleText("Selenium");
		selectSkill.selectByVisibleText("MySQL");
		
		System.out.println(".........Multi Selected..........");
		List<WebElement> selectedSkill=selectSkill.getAllSelectedOptions();
		for(WebElement options:selectedSkill)
		{
		System.out.println(options.getText());
		}
		
//   <!-- Normal Custom Dropdown -->
		
		driver.findElement(By.id("experienceButton")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Fresher']")).click();
		
		//<!-- Bootstrap / Custom Dropdown -->
		driver.findElement(By.id("departmentButton")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Automation Testing']")).click();
	
		
		//Result
		
		String cityResult=driver.findElement(By.id("cityResult")).getText();
		String experienceResult=driver.findElement(By.id("experienceResult")).getText();
		String departmentResult=driver.findElement(By.id("departmentResult")).getText();
		
		System.out.println("Results");
		System.out.println("City: "+cityResult);
		System.out.println("Experience: "+experienceResult);
		System.out.println("Department: "+departmentResult);

		driver.quit();	
	}

}
