package Lesson04;

import Base.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty(Constants.WEB_DRIVER, Constants.CHROME_DRIVER_LOCATION);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constants.URL);
        Thread.sleep(Constants.THREE_SECONDS);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
