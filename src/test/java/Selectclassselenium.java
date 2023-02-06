import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Selectclassselenium {

    public static void main (String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        driver.manage().window().maximize();



    //    driver.findElement(By.xpath("//p/select")).click();
      //  driver.findElement(By.xpath("//p/select/option[5]")).click();

     //  Select drpdown = new Select(driver.findElement(By.xpath("//p/select")));
    //  drpdown.selectByIndex(5);
     //   Thread.sleep(5000);
     //   System.out.println(drpdown.getOptions().size());

        List<WebElement> s = driver.findElements(By.xpath("//p/select/option"));
        for(WebElement g : s)
        {
           System.out.println(g.getText());
        }
    }
}

