package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Saudi_Page extends Page_Base {
    WebDriver driver;
    Page_Base pageBase;
    public Saudi_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.pageBase=new Page_Base(driver);
    }
    private By Saudi_Icon=By.id("sa");

    public void ClickOnChkCountry()
    {
        pageBase.Click(this.pageBase.countryBtn);
    }

    public void selectSaudiAsCountry()
    {
        pageBase.Click(this.Saudi_Icon);
    }

    public String getBasicPackPrice()
    {
        return pageBase.getText(pageBase.priceForBasic);
    }
    public String getPremiumPackPrice()
    {
        return pageBase.getText(pageBase.priceForPremium);
    }
    public String getDiscoveryForLite()
    {
        return pageBase.getWebElementsListByIndexFromDiscovery(0).getText();
    }
    public String getDiscoveryForBasic()
    {
        return pageBase.getWebElementsListByIndexFromDiscovery(1).getText();
    }
    public String getDiscoveryForPremium()
    {
        return pageBase.getWebElementsListByIndexFromDiscovery(2).getText();
    }

    public String getFreeTrailPeriodForLite()
    {
        return pageBase.getText(pageBase.freeTrail);
    }
    public String getFreeTrailPeriodForBasic()
    {
        return pageBase.getText(pageBase.freeTrail);
    }
    public String getFreeTrailPeriodForPremium()
    {
        return pageBase.getText(pageBase.freeTrail);
    }

    public String getQualityPixel()
    {
        return pageBase.getText(pageBase.qualityPixel);
    }
    public String getDeviceNO()
    {
        return pageBase.getText(pageBase.deviceNo);
    }
    public String getRestoreViewing()
    {
        return pageBase.getText(pageBase.restoreViewing);
    }
    public String getWatchWithOutInternet()
    {
        return pageBase.getAttribute(pageBase.watchWithInternet);
    }
    public String getWatchSync()
    {
        return pageBase.getAttribute(pageBase.watchSync);
    }
    public String getCastingFeature()
    {
        return pageBase.getAttribute(pageBase.castingFeature);
    }

}
