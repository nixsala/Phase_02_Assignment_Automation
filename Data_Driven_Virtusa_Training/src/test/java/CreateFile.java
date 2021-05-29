import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException, InterruptedException {
        File file = new File("src/main/resources/biscuit.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook xfs = new XSSFWorkbook(fis);
        XSSFSheet sheet= xfs.getSheetAt(0);

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.findElement(By.name("q")).sendKeys("biscuit");
        driver.findElement(By.name("q")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("btnK")).click();
        Thread.sleep(2000);
        String title = driver.getTitle();

        sheet.getRow(0).createCell(3).setCellValue(title);
        FileOutputStream fos = new FileOutputStream(file);
        xfs.write(fos);

    }
}
