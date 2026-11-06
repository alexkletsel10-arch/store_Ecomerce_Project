package com.store.tests;

import com.store.pages.HomePage;
import com.store.pages.registrationAndLogin.RegistrationPage;
import com.store.pages.utility.DataProviders;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(driver)
                .clickOnMyAccountButton()
                .selectLoginLink();

    }

    @Test(dataProvider = "storeSuccessReg", dataProviderClass = DataProviders.class)
    public void succesfullRegistration(String firstN, String lastN, String emailF, String phoneF, String companyF, String address1F, String cityF, String regionF, String zipCodeF, String countryF, String loginNameF, String password, String confirmP) {
        new RegistrationPage(driver)
                .selectContinueRegistrationButton()
                .fillInRegistrationForm("yes", firstN, lastN, emailF, phoneF, companyF, address1F, cityF, regionF, zipCodeF, countryF, loginNameF, password, confirmP)
                .selectCheckBox()
                .clickOnContinueButtonOnRegPage();

    }

    @Test(dataProvider = "storeInvalidEmailCsv", dataProviderClass = DataProviders.class)
    public void invalidEmailFieldRegistrationTest(String firstN, String lastN, String emailF, String phoneF, String companyF, String address1F, String cityF, String regionF, String zipCodeF, String countryF, String loginNameF, String password, String confirmP) {
        new RegistrationPage(driver)
                .selectContinueRegistrationButton()
                .fillInRegistrationForm("yes", firstN, lastN, emailF, phoneF, companyF, address1F, cityF, regionF, zipCodeF, countryF, loginNameF, password, confirmP)
                .selectCheckBox()
                .clickOnContinueButtonOnRegPage()
                .verifyErrorMessage();
    }

    @Test(dataProvider = "storeEmptyEmailCsv", dataProviderClass = DataProviders.class)
    public void emptyEmailFieldRegistrationTest(String firstN, String lastN, String emailF, String phoneF, String companyF, String address1F, String cityF, String regionF, String zipCodeF, String countryF, String loginNameF, String password, String confirmP) {
        new RegistrationPage(driver)
                .selectContinueRegistrationButton()
                .fillInRegistrationForm("no", firstN, lastN, emailF, phoneF, companyF, address1F, cityF, regionF, zipCodeF, countryF, loginNameF, password, confirmP)
                .selectCheckBox()
                .clickOnContinueButtonOnRegPage()
                .verifyErrorMessage();
    }

    @Test(dataProvider = "storeFirstNameFieldCsv", dataProviderClass = DataProviders.class)
    public void emptyFirstNameFieldRegistrationTest(String firstN, String lastN, String emailF, String phoneF, String companyF, String address1F, String cityF, String regionF, String zipCodeF, String countryF, String loginNameF, String password, String confirmP) {
        new RegistrationPage(driver)
                .selectContinueRegistrationButton()
                .fillInRegistrationForm("no", firstN, lastN, emailF, phoneF, companyF, address1F, cityF, regionF, zipCodeF, countryF, loginNameF, password, confirmP)
                .selectCheckBox()
                .clickOnContinueButtonOnRegPage()
                .verifyTooltipMessage("First Name must be between 1 and 32 characters!");
    }

    @Test(dataProvider = "storeTooLongFirstNameFieldReg", dataProviderClass = DataProviders.class)
    public void tooLongFirstNameFieldRegistrationTest(String firstN, String lastN, String emailF, String phoneF, String companyF, String address1F, String cityF, String regionF, String zipCodeF, String countryF, String loginNameF, String password, String confirmP) {
        new RegistrationPage(driver)
                .selectContinueRegistrationButton()
                .fillInRegistrationForm("no", firstN, lastN, emailF, phoneF, companyF, address1F, cityF, regionF, zipCodeF, countryF, loginNameF, password, confirmP)
                .selectCheckBox()
                .clickOnContinueButtonOnRegPage()
                .verifyTooltipMessage("First Name must be between 1 and 32 characters!");
    }

    @Test(dataProvider = "storeLastNameFieldCsv", dataProviderClass = DataProviders.class)
    public void emptyLastNameFieldRegistrationTest(String firstN, String lastN, String emailF, String phoneF, String companyF, String address1F, String cityF, String regionF, String zipCodeF, String countryF, String loginNameF, String password, String confirmP) {
        new RegistrationPage(driver)
                .selectContinueRegistrationButton()
                .fillInRegistrationForm("no", firstN, lastN, emailF, phoneF, companyF, address1F, cityF, regionF, zipCodeF, countryF, loginNameF, password, confirmP)
                .selectCheckBox()
                .clickOnContinueButtonOnRegPage()
                .verifyTooltipMessage("Last Name must be between 1 and 32 characters!");
    }

    @Test(dataProvider = "storeTooLongLastNameFieldCsv", dataProviderClass = DataProviders.class)
    public void tooLongLastNameFieldRegistrationTest(String firstN, String lastN, String emailF, String phoneF, String companyF, String address1F, String cityF, String regionF, String zipCodeF, String countryF, String loginNameF, String password, String confirmP) {
        new RegistrationPage(driver)
                .selectContinueRegistrationButton()
                .fillInRegistrationForm("no", firstN, lastN, emailF, phoneF, companyF, address1F, cityF, regionF, zipCodeF, countryF, loginNameF, password, confirmP)
                .selectCheckBox()
                .clickOnContinueButtonOnRegPage()
                .verifyTooltipMessage("Last Name must be between 1 and 32 characters!");

    }
    @Test(dataProvider = "storeTooLongTelephoneFieldCsv", dataProviderClass = DataProviders.class)
    public void tooLongTelephoneFieldRegistrationTest(String firstN, String lastN, String emailF, String phoneF, String companyF, String address1F, String cityF, String regionF, String zipCodeF, String countryF, String loginNameF, String password, String confirmP) {
        new RegistrationPage(driver)
                .selectContinueRegistrationButton()
                .fillInRegistrationForm("no", firstN, lastN, emailF, phoneF, companyF, address1F, cityF, regionF, zipCodeF, countryF, loginNameF, password, confirmP)
                .selectCheckBox()
                .clickOnContinueButtonOnRegPage()
                .verifyTooltipMessage("Telephone must be between 3 and 32 characters!");
    }
   @Test(dataProvider = "storeEmptyAddress1FieldCsv", dataProviderClass = DataProviders.class)
    public void emptyAddress1field(String firstN, String lastN, String emailF, String phoneF, String companyF, String address1F, String cityF, String regionF, String zipCodeF, String countryF, String loginNameF, String password, String confirmP){
       new RegistrationPage(driver)
               .selectContinueRegistrationButton()
               .fillInRegistrationForm("no", firstN, lastN, emailF, phoneF, companyF, address1F, cityF, regionF, zipCodeF, countryF, loginNameF, password, confirmP)
               .selectCheckBox()
               .clickOnContinueButtonOnRegPage()
               .verifyTooltipMessage("Address 1 must be between 3 and 128 characters!");
}
    @Test(dataProvider = "storeShortAddress1FieldCsv", dataProviderClass = DataProviders.class)
    public void shortAddress1field(String firstN, String lastN, String emailF, String phoneF, String companyF, String address1F, String cityF, String regionF, String zipCodeF, String countryF, String loginNameF, String password, String confirmP){
        new RegistrationPage(driver)
                .selectContinueRegistrationButton()
                .fillInRegistrationForm("no", firstN, lastN, emailF, phoneF, companyF, address1F, cityF, regionF, zipCodeF, countryF, loginNameF, password, confirmP)
                .selectCheckBox()
                .clickOnContinueButtonOnRegPage()
                .verifyTooltipMessage("Address 1 must be between 3 and 128 characters!");
    }
    @Test(dataProvider = "storeTooLongeAddress1FieldCsv", dataProviderClass = DataProviders.class)
    public void tooLongeAddress1field(String firstN, String lastN, String emailF, String phoneF, String companyF, String address1F, String cityF, String regionF, String zipCodeF, String countryF, String loginNameF, String password, String confirmP){
        new RegistrationPage(driver)
                .selectContinueRegistrationButton()
                .fillInRegistrationForm("no", firstN, lastN, emailF, phoneF, companyF, address1F, cityF, regionF, zipCodeF, countryF, loginNameF, password, confirmP)
                .selectCheckBox()
                .clickOnContinueButtonOnRegPage()
                .verifyTooltipMessage("Address 1 must be between 3 and 128 characters!");
    }
    @Test(dataProvider = "storeEmptyCityFieldCsv", dataProviderClass = DataProviders.class)
    public void emptyCityField(String firstN, String lastN, String emailF, String phoneF, String companyF, String address1F, String cityF, String regionF, String zipCodeF, String countryF, String loginNameF, String password, String confirmP){
        new RegistrationPage(driver)
                .selectContinueRegistrationButton()
                .fillInRegistrationForm("no", firstN, lastN, emailF, phoneF, companyF, address1F, cityF, regionF, zipCodeF, countryF, loginNameF, password, confirmP)
                .selectCheckBox()
                .clickOnContinueButtonOnRegPage()
                .verifyTooltipMessage("City must be between 3 and 128 characters!");
    }
    @Test(dataProvider = "storeShortCityFieldCsv", dataProviderClass = DataProviders.class)
    public void shortCityField(String firstN, String lastN, String emailF, String phoneF, String companyF, String address1F, String cityF, String regionF, String zipCodeF, String countryF, String loginNameF, String password, String confirmP){
        new RegistrationPage(driver)
                .selectContinueRegistrationButton()
                .fillInRegistrationForm("no", firstN, lastN, emailF, phoneF, companyF, address1F, cityF, regionF, zipCodeF, countryF, loginNameF, password, confirmP)
                .selectCheckBox()
                .clickOnContinueButtonOnRegPage()
                .verifyTooltipMessage("City must be between 3 and 128 characters!");
    }
    @Test(dataProvider = "tooLongCityFieldCsv", dataProviderClass = DataProviders.class)
    public void tooLongCityField(String firstN, String lastN, String emailF, String phoneF, String companyF, String address1F, String cityF, String regionF, String zipCodeF, String countryF, String loginNameF, String password, String confirmP){
        new RegistrationPage(driver)
                .selectContinueRegistrationButton()
                .fillInRegistrationForm("no", firstN, lastN, emailF, phoneF, companyF, address1F, cityF, regionF, zipCodeF, countryF, loginNameF, password, confirmP)
                .selectCheckBox()
                .clickOnContinueButtonOnRegPage()
                .verifyTooltipMessage("City must be between 3 and 128 characters!");
    }
    @Test(dataProvider = "emptyRegionFieldCsv", dataProviderClass = DataProviders.class)
    public void emptyRegionField(String firstN, String lastN, String emailF, String phoneF, String companyF, String address1F, String cityF, String regionF, String zipCodeF, String countryF, String loginNameF, String password, String confirmP){
        new RegistrationPage(driver)
                .selectContinueRegistrationButton()
                .fillInRegistrationForm("no", firstN, lastN, emailF, phoneF, companyF, address1F, cityF, regionF, zipCodeF, countryF, loginNameF, password, confirmP)
                .selectCheckBox()
                .clickOnContinueButtonOnRegPage()
                .verifyTooltipMessage("Please select a region / state!");
    }
    @Test(dataProvider = "shortZipCodeFieldCsv", dataProviderClass = DataProviders.class)
    public void shortZipCodeField(String firstN, String lastN, String emailF, String phoneF, String companyF, String address1F, String cityF, String regionF, String zipCodeF, String countryF, String loginNameF, String password, String confirmP){
        new RegistrationPage(driver)
                .selectContinueRegistrationButton()
                .fillInRegistrationForm("yes", firstN, lastN, emailF, phoneF, companyF, address1F, cityF, regionF, zipCodeF, countryF, loginNameF, password, confirmP)
                .selectCheckBox()
                .clickOnContinueButtonOnRegPage()
                .verifyTooltipMessage("Zip/postal code must be between 3 and 10 characters!");
    }
    @Test(dataProvider = "emptyZipCodeFieldCsv", dataProviderClass = DataProviders.class)
    public void emtyZipCodeField(String firstN, String lastN, String emailF, String phoneF, String companyF, String address1F, String cityF, String regionF, String zipCodeF, String countryF, String loginNameF, String password, String confirmP){
        new RegistrationPage(driver)
                .selectContinueRegistrationButton()
                .fillInRegistrationForm("yes", firstN, lastN, emailF, phoneF, companyF, address1F, cityF, regionF, zipCodeF, countryF, loginNameF, password, confirmP)
                .selectCheckBox()
                .clickOnContinueButtonOnRegPage()
                .verifyTooltipMessage("Zip/postal code must be between 3 and 10 characters!");
    }
    @Test(dataProvider = "emptyCountryFieldCsv", dataProviderClass = DataProviders.class)
    public void emptyCountryField(String firstN, String lastN, String emailF, String phoneF, String companyF, String address1F, String cityF, String regionF, String zipCodeF, String countryF, String loginNameF, String password, String confirmP){
        new RegistrationPage(driver)
                .selectContinueRegistrationButton()
                .fillInRegistrationForm("yes", firstN, lastN, emailF, phoneF, companyF, address1F, cityF, regionF, zipCodeF, countryF, loginNameF, password, confirmP)
                .selectCheckBox()
                .clickOnContinueButtonOnRegPage()
                .verifyTooltipMessage("Zip/postal code must be between 3 and 10 characters!");
    }
    @Test(dataProvider = "emptyLoginNameFieldCsv", dataProviderClass = DataProviders.class)
    public void emptyLoginNameField(String firstN, String lastN, String emailF, String phoneF, String companyF, String address1F, String cityF, String regionF, String zipCodeF, String countryF, String loginNameF, String password, String confirmP){
        new RegistrationPage(driver)
                .selectContinueRegistrationButton()
                .fillInRegistrationForm("yes", firstN, lastN, emailF, phoneF, companyF, address1F, cityF, regionF, zipCodeF, countryF, loginNameF, password, confirmP)
                .selectCheckBox()
                .clickOnContinueButtonOnRegPage()
                .verifyTooltipMessage("Login name must be alphanumeric only and between 5 and 64 characters!");
    }
    @Test(dataProvider = "invalidLoginNameFieldCsv", dataProviderClass = DataProviders.class)
    public void invalidLoginNameField(String firstN, String lastN, String emailF, String phoneF, String companyF, String address1F, String cityF, String regionF, String zipCodeF, String countryF, String loginNameF, String password, String confirmP){
        new RegistrationPage(driver)
                .selectContinueRegistrationButton()
                .fillInRegistrationForm("yes", firstN, lastN, emailF, phoneF, companyF, address1F, cityF, regionF, zipCodeF, countryF, loginNameF, password, confirmP)
                .selectCheckBox()
                .clickOnContinueButtonOnRegPage()
                .verifyTooltipMessage("Login name must be alphanumeric only and between 5 and 64 characters!");
    }


    @Test(dataProvider = "pocoEmptyPasswordFieldCsv", dataProviderClass = DataProviders.class)
    public void emptyPasswordFieldRegistrationTest(String firstN, String lastN, String emailF, String phoneF, String companyF, String address1F,String cityF,String regionF, String zipCodeF, String countryF, String loginNameF, String password, String confirmP) {
        new RegistrationPage(driver)
                .selectContinueRegistrationButton()
                .fillInRegistrationForm("no", firstN, lastN, emailF, phoneF, companyF, address1F, cityF, regionF, zipCodeF, countryF, loginNameF, password, confirmP)
                .selectCheckBox()
                .clickOnContinueButtonOnRegPage()
                .verifyTooltipMessage("Password must be between 4 and 20 characters!");
    }
    @Test(dataProvider = "pocoShortPasswordFieldCsv", dataProviderClass = DataProviders.class)
    public void shortPasswordFieldRegistrationTest(String firstN, String lastN, String emailF, String phoneF, String companyF, String address1F,String cityF,String regionF, String zipCodeF, String countryF, String loginNameF, String password, String confirmP) {
        new RegistrationPage(driver)
                .selectContinueRegistrationButton()
                .fillInRegistrationForm("no", firstN, lastN, emailF, phoneF, companyF, address1F, cityF, regionF, zipCodeF, countryF, loginNameF, password, confirmP)
                .selectCheckBox()
                .clickOnContinueButtonOnRegPage()
                .verifyTooltipMessage("Password must be between 4 and 20 characters!");
    }
    @Test(dataProvider = "pocoMisMatchEmptyConfirmPasswordFieldCsv", dataProviderClass = DataProviders.class)
    public void misMatchEmptyConfirmFieldRegistrationTest(String firstN, String lastN, String emailF, String phoneF, String companyF, String address1F,String cityF,String regionF, String zipCodeF, String countryF, String loginNameF, String password, String confirmP) {
        new RegistrationPage(driver)
                .selectContinueRegistrationButton()
                .fillInRegistrationForm("no", firstN, lastN, emailF, phoneF, companyF, address1F, cityF, regionF, zipCodeF, countryF, loginNameF, password, confirmP)
                .selectCheckBox()
                .clickOnContinueButtonOnRegPage()
                .verifyTooltipMessage("Password confirmation does not match password!");
    }
    @Test(dataProvider = "pocoMisMatchInvalidConfirmPasswordFieldCsv", dataProviderClass = DataProviders.class)
    public void misMatchInvalidConfirmFieldRegistrationTest(String firstN, String lastN, String emailF, String phoneF, String companyF, String address1F,String cityF,String regionF, String zipCodeF, String countryF, String loginNameF, String password, String confirmP) {
        new RegistrationPage(driver)
                .selectContinueRegistrationButton()
                .fillInRegistrationForm("no", firstN, lastN, emailF, phoneF, companyF, address1F, cityF, regionF, zipCodeF, countryF, loginNameF, password, confirmP)
                .selectCheckBox()
                .clickOnContinueButtonOnRegPage()
                .verifyTooltipMessage("Password confirmation does not match password!");
    }
    @Test(dataProvider = "pocoSuccessReg", dataProviderClass = DataProviders.class)
    public void unselectedTermsAndConditionsCheckBox(String firstN, String lastN, String emailF, String phoneF, String companyF, String address1F,String cityF,String regionF, String zipCodeF, String countryF, String loginNameF, String password, String confirmP) {
        new RegistrationPage(driver)
                .selectContinueRegistrationButton()
                .fillInRegistrationForm("yes", firstN, lastN, emailF, phoneF, companyF, address1F, cityF, regionF, zipCodeF, countryF, loginNameF, password, confirmP)
                .clickOnContinueButton();
                new RegistrationPage(driver)
                .verifyCheckBoxErrorMessage(" Warning: You must agree to the Privacy Policy!");
    }




}
