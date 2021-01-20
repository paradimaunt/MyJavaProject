package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.Random;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginAndRegistrationPage {
    SelenideElement fieldInputEmail = $(By.xpath("//input[@placeholder='Введите e-mail']"));
    SelenideElement createUserButton = $(By.xpath("//input[@value='Создать пользователя']"));
    SelenideElement checkCreateNewUser = $(By.xpath("//div[@class='modal-title small icon-left success']"));
    SelenideElement fieldLogin = $(By.xpath(" //input[@name='login']"));
    SelenideElement fieldPassword = $(By.xpath(" //input[@name='password']"));
    SelenideElement submitLoginButton = $(By.xpath("//input[@value='Вход']"));

    public void creatingAUserUsingRandomEmail() {
        Random random = new Random();
        int m = random.nextInt(100) + 1;
        String email = "paradimaund" + m + "@gmail.com";
        fieldInputEmail.sendKeys(email);
        createUserButton.click();
    }

    public void checkCreateNewUser() {
        checkCreateNewUser.shouldHave(text("Новая учетная запись создана"));
    }

    public void fieldLogin(String login) {
        fieldLogin.sendKeys(login);
    }

    public void fieldPassword(String password) {
        fieldPassword.sendKeys(password);
    }

    public void submitLoginButton() {
        submitLoginButton.click();
    }

}
