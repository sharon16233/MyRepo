package Tests;

import Base.SharedUi;
import Methods.LoginPageMethods;
import Base.Initiation;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginPageTest extends LoginPageMethods  {

    @Test
    public void A_performLoginTest() {
        performLogin();
    }

    @Test
    public void B_getHeadlineTest() throws InterruptedException {
        String headline = "דף הבית";
        Thread.sleep(3000);
        assertEquals(headline, SharedUi.driver.getTitle());
    }
}
