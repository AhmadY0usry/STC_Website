package Test_In_English;
import Pages.Kuwait_Page;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestKuwaitPage extends Test_Base {
    Kuwait_Page kuwaitPage;
    {softAssert =new SoftAssert();}
    @Test
    public void TestKuwaitPageEnglish()
    {
        kuwaitPage=new Kuwait_Page(pageBase.ClickOnSelectCountry());
        kuwaitPage.selectKuwaitAsCountry();
        kuwaitPage.clickOnTranslateBtn();
        //check the type of packages
        softAssert.assertTrue(kuwaitPage.getPlanTitleForLite().contains("LITE"),"Lite package Not found");
        softAssert.assertTrue(kuwaitPage.getPlanTitleForBasic().contains("CLASSIC"),"Basic package Not found");
        softAssert.assertTrue(kuwaitPage.getPlanTitleForPremium().contains("PREMIUM"),"Premium package Not found");
        //check currency for all page
        System.out.println(kuwaitPage.getCurrencyForPage());
        softAssert.assertTrue(kuwaitPage.getCurrencyForPage().contains("KWD"),"The currency is not in KWD");
        //Check Price for packages
        softAssert.assertTrue(kuwaitPage.getPriceForLite().contains("1.2"),"The price is not 1.2 for lite");
        softAssert.assertTrue(kuwaitPage.getPriceForBasic().contains("2.5"),"The price is not 2.5 for basic");
        softAssert.assertTrue(kuwaitPage.getPriceForPremium().contains("4.8"),"The price is not 4.8 for premium");
        softAssert.assertAll();

    }
}
