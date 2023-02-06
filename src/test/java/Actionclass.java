import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

    public static void main (String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().window().maximize();

      // JavascriptExecutor js = (JavascriptExecutor)  driver;
     //https://www.globalsqa.com/demo-site/draganddrop/

        WebElement fromelement = (driver.findElement(By.xpath("//li[1]/img")));
        WebElement toElement = driver.findElement(By.xpath("//div[@id='trash']"));
        Actions ac = new Actions(driver);
        ac.clickAndHold(fromelement).moveToElement(toElement).perform();




      //  ac.click();
      //  ac.moveToElement(driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"))).build().perform();


        Thread.sleep(5000);
       // driver.quit();


    }

    }
