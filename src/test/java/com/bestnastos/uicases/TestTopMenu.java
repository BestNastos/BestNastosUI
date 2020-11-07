package com.bestnastos.uicases;

import com.bestnastos.base.BaseUITest;
import com.bestnastos.constants.Users;
import com.bestnastos.pageobjects.HomePage;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

@Feature("Smoke tests: feature annotation")
public class TestTopMenu extends BaseUITest {

    @Story("Home page: story annotation")
    @Test(alwaysRun = true)
    public void testTopMenu(){

        HomePage homePage = new HomePage(driver);
        homePage.login(Users.PITER_CHAILOVSKII);

    }
}
