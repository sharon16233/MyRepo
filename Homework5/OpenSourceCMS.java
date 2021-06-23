package Homework5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenSourceCMS {

    public static final String baseUrl = "https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login";
    public static final String username = "opensourcecms";
    public static final String password = "opensourcecms";
    public static final int THREE_SECONDS = 3000;

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Utils.getDriver();
        driver.get(baseUrl);

        WebElement userNameField = driver.findElement(By.id("txtUsername"));
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        WebElement loginButton = driver.findElement(By.id("btnLogin"));

        Utils.inputText(userNameField, username);
        Utils.inputText(passwordField, password);
        Utils.clickOnElement(loginButton);
        Utils.waitForElement(THREE_SECONDS);

        System.out.println(driver.getCurrentUrl());

        driver.quit();
    }


}
