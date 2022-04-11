package com.bestnastos.base;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseUITest {

    public static WebDriver driver;
    DesiredCapabilities capabilities;

//    @Parameters("url")
    @BeforeSuite(alwaysRun = true)
    public void beforeSuiteBaseUITest() throws MalformedURLException {
        //todo reporter
        capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("100.0");
        capabilities.setPlatform(Platform.WIN10);
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        driver.get("https://epam.github.io/JDI/index.html");
        driver.manage().window().maximize();
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodBaseUITest() throws MalformedURLException {
//        capabilities = new DesiredCapabilities();
//        capabilities.setBrowserName("chrome");
//        capabilities.setVersion("100.0");
//        capabilities.setPlatform(Platform.WIN10);
//        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
//        driver.get("https://epam.github.io/JDI/index.html");
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethodBaseUITest(){
//        driver.close();
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuiteBaseUITest(){
        driver.close();
    }
}
