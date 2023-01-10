import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class sablonas {
    public static WebDriver driver;
    @Test
    public void first()
    {
        driver.get("https://www.vilniuscoding.lt/");
        driver.findElement(new By.ByXPath("/html/body/div[16]/div/button")).click();
        driver.findElement(new By.ByXPath("/html/body/div[14]/div/form/div[1]/div[1]/input")).click();
        //driver.manage().addCo
    }
    @BeforeClass
    public void second()
    {
        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver108.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @AfterClass
    public void afterClass(){
        //driver.quit();
    }
}
