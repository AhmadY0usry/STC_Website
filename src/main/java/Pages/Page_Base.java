package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Page_Base {

    WebDriver driver;
    protected By planTitle=By.className("plan-title");
    protected By countryBtn=By.id("country-btn");
    protected By currencyForPage=By.cssSelector(".price > i");
    protected By priceForLite =By.cssSelector(".price > b");
    protected By priceForBasic =By.cssSelector(".price > b");
    protected By priceForPremium =By.cssSelector(".price > b");
    protected By discovery =By.cssSelector("div:nth-child(4) div.plan-names > div");
    protected By freeTrail =By.cssSelector("div:nth-child(5) > div.plan-names > div:nth-child(1)");
    protected By qualityPixel =By.cssSelector("div:nth-child(6) > div.plan-names > div:nth-child(1)");
    protected By deviceNo =By.cssSelector("div:nth-child(7) > div.plan-names > div:nth-child(1)");
    protected By restoreViewing =By.cssSelector("div:nth-child(8) > div.plan-names > div:nth-child(1)");
    protected By watchWithInternet =By.cssSelector("div:nth-child(9) > div.plan-names > div:nth-child(1) >img");
    protected By watchSync =By.cssSelector("div:nth-child(10) > div.plan-names > div:nth-child(1) >img");
    protected By castingFeature =By.cssSelector("div:nth-child(10) > div.plan-names > div:nth-child(1) >img");
    protected List <WebElement> list;

    public Page_Base(WebDriver driver) {
        this.driver = driver;
    }
    public void Click(By by)
    {
        driver.findElement(by).click();
    }
    public String getText(By by)
    {
        return driver.findElement(by).getText();
    }
    public String getAttribute(By by)
    {
        return driver.findElement(by).getAttribute("src");
    }

    public WebElement getWebElementsListByIndexFromDiscovery(int Index)
    {
       list= new ArrayList();
       list=driver.findElements(this.discovery);
       return list.get(Index);
    }


    public String getPlanTitleForLite()
    {
        list=new ArrayList();
        list=driver.findElements(this.planTitle);
        return list.get(0).getText();
    }
    public String getPlanTitleForBasic()
    {
        list=new ArrayList();
        list=driver.findElements(this.planTitle);
        return list.get(1).getText();
    }
    public String getPlanTitleForPremium()
    {
        list=new ArrayList();
        list=driver.findElements(this.planTitle);
        return list.get(2).getText();
    }

    public String getCurrencyForPage()
    {
        list=new ArrayList();
        list=driver.findElements(this.currencyForPage);
        if(list.get(0).getText() == list.get(1).getText() && list.get(0).getText()==list.get(2).getText())
        {
            return  list.get(0).getText();
        }
        return list.get(0).getText();
    }
    public String getPriceForLite()
    {
        list=new ArrayList();
        list=driver.findElements(this.priceForLite);
        return list.get(0).getText();
    }
    public String getPriceForBasic()
    {
        list=new ArrayList();
        list=driver.findElements(this.priceForBasic);
        return list.get(1).getText();
    }
    public String getPriceForPremium()
    {
        list=new ArrayList();
        list=driver.findElements(this.priceForPremium);
        return list.get(2).getText();
    }
    public WebDriver ClickOnSelectCountry()
    {
        Click(this.countryBtn);
        return this.driver;
    }
}
