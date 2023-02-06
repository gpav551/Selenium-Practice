import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.javatpoint.com/method-overloading-vs-method-overriding-in-java");
        driver.manage().window().maximize();
       // driver.findElement(By.xpath("//input[contains(@title,'Search')]")).sendKeys("WIU University");
       //
        for(int i=2;i<=6;i++) {
            for(int j=1;j<=3;j++) {
                String s = driver.findElement(By.xpath("//tbody/tr["+i+"]/td["+j+"]")).getText();
                System.out.println(s);
            }
        }
        Thread.sleep(5000);
        driver.findElement(By.name("username")).sendKeys("Hi");
        driver.quit();
    }


}
