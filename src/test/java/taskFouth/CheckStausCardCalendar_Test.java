package taskFouth;

import components.MainPage;
import components.fouthTask.CheckStatusEvents;
import components.fouthTask.MainMenuCalendar;
import data.DriverData;
import exception.BrowserNotSupportException;
import factory.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import taskThree.CheckDateEvents_Test;

public class CheckStausCardCalendar_Test {

    private WebDriver driver;
    protected org.apache.logging.log4j.Logger logger = LogManager.getLogger(CheckStausCardCalendar_Test.class);

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
        CheckStatusEvents checkStatusEvent = new CheckStatusEvents(driver);
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
