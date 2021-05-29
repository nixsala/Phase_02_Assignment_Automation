import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginCredientials {

@Test(dataProvider = "login")
        public  void tourGuide(String username, String userpass){


        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/newtours/");
        driver.findElement(By.name("userName")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(userpass);
        driver.findElement(By.name("submit")).click();





}
@DataProvider(name="login")
        public  Object[][] getData(){
        Object[][] data={{"nixsala","nadesan"},{"nirvi","vithu"}};
        return  data;
}
}
