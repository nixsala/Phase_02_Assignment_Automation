package tamilDhool.lk;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PlaySerial {

    @Test(priority = 1)
    public void playSerialOne() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tamildhool.net/zee-tamil/zee-tamil-serial/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.tamildhool.net/zee-tamil/zee-tamil-serial/iniya-iru-malargal/iniya-iru-malargal-26-05-2021/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        js.executeScript("window.scrollBy(0,350)", "");
        js.executeScript("window.scrollBy(0,350)", "");
        WebElement video = driver.findElement(By.id("652d94f0-caa4-4a1d-9cf6-dfb680df664dscript"));
        String url = video.getAttribute("src");
        driver.navigate().to(url);
        js.executeScript("wpstats().play();");
        Thread.sleep(2000);
//        js .executeScript("document.getElementById(\"post-338002\").play()");
    }
}
