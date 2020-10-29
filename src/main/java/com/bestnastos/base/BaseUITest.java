package com.bestnastos.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseUITest {

    @Parameters("url")
    @BeforeSuite(alwaysRun = true)
    public void beforeSuite(String url){
        System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\driver86\\chromedriver.exe");
        //todo reporter: extent report / allure
        driver = new ChromeDriver();
        open(url);
    }

    public WebDriver driver;

    public void open(String url) {
        driver.get(url);
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite(){
        driver.close();
    }
}
