package com.bestnastos.uicases;

import com.bestnastos.base.BaseUITest;
import com.bestnastos.constants.Users;
import com.bestnastos.pageobjects.HomePage;
import org.testng.annotations.Test;

public class TestTopMenu extends BaseUITest {

    @Test(alwaysRun = true)
    public void testTopMenu(){
//test
        HomePage homePage = new HomePage(driver);
        homePage.login(Users.PITER_CHAILOVSKII);

    }
}
