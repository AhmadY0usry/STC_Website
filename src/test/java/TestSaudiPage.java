import Pages.Saudi_Page;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSaudiPage extends Test_Base {
    {softAssert=new SoftAssert();}
    Saudi_Page saudiPage;
    @Test
    public void TestSaudiPage()
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

        softAssert.assertTrue(saudiPage.getDiscoveryForLite().contains("شامل"),"ليست شاملة");
        softAssert.assertTrue(saudiPage.getFreeTrailPeriodForLite().contains("لـ 90 يوما"),"Not contain لـ 90 يوما");
        softAssert.assertTrue(saudiPage.getQualityPixel().contains("HD"),"Not HD");
        softAssert.assertTrue(saudiPage.getDeviceNO().contains("4"),"Not Equal 4 ");
        softAssert.assertTrue(saudiPage.getRestoreViewing().contains("لـ 14 يوما"),"Not Equal 14 days");
        softAssert.assertTrue(saudiPage.getWatchWithOutInternet().contains("https://cdn-stg.jawwy.tv/28/New%20Design/jawwy_close.svg"),"The image is not True for watch with out internet ");
        softAssert.assertTrue(saudiPage.getWatchSync().contains("https://cdn-stg.jawwy.tv/28/New%20Design/jawwy_close.svg"),"The image is not True for watch sync ");
        softAssert.assertTrue(saudiPage.getCastingFeature().contains("https://cdn-stg.jawwy.tv/28/New%20Design/jawwy_close.svg"),"The image is not True for casting feature ");
        softAssert.assertAll();
    }



}
