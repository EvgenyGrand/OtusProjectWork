package otusprojectwork;

import components.MainMenuComponent;
import components.MainPage;
import data.CourcesData;
import data.DriverData;
import data.MainMenuItemsData;
import exception.BrowserNotSupportException;
import factory.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class CheckOtusSite {

    private WebDriver driver;

    @BeforeAll
    public static void init() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();


    }

    @BeforeEach
    public void initDriver() throws BrowserNotSupportException {

        driver = new WebDriverFactory().getDriver(DriverData.CHROME, null);

    }

    @Test
   public void checkOtusCourses() throws InterruptedException {
        driver.manage().window().maximize();

        MainPage mainPage = new MainPage(driver);
        MainMenuComponent mainMenuComponent = new MainMenuComponent(driver);
        mainPage.open();
        mainMenuComponent.clickCourseTesting();

//        new MainMenuComponent(driver)
//                .moveCursorToItem(MainMenuItemsData.Cources)
//                .clickCourseTesting(CourcesData.Testing);
    }

}
