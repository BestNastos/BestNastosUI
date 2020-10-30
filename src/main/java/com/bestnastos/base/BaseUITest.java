package com.bestnastos.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseUITest {

    public WebDriver driver;

    @Parameters("url")
    @BeforeSuite(alwaysRun = true)
    public void beforeSuite(String url){
        //todo reporter
        System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\driver86\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite(){
        driver.quit();
    }
}
