package Test_In_Arabic;

import Pages.Bahrain_Page;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestBahrainPage extends Test_Base{
    Bahrain_Page bahrainPage;
    {softAssert =new SoftAssert();}
    @Test
    public void TestBahrainPageArabic()
    {
        bahrainPage=new Bahrain_Page(pageBase.ClickOnSelectCountry());
        bahrainPage.selectBahrainAsCountry();
        //check the type of packages
        softAssert.assertTrue(bahrainPage.getPlanTitleForLite().contains("لايت"),"Lite package Not found");
        softAssert.assertTrue(bahrainPage.getPlanTitleForBasic().contains("الأساسية"),"Basic package Not found");
        softAssert.assertTrue(bahrainPage.getPlanTitleForPremium().contains("بريميوم"),"Premium package Not found");
        //check currency for all page
        softAssert.assertTrue(bahrainPage.getCurrencyForPage().contains("دينار بحريني"),"The currency is not in Bahrain Dinar");
        //Check Price for packages
        softAssert.assertTrue(bahrainPage.getPriceForLite().contains("2"),"The price is not 1.2 for lite");
        softAssert.assertTrue(bahrainPage.getPriceForBasic().contains("3"),"The price is not 2.5 for basic");
        softAssert.assertTrue(bahrainPage.getPriceForPremium().contains("6"),"The price is not 4.8 for premium");
        softAssert.assertAll();

    }
}

