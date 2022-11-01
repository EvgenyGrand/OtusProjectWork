package factory;

import data.DriverData;
import exception.BrowserNotSupportException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebDriverFactory {



    public WebDriver getDriver(DriverData driverData, MutableCapabilities options) throws BrowserNotSupportException {

        switch (driverData) {
            case CHROME:
                ChromeOptions chromeOptions = new ChromeOptions();
                if (options!=null){
                    chromeOptions.merge(options);
                }
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case FIREFOX:
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                if (options!=null){
                    firefoxOptions.merge(options);
                }
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();


            default:
                throw new BrowserNotSupportException(driverData);
        }
    }
}
