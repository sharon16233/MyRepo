package Lesson06;

import Homework5.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Lesson06 {

    private static final String baseUrl = "https://ims.gov.il/he";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Utils.getDriver();
        driver.get(baseUrl);
        Utils.waitForElement(3000);

        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'תחול עלייה קלה נוספת בטמפרטורות והכבדה נוספת בעומס')]"));

        System.out.println(element.getText());

        driver.quit();

    }
}
