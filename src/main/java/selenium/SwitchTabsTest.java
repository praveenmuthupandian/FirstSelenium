package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WindowType;

public class SwitchTabsTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Tab 1 - Google
        driver.get("https://www.google.com");

        // Tab 2 - W3Schools
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.w3schools.com/");

        // Tab 3 - Flipkart
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.flipkart.com/");

        // -----------------------------------
        // Switch to Flipkart
        // -----------------------------------
        if (switchTabs(driver, "flipkart")) {

            System.out.println("Title: " + driver.getTitle());
            System.out.println("URL: " + driver.getCurrentUrl());

            driver.close();
        }

        // -----------------------------------
        // Switch to W3Schools
        // -----------------------------------
        if (switchTabs(driver, "w3schools")) {

            System.out.println("Title: " + driver.getTitle());
            System.out.println("URL: " + driver.getCurrentUrl());

            driver.close();
        }

        // -----------------------------------
        // Switch to Google
        // -----------------------------------
        if (switchTabs(driver, "google")) {

            System.out.println("Title: " + driver.getTitle());
            System.out.println("URL: " + driver.getCurrentUrl());

            driver.close();
        }

        // Close the WebDriver session
        driver.quit();
    }

    // ==========================================
    // Method to switch tab using URL
    // ==========================================
    public static boolean switchTabs(WebDriver driver, String expectedString) 
    {

        // Get all window/tab handles
        for (String handle : driver.getWindowHandles()) {

            // Switch to current handle
            driver.switchTo().window(handle);

            // Get current URL
            String url = driver.getCurrentUrl();

            // Check whether URL contains expected text
            if (url.toLowerCase()
                    .contains(expectedString.toLowerCase())) {

                System.out.println(
                        "Tab found: " + expectedString);

                return true;
            }
        }

        // If no matching tab is found
        System.out.println(
                "Tab not found: " + expectedString);

        return false;
    }
}