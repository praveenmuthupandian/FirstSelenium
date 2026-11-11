package cookies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Cookie;

public class DeleteCookiesTest 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//add Cookies
		Cookie mycookie1=new Cookie("pravi","fsjhfskvdf");
		Cookie mycookie2=new Cookie("prem","gfhsgfsjgvjdf");
		Cookie mycookie3=new Cookie("ram","jgvhjgfcs");
						
		driver.manage().addCookie(mycookie1);
		driver.manage().addCookie(mycookie2);
		driver.manage().addCookie(mycookie3);
		
		System.out.println("Cookies Added Successfully..!!");
		
		
		//Delete Cookie
		driver.manage().deleteCookieNamed("ram");
		System.out.println("Cookie Deleted");
		
		//deleteAll cookies
		
		driver.manage().deleteAllCookies();
		
		for(Cookie cookie:driver.manage().getCookies())
		{
			System.out.println("Name"+cookie.getName());
			System.out.println("Value"+cookie.getValue());
			System.out.println("______________________");
		}
		
		System.out.println("All cookies Deleted");
		driver.quit();


	}

}
