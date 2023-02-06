import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

    public static  void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://demoqa.com/droppable/");
        driver.manage().window().maximize();
       // driver.findElement(By.xpath("//*[@id=\"draggable\"]")).sendKeys(Keys.TAB);
        Thread.sleep(6000);
        Actions action = new Actions(driver);
        action.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"draggable\"]")),driver.findElement(By.xpath("//*[@id=\"droppable\"]")))
                .build().perform();
        Thread.sleep(6000);
        driver.quit();
    }

}
