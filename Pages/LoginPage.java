package Pages;

import Base.BasicPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasicPage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "userCode")
    public WebElement userNameTextBox;

    @FindBy(id = "password")
    public WebElement passwordTextBox;

    @FindBy(css = "auth-rb-login .login .login-container .login-content .login-details .login-btn")
    public WebElement loginBtn;
}
