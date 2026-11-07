package com.store.pages.registrationAndLogin;

import com.store.pages.BasePage;
import com.store.pages.account.AccountPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button[title='Continue']")
    WebElement registerLink;

    public RegistrationPage selectContinueRegistrationButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(registerLink))
                .click();

        return new RegistrationPage(driver);
    }

    @FindBy(id = "AccountFrm_firstname")
    WebElement firstNameField;
    @FindBy(id = "AccountFrm_lastname")
    WebElement lastNameField;
    @FindBy(id = "AccountFrm_email")
    WebElement emailField;
    @FindBy(id = "AccountFrm_telephone")
    WebElement phoneField;
    @FindBy(id = "AccountFrm_company")
    WebElement companyNameField;
    @FindBy(id = "AccountFrm_address_1")
    WebElement addressField1;
    @FindBy(id = "AccountFrm_city")
    WebElement cityField;
    @FindBy(id = "AccountFrm_zone_id")
    WebElement regionStateField;
    @FindBy(id = "AccountFrm_postcode")
    WebElement zipCodeField;
    @FindBy(id = "AccountFrm_country_id")
    WebElement countryDropdown;
    @FindBy(id = "AccountFrm_password")
    WebElement passwordField;
    @FindBy(id = "AccountFrm_confirm")
    WebElement confirmPassword;
    @FindBy(id = "AccountFrm_loginname")
    WebElement loginNameField;
    @FindBy(id = "AccountFrm_newsletter1")
    WebElement subscribeYes;
    @FindBy(id = "AccountFrm_newsletter0")
    WebElement subscribeNo;

    public RegistrationPage fillInRegistrationForm(String option, String firstName, String lastName, String email, String phone,String companyName,String address ,String city, String state, String zipCode, String country, String loginName, String passwordF, String confirmP) {
        wait.until(ExpectedConditions.visibilityOf(firstNameField)).sendKeys(firstName);
        type(lastNameField, lastName);
        type(emailField, email);
        type(phoneField, phone);
        type(companyNameField, companyName);
        type(addressField1, address);
        type(cityField, city);
        new Select(countryDropdown).selectByVisibleText(country);

        if (!state.isBlank()) {
            wait.until(ExpectedConditions.textToBePresentInElement(
                    regionStateField, state));
            new Select(regionStateField).selectByVisibleText(state);
        }
        type(zipCodeField, zipCode);
        type(loginNameField, loginName);
        type(passwordField, passwordF);
        type(confirmPassword, confirmP);


        if (option.equalsIgnoreCase("Yes")) {
            click(subscribeYes);
        } else if (option.equalsIgnoreCase("No")) {
            click(subscribeNo);
        }
        return this;
    }

    @FindBy(id = "AccountFrm_agree")
    WebElement checkBox;

    public RegistrationPage selectCheckBox() {
        wait.until(ExpectedConditions.elementToBeClickable(checkBox))
                .click();
        return this;
    }

    @FindBy(css = "button[value='Continue']")
    WebElement continueButton;

    public AccountPage clickOnContinueButton() {
        wait.until(ExpectedConditions.elementToBeClickable(continueButton))
                .click();
        return new AccountPage(driver);

    }


    @FindBy(xpath = "//span[text()='Email Address does not appear to be valid!']")
    WebElement errorMessage;

    public RegistrationPage verifyErrorMessage() {
        wait.until(ExpectedConditions.visibilityOf(errorMessage));
        Assert.assertTrue(shouldHaveText(errorMessage, "Email Address does not appear to be valid!", 05));
        return this;
    }

    @FindBy(css = "button[title='Continue']")
    WebElement continueButtonAtRegPage;
    public RegistrationPage clickOnContinueButtonOnRegPage() {
        wait.until(ExpectedConditions.elementToBeClickable(continueButtonAtRegPage))
                .click();
        return this;
    }

public RegistrationPage verifyTooltipMessage(String expectedText) {
    WebElement tooltip = wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//span[text()='" + expectedText + "']")
            )
    );
    Assert.assertEquals(tooltip.getText().trim(), expectedText);

    return this;
}
    @FindBy(xpath = "//div[text()=' Warning: You must agree to the Privacy Policy!']")
    WebElement warningMessage;
    public RegistrationPage verifyCheckBoxErrorMessage(String text) {
        wait.until(ExpectedConditions.visibilityOf(warningMessage));
        Assert.assertTrue(isElementDisplayed(warningMessage));
        return this;
    }
}






