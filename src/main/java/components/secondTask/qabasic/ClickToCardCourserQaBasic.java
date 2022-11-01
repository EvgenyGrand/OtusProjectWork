package components.secondTask.qabasic;

import components.firstTask.MainMenuComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbsBasePages;

public class ClickToCardCourserQaBasic extends AbsBasePages {
    public ClickToCardCourserQaBasic(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = " a[href='/lessons/qa-engineer/?int_source=courses_catalog&int_term=testing']")
    private WebElement cardOfQaBasic;

    public void clickToCard() {
        scrolltoElement(cardOfQaBasic);
        explicitWait(cardOfQaBasic);
        clickToElement(cardOfQaBasic);
    }
}
