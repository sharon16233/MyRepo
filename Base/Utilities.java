package Base;

import Base.Browser;
import org.openqa.selenium.WebElement;
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
}
