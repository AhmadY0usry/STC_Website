package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Saudi_Page extends Page_Base {
    WebDriver driver;
    Page_Base pageBase;

    public Saudi_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.pageBase = new Page_Base(driver);
    }

    private By Saudi_Icon = By.id("sa");


    public void selectSaudiAsCountry() {
        pageBase.Click(this.Saudi_Icon);
    }
}

