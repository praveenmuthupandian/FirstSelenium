package cookies;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Cookie;
public class AddCookiesTest {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//add Cookies
		Cookie mycookie=new Cookie("username","praveen");
		driver.manage().addCookie(mycookie);
		System.out.println("Cookies Added Successfully..!!");
		
		//view Added Cookies
		Cookie cookie=driver.manage().getCookieNamed("username");
		System.out.println(cookie.getName());
		System.out.println(cookie.getValue());
		
		driver.quit();

	}

}
