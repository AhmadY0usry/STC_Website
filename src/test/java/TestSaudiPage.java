import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSaudiPage extends Test_Base {
    {softAssert=new SoftAssert();}
    @Test
    public void TestCurrencyInSaudiPage()
    {
        saudiPage.ClickOnChkCountry();
        saudiPage.selectSaudiAsCountry();
        softAssert.assertTrue(saudiPage.getSaudiCurrencyLite().contains("ريال سعودي"),"The Currency is not ريال سعودي ");
        softAssert.assertTrue(saudiPage.getSaudiCurrencyBasic().contains("ريال سعودي"),"The Currency is not ريال سعودي ");
        softAssert.assertTrue(saudiPage.getSaudiCurrencyPremium().contains("ريال سعودي"),"The Currency is not ريال سعودي ");
        softAssert.assertAll();
    }
    @Test
    public void TestLiteSaudiPage()
    {
        saudiPage.ClickOnChkCountry();
        saudiPage.selectSaudiAsCountry();
        softAssert.assertTrue(saudiPage.getLitePackPrice().contains("15"),"The price is not 15");
        softAssert.assertTrue(saudiPage.getDiscoveryForLite().contains("شامل"),"ليست شاملة");
        softAssert.assertTrue(saudiPage.getFreeTrailPeriod().contains("لـ 90 يوما"),"Not contain لـ 90 يوما");
        softAssert.assertTrue(saudiPage.getQualityPixel().contains("HD"),"Not HD");
        softAssert.assertTrue(saudiPage.getDeviceNO().contains("4"),"Not Equal 4 ");
        softAssert.assertTrue(saudiPage.getRestoreViewing().contains("لـ 14 يوما"),"Not Equal 14 days");
        softAssert.assertTrue(saudiPage.getWatchWithOutInternet().contains("https://cdn-stg.jawwy.tv/28/New%20Design/jawwy_close.svg"),"The image is not True for watch with out internet ");
        softAssert.assertTrue(saudiPage.getWatchSync().contains("https://cdn-stg.jawwy.tv/28/New%20Design/jawwy_close.svg"),"The image is not True for watch sync ");
        softAssert.assertTrue(saudiPage.getCastingFeature().contains("https://cdn-stg.jawwy.tv/28/New%20Design/jawwy_close.svg"),"The image is not True for casting feature ");
        softAssert.assertAll();
    }

    @Test
    public void TestBasicSaudiPage()
    {
        saudiPage.ClickOnChkCountry();
        saudiPage.selectSaudiAsCountry();
        softAssert.assertTrue(saudiPage.getLitePackPrice().contains("15"),"The price is not 15");


    }

}
