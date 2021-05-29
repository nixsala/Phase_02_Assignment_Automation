package byClass.Flight.guru99.Test.lk;

import byClass.Flight.guru99.lk.FlightPage;
import byClass.Flight.guru99.lk.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlightTest {

    WebDriver driver;

    @Test
    public void executeFlightTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/index.php");

        HomePage hp = new HomePage(driver);
        FlightPage fp = new FlightPage(driver);

        hp.enterUserName("nixsala");
        hp.enterPassword("nghko456");
        hp.clickSubmit();
        hp.clickFlightLink();
        fp.clickradioTripType();
        fp.selectcomboDestination();
        fp.clickradioServiceClass();
        fp.clickbuttonContinue();
        driver.close();


    }

}
