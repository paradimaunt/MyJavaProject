package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class FavoritesPage {
    List<SelenideElement> elementsInFavorite = $$(By.xpath("//div[@class='item sales-list-item with-widget-price-extension with-widget-photo-widget with-widget-in-favourites-extension with-widget-checkbox full-width item-active ecommerce-item']"));
    SelenideElement deleteFromFavorites = $(By.xpath("//a[@title='Удалить из избранного']"));
    SelenideElement checkDeleteFromFavorites = $(By.xpath("//div[@class='box']"));

    public void checkInFavoritesOfTheAddedProduct() {
        List<SelenideElement> elementsInSearch = $$(By.xpath("//div[@data-brand='RENAULT']"));
        Assert.assertTrue(elementsInFavorite.contains(elementsInSearch.get(0)));
    }

    public void clickDeleteFromFavorites() {
        deleteFromFavorites.click();
    }

    public void checkTextAfterDeleteFromFavorites() {
        checkDeleteFromFavorites.shouldHave(text("По данному запросу ничего не найдено"));
    }

}
