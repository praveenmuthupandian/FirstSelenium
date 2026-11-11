package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
public class MouseActionTest {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:5500/MouseActionTest.html");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		
		//Left Click
		WebElement leftClick=driver.findElement(By.id("clickButton"));
		action.click(leftClick).perform();
		String leftResult=driver.findElement(By.id("clickResult")).getText();
		System.out.println(leftResult);
		
		
		//Mouse Hover
		WebElement hoverMenu=driver.findElement(By.id("hoverBox"));
		action.moveToElement(hoverMenu).perform();
		
		//DoubleClick using mouse
		WebElement doubleClick=driver.findElement(By.id("doubleClickButton"));
		action.doubleClick(doubleClick).perform();
		String doubleResult=driver.findElement(By.id("doubleResult")).getText();
		System.out.println(doubleResult);
		
		
		//RightClick using mouse
		WebElement rightClick=driver.findElement(By.id("rightClickButton"));
		action.contextClick(rightClick).perform();
		String rightResult=driver.findElement(By.id("rightResult")).getText();
		System.out.println(rightResult);
		
		//click and hold
		
		WebElement clickAndHold=driver.findElement(By.id("holdButton"));
		action.clickAndHold(clickAndHold).perform();
		String clickHoldResult=driver.findElement(By.id("holdResult")).getText();
		System.out.println(clickHoldResult);
		
		//Drag and Drop
		WebElement source=driver.findElement(By.id("source"));
		WebElement target=driver.findElement(By.id("target"));
		
		action.dragAndDrop(source, target).perform();
		String dragResult=driver.findElement(By.id("dragResult")).getText();
		System.out.println(dragResult);
		
		//move By offset
		
		WebElement box=driver.findElement(By.id("offsetBox"));
		action.moveToElement(box)
				.moveByOffset(100, 50)
				.perform();
		
		driver.quit();
		

	}

}
