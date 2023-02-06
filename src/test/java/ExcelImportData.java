import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;



public class ExcelImportData {
    public static void main(String[] args) throws InterruptedException, IOException {

//   //input[@name='password']
//     input[@name='username']
  //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login


        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        FileInputStream file = new FileInputStream("C:/Users/pavan/OneDrive/Desktop/Selenium.xlsx");
        System.out.print("Im in Execl");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);
        System.out.print("Im out Excel");

        String username = sheet.getRow(0).getCell(0).getStringCellValue();
        String password = sheet.getRow(0).getCell(1).getStringCellValue();

        driver.findElement(By.xpath("//input[@name='username']")).click();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);

        driver.findElement(By.xpath("//input[@name='password']")).click();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // added new changes

        // added new changes to branch


    }
}
