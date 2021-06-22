package Lesson05;

import Base.Constants;
import Base.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Lesson5 {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Utilities.getDriver();
        driver.get("https://download.cnet.com/");

//       WebElement searchTextBox = driver.findElement(By.name("q"));
//       Utilities.sendText(searchTextBox, "Sharon");
//       Utilities.waitForElement(Constants.TWO_SECONDS);
//       WebElement searchButton = driver.findElement(By.cssSelector("[aria-label='חיפוש ב-Google']"));
//
//       Utilities.clickOnElement(searchButton);
//
//       Utilities.waitForElement(Constants.FIVE_SECONDS);

        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());





        driver.quit();

    }

}
