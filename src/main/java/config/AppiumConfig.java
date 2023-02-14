package config;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;

//{
//        "platformName": "Android",
//        "deviceName": "Nex",
//        "platformVersion": "8.0",
//        "appPackage": "com.sheygam.contactapp",
//        "appActivity": ".SplashActivity"
//        }
public class AppiumConfig {

    protected static AppiumDriver<MobileElement> driver;

    @BeforeSuite
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Nex");
        capabilities.setCapability("platformVersion", "8.0");
        capabilities.setCapability("appPackage", "com.sheygam.contactapp");
        capabilities.setCapability("appActivity", ".SplashActivity");
        capabilities.setCapability("automationName", "Appium");

        driver=new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
