package com.bestnastos.pageobjects;

import com.bestnastos.base.CommonPage;
import com.bestnastos.constants.Users;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonPage {

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("Log into home page: step annotation")
    public void login(Users user){
        topMenu.login(user);
//        return new HomePage(driver);
    }
}
