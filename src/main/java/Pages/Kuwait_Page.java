package Pages;

import org.openqa.selenium.WebDriver;

public class Kuwait_Page extends Page_Base {

    WebDriver driver;
    Page_Base pageBase;

    public Kuwait_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.pageBase = new Page_Base(driver);

    }
}
