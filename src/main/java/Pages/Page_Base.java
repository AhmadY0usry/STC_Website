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
    protected By selectLanguage=By.id("translation-btn");
    private List <WebElement> list;

    public Page_Base(WebDriver driver) {
        this.driver = driver;
    }
    public void Click(By by)
    {
        driver.findElement(by).click();
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
        if (list.get(0).getText() == list.get(1).getText() && list.get(0).getText()==list.get(2).getText())
        {
            return  list.get(0).getText();
        }
        return "The currencies are not equal";
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

    public void clickOnTranslateBtn()
    {
        Click(this.selectLanguage);
    }

}
