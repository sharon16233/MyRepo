package Homework5;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PhpTravels {

    public static final String baseUrl = "https://phptravels.org/index.php?rp=/login";
    public static final String email = "test@test.com";
    public static final String password = "testpassword";
    public static final int TWO_SECONDS = 2000;

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Utils.getDriver();
        driver.get(baseUrl);

        WebElement emailField = driver.findElement(By.id("inputEmail"));
        WebElement passwrodField = driver.findElement(By.id("inputPassword"));
        WebElement rememberMeCheckBox = driver.findElement(By.name("rememberme"));
        WebElement loginButton = driver.findElement(By.id("login"));

        Utils.inputText(emailField, email);
        Utils.inputText(passwrodField, password);
        Utils.clickOnElement(rememberMeCheckBox);
        Utils.clickOnElement(loginButton);
        Utils.waitForElement(TWO_SECONDS);

        WebElement capchaMessage = driver.findElement(By.cssSelector("[class='alert alert-danger']"));

        System.out.println(capchaMessage.getText());

        driver.quit();
    }
}
