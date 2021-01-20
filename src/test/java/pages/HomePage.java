package pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {
    SelenideElement LoginOrRegisterButton = $(By.xpath("//div[@class= 'menu-burger-toggle guest']/preceding-sibling::div[text()='Вход / Регистрация']"));
    SelenideElement fieldSearch = $(By.xpath("//input[@inputmode='search']"));
    SelenideElement loggedInUser = $(By.xpath("//div[@class='user-name']"));
    SelenideElement serviceButton = $(By.xpath("//a[@title='Услуги']"));
    SelenideElement profileField = $(By.xpath("//div[@class='menu-burger-toggle authorized']"));
    SelenideElement logOutButton = $(By.xpath("//a[@class='submenu-item submenu-item-logout']"));

    public void clickButtonLoginOrRegistration() {
        LoginOrRegisterButton.click();
    }

    public void openURL() {
        Configuration.startMaximized = true;
        open("https://autoline.com.ua/");

    }

    public void inputInSearchField(String text) {
        fieldSearch.setValue(text).pressEnter();
    }

    public void checkLoggedInUser() {
        loggedInUser.shouldHave(text("paradimaunt93@gmail.com"));
    }

    public void clickServiceButton() {
        serviceButton.click();
    }

    public void pointToProfileField() {
        profileField.hover();
        logOutButton.click();
    }
}
