package com.bestnastos.base;

import org.openqa.selenium.WebDriver;

public class BaseClass {

    protected WebDriver driver;

    public BaseClass(WebDriver driver) {
        this.driver = driver;
    }

}
