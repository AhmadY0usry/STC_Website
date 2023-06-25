package Test_In_Arabic;
import Pages.Page_Base;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;
import java.io.File;
import java.io.IOException;

public class Test_Base {
    private WebDriver driver;
    protected Page_Base pageBase;
    protected SoftAssert softAssert;
    protected ITestResult iTestResult;


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
    public void take_screen_shoot(String name) {
        {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try {
                FileHandler.copy(scrFile, new File("D:\\TestAutomatiom University\\STC_project\\target\\ScreenShoots\\"+name+".png"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @AfterMethod
    public void takeScreenShotOnFailure(ITestResult testResult){
        if (ITestResult.FAILURE==testResult.getStatus()) {
            take_screen_shoot(testResult.getInstanceName());
        }
    }
}