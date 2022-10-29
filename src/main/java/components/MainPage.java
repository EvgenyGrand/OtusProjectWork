package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbsBasePages;

public class MainPage extends AbsBasePages {

    public MainPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(xpath = "//*[@class = 'header2__auth js-open-modal']")
    private WebElement registrationButton;


    public void clickRegistrationButton() throws InterruptedException {
        clickToElement(registrationButton);
    }
}