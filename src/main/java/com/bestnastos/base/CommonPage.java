package com.bestnastos.base;

import com.bestnastos.pageobjects.TopMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CommonPage extends BaseClass {

    protected TopMenu topMenu;

    public CommonPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        topMenu = new TopMenu(driver);
    }
}
