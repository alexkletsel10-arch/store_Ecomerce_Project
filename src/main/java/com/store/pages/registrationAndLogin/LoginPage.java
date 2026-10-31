package com.store.pages.registrationAndLogin;

import com.store.pages.BasePage;
import com.store.pages.HomePage;
import com.store.pages.account.AccountPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public HomePage login(String email, String password) {
        fillInLoginForm(email, password);
        return new HomePage(driver);
    }
    @FindBy(id = "input-email")
    WebElement loginEmailField;
    @FindBy(id = "input-password")
    WebElement loginPasswordField;
    public LoginPage fillInLoginForm(String email, String password) {
        wait.until(ExpectedConditions.visibilityOf(loginEmailField)).sendKeys(email);
        wait.until(ExpectedConditions.visibilityOf(loginPasswordField)).sendKeys(password);
        return this;
    }
    @FindBy(css = "input[value='Login']")
    WebElement loginButton;
    public AccountPage clickOnLoginButtonOnLoginForm() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton))
                .click();
        return new AccountPage(driver);

    }
}
