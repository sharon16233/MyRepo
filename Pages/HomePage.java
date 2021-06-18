package Pages;

import Base.BasicPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasicPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "mega-menu-1")
    public WebElement overVaShavBtn;
}
