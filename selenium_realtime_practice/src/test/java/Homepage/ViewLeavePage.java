package Homepage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ViewLeavePage {
    protected WebDriver driver;

    @BeforeMethod
    public void setup() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://employeegalaxy.com/login/");
        Thread.sleep(3000);
        driver.findElement(By.id(":r0:")).sendKeys("rajeshvariganji@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.id(":r1:")).sendKeys("Rajesh@1892", Keys.ENTER);
        Thread.sleep(3000);
    }
    @Test
public void viewLeave() throws InterruptedException {
        //Click the Sidenave Bar button
        driver.findElement(By.xpath("//button[@aria-label='open drawer']")).click();
        Thread.sleep(3000);
// click the HomeButton
        driver.findElement(By.xpath("//li//span[text()='Home']")).click();
        Thread.sleep(3000);
        // Click Apply LeaveButton Icon
        driver.findElement(By.xpath("//a[@href='/employee/applyLeave']")).click();
        Thread.sleep(3000);

    }

        @AfterMethod
    public void tearDown(){
        driver.quit();

    }
}


