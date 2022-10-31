package components.thirdTask;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckStatusEvent extends MainMenuCalendar {
    public CheckStatusEvent(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "div.dod_new-type__text")
    private List<WebElement> statusofEvents;


    public void checkStatusEvents() {
        for (WebElement events : statusofEvents) {
            Assertions.assertEquals("Открытый вебинар", events.getText());
        }


    }


}
