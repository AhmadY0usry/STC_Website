package Test_In_English;

import Pages.Page_Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

public class Test_Base {
    private WebDriver driver;
    protected Page_Base pageBase;
    protected SoftAssert softAssert;
    @BeforeClass
    public void setUp()
    {
        driver= new EdgeDriver();
        driver.get("https://subscribe.stctv.com/sa-ar");
        driver.manage().window().maximize();
        pageBase =new Page_Base(driver);
    }

}
