package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FavoritesPage;
import pages.HomePage;
import pages.SearchPage;

public class AddCardToFavoritesSteps {

    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();
    FavoritesPage favoritesPage = new FavoritesPage();

    @When("User input in search {string}")
    public void userInputInSearch(String text) {
        homePage.inputInSearchField(text);
    }

    @And("User selects the first element in the list and adds it to the favorites")
    public void userSelectsTheFirstElementInTheListAndAddsItToTheFavorites() {
        searchPage.clickFirstElementInListOnSearchPage();
        searchPage.clickAddToFavoritesCard();
    }

    @And("User goes to the favorites and checks the availability of the goods")
    public void userGoesToTheFavoritesAndChecksTheAvailabilityOfTheGoods() {
        searchPage.clickGoToFavoritesPageButton();
        favoritesPage.checkInFavoritesOfTheAddedProduct();
    }

    @And("User delete goods and see text по даному запросу ничего не найдено")
    public void userDeleteGoodsAndSeeTextПоДаномуЗапросуНичегоНеНайдено() {
        favoritesPage.clickDeleteFromFavorites();
        favoritesPage.checkTextAfterDeleteFromFavorites();
    }

    @Then("User Login out")
    public void userLoginOut() {
        homePage.pointToProfileField();
    }
}


