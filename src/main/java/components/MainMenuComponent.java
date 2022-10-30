package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbsBasePages;

public class MainMenuComponent extends AbsBasePages {

    public MainMenuComponent(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[contains(@class, 'header2-menu_main')]/*[contains(@class, 'header2-menu__item')][.//*[text()='Курсы']]")
    private WebElement mainMenu;

    @FindBy(xpath = "//*[contains(@class, 'header2-menu_main')]/*[contains(@class, 'header2-menu__item')][.//*[text()='Курсы']]//a[@title='Тестирование']")
    private WebElement subMenu;


    public void clickCourseTesting(){
        explicitWait(mainMenu);
        moveToElement(mainMenu,subMenu);
    }




}
