import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class teststart {

    private String k = "quality assurance";
    private WebDriver driver;

    @Test
    public void start(){

        System.setProperty("webdriver.chrome.driver","D:\\SoftQA\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.google.com.ua");
        driver.findElement(By.cssSelector("#tsf [type=\"text\"]")).sendKeys(k);
        driver.findElement(By.cssSelector("div.FPdoLc.VlcLAe input[type=\"submit\"]:nth-child(1)")).click();

    }

    @Before
    public void before(){

    }

    @After
    public void after(){
        driver.quit();
    }


}
