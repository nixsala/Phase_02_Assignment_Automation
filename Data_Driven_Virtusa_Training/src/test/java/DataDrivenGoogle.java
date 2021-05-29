
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataDrivenGoogle {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        File file = new File("src/main/resources/Google_Search.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook xfs = new XSSFWorkbook(fis);
        XSSFSheet sheet_1 = xfs.getSheetAt(0);
        String google_Data = sheet_1.getRow(3).getCell(0).getStringCellValue();
        System.out.println(google_Data);
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys(google_Data);
        driver.findElement(By.name("btnK")).click();


    }
}
