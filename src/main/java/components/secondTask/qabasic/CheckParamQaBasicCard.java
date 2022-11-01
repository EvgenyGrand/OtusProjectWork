package components.secondTask.qabasic;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbsBasePages;

public class CheckParamQaBasicCard extends AbsBasePages {
    public CheckParamQaBasicCard(WebDriver driver) {
        super(driver);
    }

    @FindBy(css ="h1.sc-182qdc9-1.gjnars")
    private WebElement title;

    @FindBy(css = "div.sc-182qdc9-3.hJucqK")
    private WebElement discription;

    @FindBy(xpath = "//*[contains(text(), '4 месяца')]")
    private WebElement timeofCourse;


    public void CheckCardQaBasic(){
        Assertions.assertEquals("QA Engineer. Basic",title.getText());
        Assertions.assertEquals("Получите навыки тестирования веб-приложений и представления обратной связи о качестве продукта", discription.getText());
        Assertions.assertEquals("4 месяца",timeofCourse.getText() );
    }

}
