package components.secondTask;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CheckParamQALeadCard extends ClickToCardCourse{
    public CheckParamQALeadCard(WebDriver driver) {
        super(driver);
    }

    @FindBy(css ="h1[class='sc-182qdc9-1 gjnars']")
    private WebElement title;

    @FindBy(css = "div.sc-182qdc9-3.hJucqK")
    private WebElement discription;

    @FindBy(css = "div.i28ik1-0.ftxXhv.sc-10wn8wt-5.cfoBaL")
    private WebElement timeofCourse;


    public void CheckCardQaLead(){
        Assertions.assertEquals("QA Lead",title.getText());
        Assertions.assertEquals("Best Practice по Soft и Hard Skills для эффективного управления командами тестирования", discription.getText());
        Assertions.assertEquals("6 месяцев",timeofCourse.getText() );
    }


}
