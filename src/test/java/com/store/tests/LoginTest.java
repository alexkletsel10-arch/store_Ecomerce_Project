package com.store.tests;

import com.store.pages.HomePage;
import com.store.pages.registrationAndLogin.LoginPage;
import com.store.pages.utility.DataProviders;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver)
                .clickOnMyAccountButton()
                .selectLoginButton();

    }
    @Test(dataProvider = "pocoSuccessLoginCsv", dataProviderClass = DataProviders.class)
    public void successfulLoginTest(String lEmail, String lPassword){
        new LoginPage(driver)
                .fillInLoginForm(lEmail, lPassword)
                .clickOnLoginButtonOnLoginForm()
                .verifyAccountPageTitle();

    }
    @Test(dataProvider = "pocoSuccessLoginCsv", dataProviderClass = DataProviders.class)
    public void invalidLoginTest(String lEmail, String lPassword){
        new LoginPage(driver)
                .fillInLoginForm(lEmail, lPassword)
                .clickOnLoginButtonOnLoginForm()
                .verifyAccountPageTitle();

    }

}
