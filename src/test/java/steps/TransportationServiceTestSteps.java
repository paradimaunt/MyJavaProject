package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.HomePage;
import pages.ServicePage;

public class TransportationServiceTestSteps {
    HomePage homePage = new HomePage();
    ServicePage servicePage = new ServicePage();
    BasePage basePage = new BasePage();

    @When("User click services button")
    public void userClickServicesButton() {
        homePage.clickServiceButton();
    }

    @Then("User click transportation button")
    public void userClickTransportationButton() {
        basePage.clickButton("Перевозки");
    }

    @Then("User check numbers phone transportation")
    public void userCheckNumbersPhoneTransportation() {
        servicePage.checkDisplayedNumbersPhone();
    }
}
