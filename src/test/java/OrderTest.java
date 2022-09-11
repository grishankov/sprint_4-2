import com.sun.tools.javac.Main;
import org.asynchttpclient.util.Assertions;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrderTest {
    private WebDriver driver;
    // Заказ через верхнюю кнопку "Заказать": не работает кнопка "Да" в Chrome
    @Test
    public void orderInputChromeTest1() {
        driver = new ChromeDriver();


    }
    @After
    public void teardown() {

        driver.quit();
    }
}