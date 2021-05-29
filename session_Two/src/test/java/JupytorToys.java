import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JupytorToys {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://jupiter.cloud.planittesting.com/#/home");


//        try {
//            driver.findElement(By.cssSelector(".lead")).isDisplayed();
//            System.out.println("Successfuly Navigate to URL");
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("The URL Not Found");

        WebElement contact = driver.findElement(By.cssSelector("a[href=\"#/contact\"]"));
        contact.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement submit = driver.findElement(By.xpath("//a[text()='Submit']"));
        submit.click();


        WebElement txtForname = driver.findElement(By.id("forename"));
        WebElement txtSurname = driver.findElement(By.id("surname"));
        WebElement txtEmail = driver.findElement(By.id("email"));
        WebElement txtTelephone = driver.findElement(By.id("telephone"));
        WebElement txtMessage = driver.findElement(By.id("message"));

        if (txtForname.getAttribute("value").isEmpty()) {
            driver.findElement(By.id("forename")).sendKeys("");
        }
        if (txtSurname.getAttribute("value").isEmpty()) {
            driver.findElement(By.id("surname")).sendKeys("");
        }
        if (txtEmail.getAttribute("value").isEmpty()) {
            driver.findElement(By.id("email")).sendKeys("");
        }
        if (txtTelephone.getAttribute("value").isEmpty()) {
            driver.findElement(By.id("telephone")).sendKeys("");
        }
        if (txtMessage.getAttribute("value").isEmpty()) {
            driver.findElement(By.id("message")).sendKeys("");
        }

        System.out.println("Test case succesfully run");
        driver.quit();

    }
}


