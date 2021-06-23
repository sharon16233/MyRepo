package Homework5;

import Base.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Utils {

    public static final String WEB_DRIVER = "webdriver.chrome.driver";
    public static final String CHROME_DRIVER_LOCATION = "D:\\New folder\\IntelligiTest\\chromedriver.exe";

    public static WebDriver getDriver() {
        System.setProperty(WEB_DRIVER, CHROME_DRIVER_LOCATION);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        return new ChromeDriver(options);
    }

    public static void inputText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public static void clickOnElement(WebElement element) {
        element.click();
    }

    public static void waitForElement(int time) throws InterruptedException {
        Thread.sleep(time);
    }

}
