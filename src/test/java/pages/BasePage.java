package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    public void clickButton(String text) {
        $(By.xpath("//*[text()='" + text + "']")).click();
    }

    public void errorMessage(String inputText) {
        $(By.xpath(" //div[@class='error']")).shouldHave(text(inputText));
    }
}
