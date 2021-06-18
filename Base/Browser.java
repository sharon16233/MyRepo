package Base;

import Base.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    public static WebDriver driver;
    public static String url = Constants.URL;

    public static void initiateDriver() {
        System.setProperty(Constants.WEB_DRIVER, Constants.CHROME_DRIVER_LOCATION);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void open(String url) {
        driver.get(url);
    }

    // Close driver
    public static void close() {
        driver.close();
    }

    // Quit driver
    public static void quit() {
        driver.quit();
    }


}
