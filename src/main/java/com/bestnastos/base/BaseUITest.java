package com.bestnastos.base;

import org.testng.annotations.BeforeSuite;

public class BaseUITest {

    @BeforeSuite
    public void beforeSuite(){
        System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\driver86\\chromedriver.exe");
        //todo reporter: extent report / allure
    }
}
