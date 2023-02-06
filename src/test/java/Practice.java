import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.mcdonalds.com/us/en-us.html");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div/a[contains(text(),'Order Now')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='radio0']")).click();
/*
        WebElement fromelement = (driver.findElement(By.xpath("//div/a[contains(text(),'Order Now')]")));
        WebElement toElement = driver.findElement(By.xpath("//input[@id='radio0']]"));
        Actions ac = new Actions(driver);
        ac.clickAndHold(fromelement).moveToElement(toElement).perform();

*/      Thread.sleep(5000);
        driver.quit();
    }


}


