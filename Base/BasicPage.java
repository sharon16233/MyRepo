package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasicPage {

    public BasicPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
