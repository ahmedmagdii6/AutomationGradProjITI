package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTests {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {

        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
