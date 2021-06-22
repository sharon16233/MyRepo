package Base;

import Base.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Utilities {

    public static void clickOnElement(WebElement element) {
        element.click();
    }

    public static void sendText(WebElement element, String text) {
        element.sendKeys(text);
    }

    public static void hoverOnElement(WebElement element) {
        Actions action = new Actions(Browser.getDriver());
        action.moveToElement(element).perform();
    }
    public static void waitForElement(int time) throws InterruptedException {
        Thread.sleep(time);
    }

    public static WebDriver getDriver() {

        System.setProperty(Constants.WEB_DRIVER, Constants.CHROME_DRIVER_LOCATION);

        //https://peter.sh/experiments/chromium-command-line-switches/#no-sandbox
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
      // options.addArguments("--incognito");
      // options.addArguments("--headless");

        return new ChromeDriver(options);
    }
}
