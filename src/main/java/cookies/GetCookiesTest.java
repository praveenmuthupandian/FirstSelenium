package cookies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Cookie;

public class GetCookiesTest 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//get all cookies 
		for(Cookie cookie:driver.manage().getCookies())
		{
			System.out.println("Cookie name :"+ cookie.getName());
			System.out.println("Cookie value :"+ cookie.getValue());
			System.out.println("-----------------------------------");
		}
		
		//get Single Cookie using name 
		Cookie cookie=driver.manage().getCookieNamed("__Secure-STRP");
		
		System.out.println(cookie.getName());
		System.out.println(cookie.getValue());
		
		
		driver.quit();

	}

}
