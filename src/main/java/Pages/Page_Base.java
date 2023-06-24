package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Page_Base {

    private WebDriver driver;
    protected By countryBtn=By.id("country-btn");
    protected By currencyForLite=By.cssSelector("#currency-لايت i");
    protected By currencyForBasic=By.cssSelector("#currency-الأساسية i");
    protected By currencyForPremium=By.cssSelector("#currency-بريميوم i");
    protected By price =By.cssSelector("#currency-لايت b");
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
}
