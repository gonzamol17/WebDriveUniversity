package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import PageObject.BasePage;
import PageObject.ContactUs_Page;
import PageObject.Products_Page;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;
    public static BasePage basePage;
    public static ContactUs_Page contactUs_Page;
    public static Products_Page products_Page;


    public WebDriver getDriver(){

    try{
       Properties p = new Properties();
        FileInputStream fi= new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\properties\\config.properties");
        p.load(fi);
        String browserName = p.getProperty("browser");
        switch (browserName) {
            case "firefox":
                if (null == driver) {
                    System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
                    DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                    capabilities.setCapability("marionette", true);
                    driver = new FirefoxDriver();

                }
                break;

            case "chrome":
                if (null == driver) {
                    System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();

                }
                break;

            case "ie":
                if (null == driver) {
                    DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
                    System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER_DIRECTORY);
                    capabilities.setCapability("IgnoreZoomSetting", true);
                    driver = new InternetExplorerDriver(capabilities);
                    driver.manage().window().maximize();
                }

                break;
        }
    }catch (Exception e){
        System.out.println("Enable to load browser"+e.getMessage());

    }finally{
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        contactUs_Page = PageFactory.initElements(driver,ContactUs_Page.class);
        products_Page = PageFactory.initElements(driver,Products_Page.class);
        basePage = PageFactory.initElements(driver,BasePage.class);
    }
    return driver;
}
}
