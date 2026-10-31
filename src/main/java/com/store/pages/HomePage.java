package com.store.pages;

import com.store.pages.registrationAndLogin.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "Login")
    WebElement loginLink;

    public LoginPage selectLoginLink() {
        wait.until(ExpectedConditions.elementToBeClickable(loginLink)).click();

        return new LoginPage(driver);
    }
    @FindBy(css = ".ico-logout")
    WebElement logoutButton;
    public HomePage clickOnLogOutLinkIfPresent() {
        wait.until(ExpectedConditions.elementToBeClickable(logoutButton)).click();
        return this;
    }
    @FindBy(css = ".header a[href='/login']")
    List<WebElement> loginLinks;

    @FindBy(css = ".header a[href='/logout']")
    List<WebElement> logoutLinks;
    public boolean isLoginLinkPresent() {
        return loginLinks.size() > 0;
    }

    public boolean isLogoutLinkPresent() {
        return logoutLinks.size() > 0;
    }

    public HomePage clickLogOutLinkIfPresent() {
        if (isLogoutLinkPresent()) {
            logoutLinks.get(0).click();
        }
        return this;
    }
    @FindBy(xpath = "//span[text()='Account']")
    WebElement myAccount;
    public HomePage clickOnMyAccountButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(myAccount));

        new Actions(driver)
                .moveToElement(myAccount)
                .perform();

        return this;
    }
    @FindBy(linkText = "Login")
    WebElement loginLinkInMyAccountHeader;
    public LoginPage selectLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginLinkInMyAccountHeader))
                .click();
        return new LoginPage(driver);
    }
}

