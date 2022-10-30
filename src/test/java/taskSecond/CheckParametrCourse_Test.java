package taskSecond;

import components.MainPage;
import components.firstTask.CountCurse;
import components.firstTask.MainMenuComponent;
import components.secondTask.CheckParamQALeadCard;
import components.secondTask.ClickToCardCourse;
import data.DriverData;
import exception.BrowserNotSupportException;
import factory.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class CheckParametrCourse_Test {

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
    public void CheckParametrCard(){
        driver.manage().window().maximize();
        MainPage mainPage = new MainPage(driver);
        MainMenuComponent mainMenuComponent = new MainMenuComponent(driver);
        ClickToCardCourse clickToCardCourse = new ClickToCardCourse(driver);
        CheckParamQALeadCard checkParamQALeadCard = new CheckParamQALeadCard(driver);
        mainPage.open();
        mainMenuComponent.clickCourseTesting();
        clickToCardCourse.clickToCard();
        checkParamQALeadCard.CheckCardQaLead();

    }
}


