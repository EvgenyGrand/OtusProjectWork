package taskFirst;

import components.firstTask.CountCurse;
import components.firstTask.MainMenuComponent;
import components.MainPage;
import data.DriverData;
import exception.BrowserNotSupportException;
import factory.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class CheckCountCurse_Test {

    private WebDriver driver;
    protected org.apache.logging.log4j.Logger logger = LogManager.getLogger(CheckCountCurse_Test.class);

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
        CountCurse countCurse = new CountCurse(driver);
        MainMenuComponent mainMenuComponent = new MainMenuComponent(driver);
        mainPage.open();
        mainMenuComponent.clickCourseTesting();
        countCurse.getCountCurseofTesting();

    }

    @AfterEach
    public void close() {
        if (this.driver != null) {
            this.driver.close();
            this.driver.quit();
        }

    }

}

