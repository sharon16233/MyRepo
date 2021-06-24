package Homework5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TheAutomatedTester {

    public static final String baseUrl = "http://book.theautomatedtester.co.uk/chapter1";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Utils.getDriver();
        driver.get(baseUrl);

        WebElement textBoxField = driver.findElement(By.id("html5div"));
        WebElement loadTextButton = driver.findElement(By.id("secondajaxbutton"));

        System.out.println(textBoxField.getText());
        Utils.clickOnElement(loadTextButton);
        Utils.waitForElement(Utils.ONE_SECOND);
        System.out.println(textBoxField.getText());

        driver.quit();
    }
}
