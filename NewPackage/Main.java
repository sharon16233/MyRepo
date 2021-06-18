package NewPackage;

import Base.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main(String[] args) {

       String s1 = " Hi everyone, how are you? ";

        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.startsWith("Hi"));
        System.out.println(s1.length());
        System.out.println(s1.trim());

    }

    public static char findCharAtIndex(String text, int index) {
        return text.charAt(index);
    }

    public static String concatStrings(String text, String anotherText) {
        return text.concat(anotherText);
    }

    public static boolean compareStrings(String text, String anotherText) {
        return text.equals(anotherText);
    }

    public static void lunchWebsite() {
        System.setProperty(Constants.WEB_DRIVER, Constants.CHROME_DRIVER_LOCATION);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constants.URL);
        driver.close();
    }
}
