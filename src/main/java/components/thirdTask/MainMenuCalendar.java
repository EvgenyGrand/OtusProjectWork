package components.thirdTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbsBasePages;

public class MainMenuCalendar extends AbsBasePages {

    public MainMenuCalendar(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[contains(@class, 'header2-menu_main')]/*[contains(@class, 'header2-menu__item')][.//*[text()='События']]")
    private WebElement mainMenu;

    @FindBy(xpath = "//*[contains(@class, 'header2-menu_main')]/*[contains(@class, 'header2-menu__item')][.//*[text()='События']]//a[@title='Календарь мероприятий']")
    private WebElement subMenu;



    public void clickCalendarEvents(){
        explicitWait(mainMenu);
        moveToElement(mainMenu,subMenu);
    }

}
