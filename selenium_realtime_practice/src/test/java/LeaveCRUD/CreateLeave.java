package LeaveCRUD;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class CreateLeave
{
    protected WebDriver driver;

    @BeforeMethod
    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://employeegalaxy.com/login/");
        driver.findElement(By.id(":r0:")).sendKeys("rajeshvariganji@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.id(":r1:")).sendKeys("Rajesh@1892", Keys.ENTER);
        Thread.sleep(3000);
    }
    @Test
    public void applyLeave() throws InterruptedException {
        //Click the Sidenave Bar button
        driver.findElement(By.xpath("//button[@aria-label='open drawer']")).click();
        Thread.sleep(3000);
        //Click the applyleave button
        driver.findElement(By.xpath("//li//span[text()='Leaves']")).click();
        Thread.sleep(3000);
        //Click Add Button
        driver.findElement(By.xpath("//button[@type='button' and @aria-label='add']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='button' and @aria-label='Choose date']")). click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("driver.findElement(By.xpath(//button[@aria-label='March 26, 2026']")).click();
        Thread.sleep(3000);


}

}
