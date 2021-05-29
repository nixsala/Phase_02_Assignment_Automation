package byClass.Flight.guru99.lk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By loginUserName = By.name("userName");
    By loginUserPass = By.name("password");
    By butSubmit = By.name("submit");
    By linkFlight = By.linkText("Flights");

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    public void enterUserName(String uName) {
        driver.findElement(loginUserName).sendKeys(uName);

    }

    public void enterPassword(String uPass) {
        driver.findElement(loginUserPass).sendKeys(uPass);
    }

    public void clickSubmit() {
        driver.findElement(butSubmit).click();
    }

    public void clickFlightLink() {
        driver.findElement(linkFlight).click();
    }


}
