package taskSecond;

import components.MainPage;
import components.firstTask.MainMenuComponent;
import components.secondTask.qabasic.CheckParamQaBasicCard;
import components.secondTask.qabasic.ClickToCardCourserQaBasic;
import data.DriverData;
import exception.BrowserNotSupportException;
import factory.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class CheckParametrCourseQaBasic_Test {

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
    public void CheckParametrCard() {
        driver.manage().window().maximize();
        MainPage mainPage = new MainPage(driver);
        MainMenuComponent mainMenuComponent = new MainMenuComponent(driver);
        ClickToCardCourserQaBasic clickToCardCourserQaBasic = new ClickToCardCourserQaBasic(driver);
        CheckParamQaBasicCard checkParamQaBasicCard = new CheckParamQaBasicCard(driver);
        mainPage.open();
        mainMenuComponent.clickCourseTesting();
        clickToCardCourserQaBasic.clickToCard();
        checkParamQaBasicCard.CheckCardQaBasic();

    }

    @AfterEach
    public void close() {
        if (this.driver != null) {
            this.driver.close();
            this.driver.quit();
        }
    }
}
