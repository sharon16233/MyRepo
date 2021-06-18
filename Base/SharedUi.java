package Base;

import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class SharedUi {

    public static LoginPage loginPage;
    public static HomePage homePage;
    public static WebDriver driver;

    public SharedUi(WebDriver driver) {
        this.driver = driver;
        this.loginPage = new LoginPage(driver);
        this.homePage = new HomePage(driver);
    }
}
