import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class BrowseTrainigPage {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\HP\\IdeaProjects\\Phase_Two_Assignment\\src\\main\\resources\\Virtusa_Online_Learning\\TrainingPage.html");
       /*
       Type Hello world in firstInput
        */
        WebElement firstInput = driver.findElement(By.id("first-one"));
        firstInput.sendKeys("Hello World");

        /*
        Copy the Input from firstInput and paste it on the secondInput
         */
        Actions keyBoardAction = new Actions(driver);
        keyBoardAction.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        keyBoardAction.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        WebElement secondInput = driver.findElement(By.id("second-one"));
        secondInput.click();
        keyBoardAction.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

        /*
        Java Script scrolling
         */
        JavascriptExecutor javaexecue = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //WebElement googleLink=driver.findElement(By.cssSelector("a[href=\"https://www.google.com/\"]"));
        WebElement googleLink = driver.findElement(By.linkText("Google in new Tab"));
        javaexecue.executeScript("arguments[0].scrollIntoView();", googleLink);


        /*
        Click google and get the google txt
         */
        googleLink.click();
        System.out.println(googleLink.getText());

        /*
        Move to next tab
         */
        ArrayList<String> getNewTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(getNewTab.get(1));

        /*
        Search Tasty Foods in Google search
        And the close the current tab
         */

        WebElement googleSearchField = driver.findElement(By.name("q"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        googleSearchField.sendKeys("Tasty Foods");
        googleSearchField.submit();
        driver.close();

        /*
        get new tab and scroll up
         */

        driver.switchTo().window(getNewTab.get(0));
        javaexecue.executeScript("window.scrollBy(0,-2000)");

        /*
        Click and Close the Alert
         */
        WebElement alert = driver.findElement(By.name("alert"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        alert.click();
        driver.switchTo().alert().dismiss();

        /*
        Clicking the Blaz deno
         */

        WebElement linkBlazdemo = driver.findElement(By.linkText("Blaze Demo in iframe"));
        javaexecue.executeScript("arguments[0].scrollIntoView();", linkBlazdemo);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        linkBlazdemo.click();
        javaexecue.executeScript("Window.scrollBy(0,-2000)");

        /*
        Switch iframe and Click Submit
         */

        driver.switchTo().frame("iframe_1");
        driver.findElement(By.className("btn-primary")).click();

        driver.quit();



    }


}