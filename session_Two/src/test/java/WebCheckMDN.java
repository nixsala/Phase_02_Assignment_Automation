import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCheckMDN {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement input=driver.findElement(By.cssSelector("input[id=\"txtUsername\"]"));
        input.sendKeys("Admin");
        WebElement inputTwo=driver.findElement(By.cssSelector("input[name=\"txtPassword\"]"));
        inputTwo.sendKeys("admin123");
        WebElement clickOne=driver.findElement(By.cssSelector("input[type=\"submit\"]"));
        clickOne.click();

        driver.quit();
    }
}
