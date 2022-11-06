package taskThree;

import components.MainPage;
import components.fouthTask.MainMenuCalendar;
import components.thirdTask.CheckDateEvent;
import data.DriverData;
import exception.BrowserNotSupportException;
import factory.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import taskFirst.CheckCountCurse_Test;

import java.text.ParseException;

public class CheckDateEvents_Test {

    private WebDriver driver;
    protected org.apache.logging.log4j.Logger logger = LogManager.getLogger(CheckDateEvents_Test.class);

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
    public void checkDateEvents() throws ParseException {
        driver.manage().window().maximize();

        MainPage mainPage = new MainPage(driver);
        MainMenuCalendar mainMenuCalendar = new MainMenuCalendar(driver);
        CheckDateEvent checkDateEvents = new CheckDateEvent(driver);
        mainPage.open();
        mainMenuCalendar.clickCalendarEvents();
        checkDateEvents.actualDate();
//        checkDateEvents.checkSDateEvents();
        





    }

//    @AfterEach
//    public void close() {
//        if (this.driver != null) {
//            this.driver.close();
//            this.driver.quit();
//        }
//
//    }
}

