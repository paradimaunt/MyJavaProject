package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchPage {
    SelenideElement addToFavoritesCard = $(By.xpath("//span[@class='actions-group internal']//span[text()='Добавить в избранное']"));
    SelenideElement goToFavoritesPageButton = $(By.xpath("//span[@class='item-icon item-icon-favourites']"));
    List<SelenideElement> listElementsInSearch = $$(By.xpath("//div[@data-brand='RENAULT']"));


    public void clickAddToFavoritesCard() {
        addToFavoritesCard.click();
    }

    public void clickFirstElementInListOnSearchPage() {
        listElementsInSearch.get(0).click();
    }

    public void clickGoToFavoritesPageButton() {
        List<SelenideElement> elementsInSearch = $$(By.xpath("//div[@data-brand='RENAULT']"));
        goToFavoritesPageButton.click();
    }
}
