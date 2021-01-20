package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BasePage;
import pages.LoginAndRegistrationPage;

public class RegistrationTestSteps {
    BasePage basePage = new BasePage();
    LoginAndRegistrationPage loginAndRegistrationPage = new LoginAndRegistrationPage();

    @And("User click new  button {string}")
    public void clickNewButton(String registrationButton) {
        basePage.clickButton(registrationButton);
    }

    @And("User click {string}")
    public void click(String registrationUseEmail) {
        basePage.clickButton(registrationUseEmail);
    }

    @And("Create new user with random email")
    public void creationUserRandomEmail() {
        loginAndRegistrationPage.creatingAUserUsingRandomEmail();

    }

    @Then("User should see title New account created")
    public void shouldSeeTitleNewAccountCreated() {
        loginAndRegistrationPage.checkCreateNewUser();
    }
}
