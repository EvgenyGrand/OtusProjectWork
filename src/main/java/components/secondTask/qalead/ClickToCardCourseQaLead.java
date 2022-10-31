package components.secondTask.qalead;

import components.firstTask.MainMenuComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickToCardCourseQaLead extends MainMenuComponent {

    public ClickToCardCourseQaLead(WebDriver driver) {
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
