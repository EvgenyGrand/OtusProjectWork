package taskSecond;

import components.MainPage;
import components.firstTask.MainMenuComponent;
import components.secondTask.qalead.CheckParamQALeadCard;
import components.secondTask.qalead.ClickToCardCourseQaLead;
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

public class CheckParametrCourseQaLead_Test {

    private WebDriver driver;
    protected org.apache.logging.log4j.Logger logger = LogManager.getLogger(CheckParametrCourseQaLead_Test.class);

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
        ClickToCardCourseQaLead clickToCardCourse = new ClickToCardCourseQaLead(driver);
        CheckParamQALeadCard checkParamQALeadCard = new CheckParamQALeadCard(driver);
        mainPage.open();
        mainMenuComponent.clickCourseTesting();
        clickToCardCourse.clickToCard();
        checkParamQALeadCard.CheckCardQaLead();

    }

    @AfterEach
    public void close() {
        if (this.driver != null) {
            this.driver.close();
            this.driver.quit();
        }
    }
}


