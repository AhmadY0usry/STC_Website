import Pages.Kuwait_Page;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestKuwaitPage extends Test_Base{
    Kuwait_Page kuwaitPage;
    {softAssert =new SoftAssert();}
    @Test
    public void TestKuwaitPage ()
    {
        kuwaitPage=new Kuwait_Page(pageBase.ClickOnSelectCountry());
        kuwaitPage.selectKuwaitAsCountry();
        //check currency for all page
        System.out.println(kuwaitPage.getCurrencyForPage());
        softAssert.assertTrue(kuwaitPage.getCurrencyForPage().contains("دينار كويتي"),"The currency is not in Dinar");
        //Check Price for packages
        softAssert.assertTrue(kuwaitPage.getPriceForLite().contains("1.2"),"The price is not 1.2 for lite");
        softAssert.assertTrue(kuwaitPage.getPriceForBasic().contains("2.5"),"The price is not 2.5 for basic");
        softAssert.assertTrue(kuwaitPage.getPriceForPremium().contains("4.8"),"The price is not 4.8 for premium");
        softAssert.assertAll();

    }
}