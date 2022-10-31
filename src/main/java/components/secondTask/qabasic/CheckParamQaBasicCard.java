package components.secondTask.qabasic;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckParamQaBasicCard extends ClickToCardCourserQaBasic {
    public CheckParamQaBasicCard(WebDriver driver) {
        super(driver);
    }

    @FindBy(css ="h1.sc-182qdc9-1.gjnars")
    private WebElement title;

    @FindBy(css = "div.sc-182qdc9-3.hJucqK")
    private WebElement discription;

    @FindBy(css = "#__next > div.sc-1l5foaq-0.gCyyUk.sc-1gmm0i0-0.bHUXbO > div.sc-1l5foaq-1.knewyH > div > section > div.x072mc-0.sc-10wn8wt-1.fntjjk.iKpZHT > div > div:nth-child(3) > p")
    private WebElement timeofCourse;


    public void CheckCardQaBasic(){
        Assertions.assertEquals("QA Engineer. Basic",title.getText());
        Assertions.assertEquals("Получите навыки тестирования веб-приложений и представления обратной связи о качестве продукта", discription.getText());
        Assertions.assertEquals("4 месяца",timeofCourse.getText() );
    }

}
