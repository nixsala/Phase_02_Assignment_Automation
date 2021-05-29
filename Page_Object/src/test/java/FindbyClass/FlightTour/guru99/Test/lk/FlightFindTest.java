package FindbyClass.FlightTour.guru99.Test.lk;

import FindbyClass.FlightTour.guru99.lk.FlightPageFind;
import FindbyClass.FlightTour.guru99.lk.HomePageFind;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FlightFindTest {
    WebDriver driver;

    @Test
    public void executeFlightTestUsingFindBy() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/index.php");

        HomePageFind hpf = PageFactory.initElements(driver, HomePageFind.class);
        FlightPageFind fpf = PageFactory.initElements(driver, FlightPageFind.class);

        hpf.enterUserName("nixsala");
        hpf.enterPassword("nghko456");
        hpf.clickSubmit();
        hpf.clickFlightLink();
        fpf.clickradioTripType();
        fpf.selectcomboDestination();
        fpf.clickradioServiceClass();
        fpf.clickbuttonContinue();
        driver.close();


    }
}
