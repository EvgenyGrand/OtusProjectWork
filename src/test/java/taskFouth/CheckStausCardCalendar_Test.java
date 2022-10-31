package taskFouth;

import components.MainPage;
import components.fouthTask.CheckStatusEvent;
import components.fouthTask.MainMenuCalendar;
import data.DriverData;
import exception.BrowserNotSupportException;
import factory.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class CheckStausCardCalendar_Test {

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
    public void checkOtusCourses() {
        driver.manage().window().maximize();

        MainPage mainPage = new MainPage(driver);
        MainMenuCalendar mainMenuCalendar = new MainMenuCalendar(driver);
        CheckStatusEvent checkStatusEvent = new CheckStatusEvent(driver);
        mainPage.open();
        mainMenuCalendar.clickCalendarEvents();
        mainMenuCalendar.changeTypeEvents();
        checkStatusEvent.checkStatusEvents();


    }

    @AfterEach
    public void close() {
        if (this.driver != null) {
            this.driver.close();
            this.driver.quit();
        }

    }
}
