package components.firstTask;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CountCurse extends MainMenuComponent {

    public CountCurse(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "div.lessons__new-item-bg")
    private List<WebElement> countCourses;

    public void getCountCurseofTesting() {
        Assertions.assertEquals(14, countCourses.size());

    }
}
