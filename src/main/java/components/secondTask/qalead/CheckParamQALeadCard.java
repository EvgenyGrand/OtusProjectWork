package components.secondTask.qalead;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CheckParamQALeadCard extends ClickToCardCourseQaLead {
    public CheckParamQALeadCard(WebDriver driver) {
        super(driver);
    }

    @FindBy(css ="h1[class='sc-182qdc9-1 gjnars']")
    private WebElement title;

    @FindBy(css = "div.sc-182qdc9-3.hJucqK")
    private WebElement discription;

    @FindBy(css = "#__next > div.sc-1l5foaq-0.gCyyUk.sc-1gmm0i0-0.bHUXbO > div.sc-1l5foaq-1.knewyH > div > section > div.x072mc-0.sc-10wn8wt-1.fntjjk.iKpZHT > div > div:nth-child(2) > p")
    private WebElement timeofCourse;


    public void CheckCardQaLead(){
        Assertions.assertEquals("QA Lead",title.getText());
        Assertions.assertEquals("Best Practice по Soft и Hard Skills для эффективного управления командами тестирования", discription.getText());
        Assertions.assertEquals("6 месяцев",timeofCourse.getText() );
    }


}
