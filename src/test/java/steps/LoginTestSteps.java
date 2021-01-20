package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.HomePage;
import pages.LoginAndRegistrationPage;

public class LoginTestSteps {
    HomePage homePage = new HomePage();
    LoginAndRegistrationPage loginAndRegistrationPage = new LoginAndRegistrationPage();
    BasePage basePage = new BasePage();

    @Given("User go to main page")
    public void iGoToMainPage() {
        homePage.openURL();
    }

    @When("User click button Login or Registration")
    public void iClickButton() {
        homePage.clickButtonLoginOrRegistration();
    }

    @And("User input correct {string} and {string}")
    public void userInputCorrectAnd(String email, String password) {
        loginAndRegistrationPage.fieldLogin(email);
        loginAndRegistrationPage.fieldPassword(password);
    }

    @And("User click submit")
    public void userClickSubmit() {
        loginAndRegistrationPage.submitLoginButton();
    }

    @Then("User logged in")
    public void userLoggedIn() {
        homePage.checkLoggedInUser();
    }

    @And("User input saved  {string} and field {string} remains empty")
    public void iInputSavedWith(String email, String password) {
        loginAndRegistrationPage.fieldLogin(email);
        loginAndRegistrationPage.fieldPassword(password);
        loginAndRegistrationPage.submitLoginButton();

    }

    @And("User remains empty {string} and input saved {string}")
    public void userInputSavedAndFieldRemainsEmpty(String email, String password) {
        loginAndRegistrationPage.fieldLogin(email);
        loginAndRegistrationPage.fieldPassword(password);
        loginAndRegistrationPage.submitLoginButton();
    }

    @And("User input wrong {string} and {string}")
    public void userInputWrongAnd(String email, String password) {
        loginAndRegistrationPage.fieldLogin(email);
        loginAndRegistrationPage.fieldPassword(password);
        loginAndRegistrationPage.submitLoginButton();
    }


    @Then("User see  error text {string}")
    public void userSeeErrorText(String text) {
        basePage.errorMessage(text);
    }
}
