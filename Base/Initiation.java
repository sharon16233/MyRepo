package Base;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class Initiation {

    public static SharedUi sharedUi;

    @BeforeClass
    public static void init() {
        Browser.initiateDriver();
        sharedUi = new SharedUi(Browser.getDriver());
        Browser.getDriver().get(Constants.URL);
    }

    @AfterClass
    public static void closeDriver() {
        Browser.getDriver().close();
    }
}
