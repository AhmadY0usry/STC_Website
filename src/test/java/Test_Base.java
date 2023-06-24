import Pages.Page_Base;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;

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
    public void takeScreenShotOnFailure(ITestResult testResult, String name){
        if (testResult.getStatus() == ITestResult.FAILURE) {
            take_screen_shoot(name);
        }
    }

}
