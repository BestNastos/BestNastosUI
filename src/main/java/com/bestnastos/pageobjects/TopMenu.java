package com.bestnastos.pageobjects;

import com.bestnastos.base.BaseClass;
import com.bestnastos.constants.Users;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TopMenu extends BaseClass {

    @FindBy(css = "ul.uui-navigation.nav.navbar-nav.m-l8 > li")
    protected List<WebElement> topMenuItems;

    @FindBy(xpath = "//*[contains(text(),'Service')]//ancestor::li[contains(@class,'dropdown')]/ul//a")
    protected List<WebElement> serviceMenuItems;

    @FindBy(id = "user-icon")
    private WebElement profileButton;

    @FindBy(id = "name")
    private WebElement loginBox;

    @FindBy(id = "password")
    private WebElement passwordBox;

    @FindBy(id = "login-button")
    private WebElement submitButton;

    public TopMenu(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public TopMenu login(Users user) {
        profileButton.click();
        loginBox.sendKeys(user.getUsername());
        passwordBox.sendKeys(user.getPassword());
        submitButton.click();
        return new TopMenu(driver);
    }
}
