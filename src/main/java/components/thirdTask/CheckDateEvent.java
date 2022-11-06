package components.thirdTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbsBasePages;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CheckDateEvent extends AbsBasePages {

    public CheckDateEvent(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//span[contains(text(), 'ноября')]")
    private List<WebElement> dateOfEvents;

    public void checkSDateEvents() throws ParseException {
        for (WebElement events : dateOfEvents) {
            System.out.println(events.getText());
//            DateFormat format = new SimpleDateFormat("dd,MMMM");
//            Date date = format.parse(String.valueOf(events));
//            System.out.println(date);

        }
    }
}











