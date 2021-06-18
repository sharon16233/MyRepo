package Methods;

import Base.Constants;
import Base.Initiation;
import Base.SharedUi;
import Base.Utilities;

public class LoginPageMethods  extends Initiation {

    public static void performLogin() {
        Utilities.sendText(sharedUi.loginPage.userNameTextBox, Constants.username);
        Utilities.sendText(sharedUi.loginPage.passwordTextBox, Constants.password);
        Utilities.clickOnElement(sharedUi.loginPage.loginBtn);
    }

}
