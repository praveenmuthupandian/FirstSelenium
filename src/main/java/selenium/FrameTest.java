package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

    // Instance variable
    WebDriver driver;


    // Method to launch browser
    void launchBrowser() {

        driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5500/frames/index.html");

        System.out.println("Browser opened");
    }


    // Method for Main Page
    void mainPage() {

        driver.findElement(By.id("mainInput"))
              .sendKeys("Main Page");

        System.out.println("Main Page completed");
    }


    // Method for Frame A
    void frameA() {

        WebElement frameA =
                driver.findElement(By.id("frameA"));

        driver.switchTo().frame(frameA);

        System.out.println("Entered Frame A");

        driver.findElement(By.id("frameAInput"))
              .sendKeys("Frame A");

        System.out.println("Frame A completed");
    }


    // Method for Frame B
    void frameB() {

        WebElement frameB =
                driver.findElement(By.id("frameB"));

        driver.switchTo().frame(frameB);

        System.out.println("Entered Frame B");

        driver.findElement(By.id("frameBInput"))
              .sendKeys("Frame B");

        System.out.println("Frame B completed");
    }


    // Method for Frame C
    void frameC() {

        WebElement frameC =
                driver.findElement(By.id("frameC"));

        driver.switchTo().frame(frameC);

        System.out.println("Entered Frame C");

        driver.findElement(By.id("frameCInput"))
              .sendKeys("Frame C");

        System.out.println("Frame C completed");
    }


    // Method to click button
    void clickButton() {

        driver.findElement(By.id("submitButton"))
              .click();

        System.out.println("Button clicked");
    }


    // Method to return to main page
    void returnToMainPage() {

        driver.switchTo().defaultContent();

        System.out.println("Returned to Main Page");
    }


    // Method to close browser
    void closeBrowser() {

        driver.quit();

        System.out.println("Browser closed");
    }


    // Main method
    public static void main(String[] args) {

        // Creating object
        FrameTest obj =
                new FrameTest();

        // Calling methods using object

        obj.launchBrowser();

        obj.mainPage();

        obj.frameA();

        obj.frameB();

        obj.frameC();

        obj.clickButton();

        obj.returnToMainPage();

        obj.closeBrowser();
    }
}