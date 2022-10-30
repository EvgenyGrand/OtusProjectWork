package components.secondTask;

import components.MainPage;
import components.firstTask.CountCurse;
import components.firstTask.MainMenuComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbsBasePages;

public class ClickToCardCourse extends MainMenuComponent {

    public ClickToCardCourse(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//img[@alt='QA Lead foreground']")
    private WebElement cardOfQaLead;

    public void clickToCard() {
        scrolltoElement(cardOfQaLead);
        explicitWait(cardOfQaLead);
        clickToElement(cardOfQaLead);


    }

}
