package Tests;

import Methods.HomePageMethods;
import Methods.LoginPageMethods;
import org.junit.Test;

public class HomePageTest extends HomePageMethods {

    @Test
    public void goToTransactionsTest() throws InterruptedException {
        LoginPageMethods.performLogin();
        goToTransactions();
    }

}
