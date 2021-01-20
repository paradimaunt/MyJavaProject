package pages;


import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

import static Enums.ContactNumbers.*;
import static com.codeborne.selenide.Selenide.$$;
public class ServicePage {

    List<SelenideElement> numbers = $$(By.xpath("//div[@class= 'phones']"));

    public void checkDisplayedNumbersPhone() {

        Assert.assertTrue(numbers.toString().contains(OVERSIZED_AND_HEAVY_CARGO.getNumber()));
        Assert.assertTrue(numbers.toString().contains(PASSENGER_AND_CARGO_TRANSPORTATION_UKRAINE_SPAIN.getNumber()));

    }
}
