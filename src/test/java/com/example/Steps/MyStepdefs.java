package com.example.Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.LoginPage;

public class MyStepdefs {
    LoginPage loginPage = new LoginPage();


    @Given("User landing on login page")
    public void userLandingOnLoginPage() {
        loginPage.landingPage();
    }

    @When("User tap profil button")
    public void userTapProfilButton() {
        loginPage.tapProfilButton();
    }

    @And("User tap Sign up or Log in")
    public void userTapSignUpOrLogIn() {
        loginPage.tapSignUpOrLogInButton();
    }

    @And("User tap login")
    public void userTapLogin() {
        loginPage.tapLogInButton();
    }

    @When("User input email {string}")
    public void userInputEmail(String email) {
        loginPage.setEmail(email);
    }

    @And("User input password {string}")
    public void userInputPassword(String password) {
        loginPage.setPassword(password);
    }

    @When("User tap login button")
    public void userTapLoginButton() {
        loginPage.tapLogin();
    }
//=====================================================================================
    @Then("User verify failed login")
    public void userVerifyFailedLogin() {
        loginPage.failedVerifyPage();
    }
//=====================================================================================
    @Then("User cant tap login button are disable")
    public void userCantTapLoginButtonAreDisable() {
        loginPage.disableButton();
    }
}
