package com.bestnastos.pageobjects;

import com.bestnastos.base.CommonPage;
import com.bestnastos.constants.Users;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonPage {

    public HomePage(WebDriver driver) {
//        super(driver);
        PageFactory.initElements(driver, this);
    }

    public HomePage login(Users user){
        topMenu.login(user);
        return new HomePage(driver);
    }
}
