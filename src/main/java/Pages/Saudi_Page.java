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
    private By Kuwait_Icon=By.id("kw");
    private By Bahrain_Icon=By.id("bh");
    public void ClickOnChkCountry()
    {
        pageBase.Click(this.pageBase.countryBtn);
    }

    public void selectSaudiAsCountry()
    {
        pageBase.Click(this.Saudi_Icon);
    }
    public void selectKuwaitAsCountry()
    {
        pageBase.Click(this.Kuwait_Icon);
    }
    public void selectBahrainAsCountry()
    {
        pageBase.Click(this.Bahrain_Icon);
    }
    public String getSaudiCurrencyLite()
    {
            return pageBase.getText(pageBase.currencyForLite);
    }
    public String getSaudiCurrencyBasic()
    {
        return pageBase.getText(pageBase.currencyForBasic);
    }
    public String getSaudiCurrencyPremium()
    {
        return pageBase.getText(pageBase.currencyForPremium);
    }
    public String getLitePackPrice()
    {
        return pageBase.getText(pageBase.price);
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

    public String getFreeTrailPeriod()
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
