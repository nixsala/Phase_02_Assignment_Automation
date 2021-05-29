package byClass.Flight.guru99.lk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightPage {
    WebDriver driver;

    By radioTripType = By.cssSelector("input[name=\"tripType\"][value=\"oneway\"]");
    By comboDestination = By.name("toPort");
    By radioServiceClass = By.cssSelector("input[name=\"servClass\"][value=\"First\"]");
    By buttonContinue = By.cssSelector("[name='findFlights']");

    public FlightPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickradioTripType() {
        driver.findElement(radioTripType).click();
    }

    public void selectcomboDestination() {
        Select selectDestination = new Select(driver.findElement(comboDestination));
        selectDestination.selectByVisibleText("Frankfurt");

    }

    public void clickradioServiceClass() {
        driver.findElement(radioServiceClass).click();
    }

    public void clickbuttonContinue() {
        driver.findElement(buttonContinue).click();
    }

}
