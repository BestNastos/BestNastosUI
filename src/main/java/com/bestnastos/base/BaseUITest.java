package com.bestnastos.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseUITest {

//    public WebDriver driver;

//    @Parameters("url")
    @BeforeSuite(alwaysRun = true)
    public void beforeSuiteBaseUITest(){
        //todo reporter
        System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\driver86\\chromedriver.exe");
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodBaseUITest(){
        driver = new ChromeDriver();
        driver.get("https://epam.github.io/JDI/index.html");
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethodBaseUITest(){
        driver.close();
    }

//    @AfterSuite(alwaysRun = true)
//    public void afterSuiteBaseUITest(){
//        driver.close();
//    }
}
