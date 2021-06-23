package Homework5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TheDemoSite {

    public static final String baseUrl = "http://thedemosite.co.uk/";

    public static void main(String[] args) {

        WebDriver driver = Utils.getDriver();
        driver.get(baseUrl);

        System.out.println(driver.getTitle());

        WebElement databaseButton = driver.findElement(By.linkText("2. The Database"));
        Utils.clickOnElement(databaseButton);

        System.out.println(driver.getPageSource());

        driver.quit();

    }

}
