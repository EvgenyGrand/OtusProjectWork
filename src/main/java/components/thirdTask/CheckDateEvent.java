package components.thirdTask;

import org.junit.jupiter.api.Assertions;
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
            DateFormat format = new SimpleDateFormat("d,MMMM");
            Date date = dateOfElement(events.getText());
            checkCorrectDate(date,new Date());

        }
    }
    private Date dateOfElement(String date){
        int mounthNumber = 0;
       String[] arrDate= date.split(" ");
       switch (arrDate[1]){
           case "Января" :
               mounthNumber =1;
               break;
           case "Февраля" :
               mounthNumber =2;
               break;
           case "Марта" :
               mounthNumber =3;
               break;
           case "Апреля" :
               mounthNumber =4;
               break;
           case "Мая" :
               mounthNumber =5;
               break;
           case "Июня" :
               mounthNumber =6;
               break;
           case "Июля" :
               mounthNumber =7;
               break;
           case "Августа" :
               mounthNumber =8;
               break;
           case "Сентября" :
               mounthNumber =9;
               break;
           case "Октября" :
               mounthNumber =10;
               break;
           case "Ноября" :
               mounthNumber =11;
               break;
           case "Декабря" :
               mounthNumber =12;
               break;

       }
       return new Date(2022,mounthNumber, Integer.parseInt(arrDate[0]));
    }

    public void checkCorrectDate(Date expectedDate, Date actualDate ){
        Assertions.assertTrue(expectedDate.compareTo(actualDate) >=0);
    }
}











