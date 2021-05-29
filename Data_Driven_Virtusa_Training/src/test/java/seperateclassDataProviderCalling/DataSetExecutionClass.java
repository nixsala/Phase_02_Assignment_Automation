package seperateclassDataProviderCalling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataSetExecutionClass {
    WebDriver driver;



    @Test(dataProvider ="loginDetails",dataProviderClass =DataSetObject.class )
    public  void tourLoginTest(String username,String password){
        {
            System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
            driver=new ChromeDriver();
            driver.get("http://demo.guru99.com/test/newtours/");
            driver.findElement(By.name("userName")).sendKeys(username);
            driver.findElement(By.name("password")).sendKeys(password);
            driver.findElement(By.name("submit")).click();
            driver.close();

        }
    }

}
