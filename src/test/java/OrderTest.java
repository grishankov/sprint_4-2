import com.sun.tools.javac.Main;
import org.junit.After;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
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
        driver.get("https://qa-scooter.praktikum-services.ru/");
        Main main = new Main(driver);
        main.order("Игорь", "Левада", "г.Ростов-на-Дону", "89185324868", "01.07.2022", "самокат");
    }
    // Заказ через верхнюю кнопку "Заказать"
    @Test
    public void orderInputFirefoxTest1() {
        driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        pageobject.Main main = new pageobject.Main(driver);
        main.order("Игорь", "Левада", "г.Ростов-на-Дону", "89185324868", "01.07.2022", "жду");
        Assertions.assertTrue(driver.findElements(By.xpath("//button[text()='Посмотреть статус']")).size()==1, "Кнопка 'Посмотреть статус' не отобразилась");
    }
    // Заказ через нижнюю кнопку "Заказать"
    @Test
    public void orderInputFirefoxTest2() {
        driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        pageobject.Main main = new pageobject.Main(driver);
        main.secondorder("Игорь", "Левада", "г.Ростов-на-Дону", "89185324868", "01.07.2022", "Чем быстрее, тем лучше");
        Assertions.assertTrue(driver.findElements(By.xpath("//button[text()='Посмотреть статус']")).size()==1, "Кнопка 'Посмотреть статус' не отобразилась");
    }
    @After
    public void teardown() {
        driver.quit();
    }
}