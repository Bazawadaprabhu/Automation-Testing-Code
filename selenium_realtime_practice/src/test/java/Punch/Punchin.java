package Punch;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Punchin
{
    protected WebDriver driver;

    @BeforeMethod
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
    }
    @Test
    public void punchin() throws InterruptedException {
        driver.findElement(By.xpath("//button[@aria-label='Punch In']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@aria-label='open drawer']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li//span[text()='Punch Details']")).click();
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        driver.findElement(By.xpath("//button[@aria-label='Open']")).click();
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(3000);

    }
}
