package LoginPage;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTestPractice {

    protected WebDriver driver;

    @Test
    public void Setup() throws InterruptedException {
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
        // driver.findElement(By.xpath("//input[@id=':rj:']")).sendKeys("rajeshvariganji@gmail.com");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
