import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.macys.com/?lid=glbtopnav_macys_icon-us");
        driver.manage().window().maximize();
        // driver.findElement(By.xpath("//input[contains(@title,'Search')]")).sendKeys("WIU University")
        driver.findElement(By.xpath("//input[@name='username']")).click();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Hi");

        Thread.sleep(5000);
        driver.quit();
    }


}
