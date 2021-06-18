package Methods;

import Base.*;
import org.junit.Assert;

import Base.Initiation;

public class HomePageMethods extends Initiation {

    public void goToTransactions() throws InterruptedException {
        Utilities.waitForElement(Constants.THREE_SECONDS);
        Utilities.clickOnElement(sharedUi.homePage.overVaShavBtn);
        Utilities.waitForElement(Constants.TWO_SECONDS);
        String expected=  "תנועות בחשבון";
        Assert.assertEquals(expected, Browser.getDriver().getTitle());
    }
}
