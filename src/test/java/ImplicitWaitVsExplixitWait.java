import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class ImplicitWaitVsExplixitWait {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        /* Implicit Wait will wait for all the elements which we write
        Lets say Implicit wait is given as 30 sec
        * Say Suppose Home button took only 12 sec to load, so driver will click on Home as it loaded
         If home button could not load within 30 sec, execution will stop
         this applies for all the elements which have been written*/
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.mcdonalds.com/us/en-us.html");
        driver.manage().window().maximize();

//        WebDriverWait wait = new WebDriverWait(driver,10);
//        WebElement homebutton = driver.findElement(By.xpath(""));
//        wait.until(ExpectedConditions.visibilityOf(homebutton));
        /* Explicit wait mean, it will wait only for particiular element"*/







    }
}
