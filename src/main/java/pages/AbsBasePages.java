package pages;


import net.bytebuddy.asm.Advice;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Locale;
import java.util.logging.LogManager;

public abstract class AbsBasePages {


    private String hostname = System.getProperty("base.url").toLowerCase(Locale.ROOT);
    private String login = System.getProperty("login").toLowerCase(Locale.ROOT);
    private String password = System.getProperty("password").toLowerCase(Locale.ROOT);
    private String explisityWait = System.getProperty("explisityWait").toLowerCase(Locale.ROOT);


    protected WebDriver driver;
    protected Actions action;


    public AbsBasePages(WebDriver driver) {
        this.driver = driver;
        this.action = new Actions(driver);


        PageFactory.initElements(driver, this);

    }

    public void open() {
        driver.get(hostname);
    }


    public String inputLogin() {
        System.getProperty(login);
        return login;
    }

    public String inputPassword() {
        System.getProperty(password);
        return password;
    }

    public void explicitWait(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(explisityWait));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void moveToElement(WebElement elementFirst, WebElement elementSecond) {
        action.moveToElement(elementFirst).moveToElement(elementSecond).click().perform();
    }

    public void clickToElement(WebElement element) {
        element.click();
    }

    public void scrolltoElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void sendDropDownMenu(WebElement elementFirst, WebElement elementSecond) {
        scrolltoElement(elementFirst);
        explicitWait(elementFirst);
        elementFirst.click();
        explicitWait(elementSecond);
        elementSecond.click();

    }
}



