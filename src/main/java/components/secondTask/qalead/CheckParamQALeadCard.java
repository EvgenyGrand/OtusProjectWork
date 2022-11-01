package components.secondTask.qalead;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbsBasePages;


public class CheckParamQALeadCard extends AbsBasePages {
    public CheckParamQALeadCard(WebDriver driver) {
        super(driver);
    }

    @FindBy(css ="h1[class='sc-182qdc9-1 gjnars']")
    private WebElement title;

    @FindBy(css = "div.sc-182qdc9-3.hJucqK")
    private WebElement discription;

    @FindBy(xpath= "//*[contains(text(), '6 месяцев')]")
    private WebElement timeofCourse;


    public void CheckCardQaLead(){
        Assertions.assertEquals("QA Lead",title.getText());
        Assertions.assertEquals("Best Practice по Soft и Hard Skills для эффективного управления командами тестирования", discription.getText());
        Assertions.assertEquals("6 месяцев",timeofCourse.getText() );
    }


}
