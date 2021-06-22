package Lesson05;

import Base.Constants;
import Base.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;
import java.util.List;

public class Mobile {

    private static final String baseUrl = "https://www.gsmarena.com/";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Utilities.getDriver();
        driver.get(baseUrl);


        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("The site has " + links.size() + " links." );
        int samsungCount = 0, xiaomiCount = 0;


        for(WebElement element : links) {
            if(element.getText().toLowerCase().contains("samsung"))
                samsungCount++;
            else if(element.getText().toLowerCase().contains("xiaomi"))
                xiaomiCount++;
        }

        System.out.println("Xiaomi count: " + xiaomiCount);
        System.out.println("Samsung count: " + samsungCount);

        if(samsungCount > xiaomiCount)
            System.out.println("Go Samsung");
        else if(xiaomiCount > samsungCount)
            System.out.println("Go Xiaomi");
        else
            System.out.println("Go both");


        driver.quit();

    }

}
