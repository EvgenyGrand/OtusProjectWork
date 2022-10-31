package components.fouthTask;

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

    @FindBy(css = "body > div.body-wrapper > div > div.js-dod-new-events-root > div > section > header > div.dod_new-events__header-left > div > div.dod_new-events-dropdown__input > span")
    private WebElement openDropdownMenu;

    @FindBy(css = "body > div.body-wrapper > div > div.js-dod-new-events-root > div > section > header > div.dod_new-events__header-left > div > div.dod_new-events-dropdown__list.js-dod_new_events-dropdown > a:nth-child(4)")
    private WebElement changeTypeDropdownMenu;



    public void clickCalendarEvents(){
        explicitWait(mainMenu);
        moveToElement(mainMenu,subMenu);
    }

    public void changeTypeEvents(){
        sendDropDownMenu(openDropdownMenu,changeTypeDropdownMenu);

    }



}
