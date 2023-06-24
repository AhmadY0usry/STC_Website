package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Bahrain_Page extends Page_Base {
    WebDriver driver;
    Page_Base pageBase;
    public Bahrain_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.pageBase=new Page_Base(driver);
    }
    private By Bahrain_Icon=By.id("bh");
    public void selectBahrainAsCountry()
    {
        pageBase.Click(this.Bahrain_Icon);
    }

}
