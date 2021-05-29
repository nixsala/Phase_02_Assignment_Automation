package FindbyClass.FlightTour.guru99.lk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageFind {
    WebDriver driver;
    @FindBy(how = How.NAME, using = "userName")
    WebElement loginUserName;
    @FindBy(how = How.NAME, using = "password")
    WebElement loginUserPass;
    @FindBy(how = How.NAME, using = "submit")
    WebElement butSubmit;
    @FindBy(how = How.LINK_TEXT, using = "Flights")
    WebElement linkFlight;


    public HomePageFind(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(String uname) {
        loginUserName.sendKeys(uname);

    }

    public void enterPassword(String upass) {
        loginUserPass.sendKeys(upass);

    }

    public void clickSubmit() {
        butSubmit.click();
    }

    public void clickFlightLink() {
        linkFlight.click();
    }


}
