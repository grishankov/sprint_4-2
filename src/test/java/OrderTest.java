import com.sun.tools.javac.Main;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrderTest {
    WebDriver driver = new ChromeDriver();


    @Test
    public void orderTestChrome (){
        driver = new ChromeDriver();
        Main.Order("Игорь", "Левада", "г.Ростов-на-Дону, пер.Казахстанский, д.19, кв.3", "89185324868", "11.05.2020", "Подеъд №1");
    }

    @After
    public void teardown() {
        driver.quit();
    }
}