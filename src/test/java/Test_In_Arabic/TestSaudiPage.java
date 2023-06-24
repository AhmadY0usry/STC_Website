package Test_In_Arabic;

import Pages.Saudi_Page;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSaudiPage extends Test_Base {
    {softAssert=new SoftAssert();}
    Saudi_Page saudiPage;
    @Test
    public void TestSaudiPageArabic()
    {
        saudiPage=new Saudi_Page(pageBase.ClickOnSelectCountry());
        saudiPage.selectSaudiAsCountry();
        //check the type of packages
        softAssert.assertTrue(saudiPage.getPlanTitleForLite().contains("لايت"),"Lite package Not found");
        softAssert.assertTrue(saudiPage.getPlanTitleForBasic().contains("الأساسية"),"Basic package Not found");
        softAssert.assertTrue(saudiPage.getPlanTitleForPremium().contains("بريميوم"),"Premium package Not found");
        //check currency for all page
        softAssert.assertTrue(saudiPage.getCurrencyForPage().contains("ريال سعودي"),"The currency is not in Riyal");
        //Check Price for packages
        softAssert.assertTrue(saudiPage.getPriceForLite().contains("15"),"The price is not 15 for lite");
        softAssert.assertTrue(saudiPage.getPriceForBasic().contains("25"),"The price is not 25 for basic");
        softAssert.assertTrue(saudiPage.getPriceForPremium().contains("60"),"The price is not 60 for premium");
        softAssert.assertAll();
        take_screen_shoot("Saudi_Page_ScreenShoot");
    }



}
