package com.store.pages.account;

import com.store.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AccountPage extends BasePage {
    public AccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//p[text()='Congratulations! Your new account has been successfully created!']")
    WebElement successMessage;
    public AccountPage verifyAccountPage() {
        Assert.assertTrue(shouldHaveText(successMessage,"Congratulations! Your new account has been successfully created!",05));
        return this;
    }
    @FindBy(xpath = "//h2[text()='My Account']")
    WebElement myAccountLogo;
    public AccountPage verifyAccountPageTitle() {
        Assert.assertTrue(isElementDisplayed(myAccountLogo));
        return this;
    }
}
