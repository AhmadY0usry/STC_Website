package Test_In_Arabic;
import Pages.Page_Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

public class Test_Base {
    private WebDriver driver;
    protected Page_Base pageBase;
    protected SoftAssert softAssert;
    @BeforeClass
    @Parameters("browser")
    public void setUp(@Optional("Edge")String browserName)
    {
        if(browserName.equalsIgnoreCase("edge"))
            driver= new EdgeDriver();
            else if (browserName.equalsIgnoreCase("Chrome"))
            driver= new ChromeDriver();
            else if (browserName.equalsIgnoreCase("Firefox"))
            driver= new FirefoxDriver();

        driver.get("https://subscribe.stctv.com/sa-ar");
        driver.manage().window().maximize();
        pageBase =new Page_Base(driver);
    }

}
