package components;

import data.CourcesData;
import data.MainMenuItemsData;
import data.QACourceData;
import org.openqa.selenium.By;
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

    @FindBy(xpath = "//*[contains(@class, 'header2-menu_main')]/*[contains(@class, 'header2-menu__item')][.//*[text()='Курсы']]//a[@title='Тестирование'")
    private WebElement subMenu;


    public void clickCourseTesting(){
        explicitWait(mainMenu);
        moveToElement(mainMenu,subMenu);
    }

//    private String mainMenuLocator = "//*[contains(@class, 'header2-menu_main')]/*[contains(@class, 'header2-menu__item')][.//*[text()='%s']]";
//    private String subMenuLocator = mainMenuLocator + "//a[@title='%s']";
//
//
//    public MainMenuComponent moveCursorToItem(MainMenuItemsData mainMenuItemsData) {
//        String locator = String.format(mainMenuLocator, mainMenuItemsData.getName());
//
//        WebElement mainMenu = driver.findElement(By.xpath(locator));
//        action.moveToElement(mainMenu).build().perform();
//        return this;
//    }
//    public void clickCourseTesting(CourcesData qaCourceData){
//       String locator = String.format(subMenuLocator,MainMenuItemsData.Cources.getName(),CourcesData.Testing.getName());
//       WebElement subMenu = driver.findElement(By.xpath(locator));
//       action.moveToElement(subMenu).click();
//
//    }


}
