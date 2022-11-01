package components.thirdTask;

import components.fouthTask.CheckStatusEvents;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckDateEvent extends CheckStatusEvents {

    public CheckDateEvent(WebDriver driver) {
        super(driver);
    }



    @FindBy(css = "span.dod_new-event__date-text")
    private List<WebElement> dateOfEvents;

    public void checkSDateEvents() {
        for (WebElement events : dateOfEvents) {
            Assertions.assertEquals("31 октября", events.getText());


        }
    }
}
