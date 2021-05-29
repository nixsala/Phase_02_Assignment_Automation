package FindbyClass.FlightTour.guru99.lk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class FlightPageFind {
    WebDriver driver;


    @FindBy(how = How.CSS, using = "input[name=\"tripType\"][value=\"oneway\"]")
    WebElement radioTripType;
    @FindBy(how = How.NAME, using = "toPort")
    WebElement comboDestination;
    @FindBy(how = How.CSS, using = "input[name=\"servClass\"][value=\"First\"]")
    WebElement radioServiceClass;
    @FindBy(how = How.CSS, using = "[name='findFlights']")
    WebElement buttonContinue;


    public FlightPageFind(WebDriver driver) {
        this.driver = driver;
    }

    public void clickradioTripType() {
        radioTripType.click();
    }

    public void selectcomboDestination() {
        Select selectDestination = new Select(comboDestination);
        selectDestination.selectByVisibleText("Frankfurt");

    }

    public void clickradioServiceClass() {
        radioServiceClass.click();
    }

    public void clickbuttonContinue() {
        buttonContinue.click();
    }


}
