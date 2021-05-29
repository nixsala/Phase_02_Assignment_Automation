import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JupytorToysValidateSubmitButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://jupiter.cloud.planittesting.com/#/home");


        WebElement contact = driver.findElement(By.cssSelector("a[href=\"#/contact\"]"));
        contact.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement submit = driver.findElement(By.xpath("//a[text()='Submit']"));
        submit.click();


        System.out.println(driver.findElement(By.id("forename-err")).getText());
        System.out.println(driver.findElement(By.id("email-err")).getText());
        System.out.println(driver.findElement(By.id("message-err")).getText());


        WebElement txtForname = driver.findElement(By.id("forename"));
        WebElement txtSurname = driver.findElement(By.id("surname"));
        WebElement txtEmail = driver.findElement(By.id("email"));
        WebElement txtTelephone = driver.findElement(By.id("telephone"));
        WebElement txtMessage = driver.findElement(By.id("message"));


        txtForname.sendKeys("vithu");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        txtSurname.sendKeys("vaasu");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        txtEmail.sendKeys(("vithu@gmail.com"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        txtTelephone.sendKeys("0774569863");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        txtMessage.sendKeys("this is trial version");


        driver.quit();
    }
}






