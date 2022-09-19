import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObject.OrderPageObject;

import static org.junit.Assert.assertTrue;


public class OrderTest{
    private WebDriver driver;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
    }
    @Test
    public void orderTestFirefoxHeaderButtonOrder() {
        driver = new FirefoxDriver();
        OrderPageObject objectOrderPage = new OrderPageObject(driver);
        objectOrderPage.getOrderPageUrl();
        objectOrderPage.clickButtonCookieOrder();
        objectOrderPage.clickButtonOrderUp();
        objectOrderPage.enterName("Игорь");
        objectOrderPage.enterSurname("Левада");
        objectOrderPage.enterAddress("г.Ростов-на-Дону, пер.Казахстанский, д.19, кв.3");
        objectOrderPage.clickMetro();
        objectOrderPage.clickMetroSecondStep();
        objectOrderPage.enterPhone("89185324868");
        objectOrderPage.clickButtonThen();
        objectOrderPage.enterDate("11.05.2020");
        objectOrderPage.clickAboutRent();
        objectOrderPage.setRentalPeriod();
        objectOrderPage.setDay();
        objectOrderPage.setScooterColor();
        objectOrderPage.enterComment("Подеъд №1");
        objectOrderPage.clickButtonOrderRent();
        objectOrderPage.clickButtonYes();
        assertTrue(objectOrderPage.orderSuccessCheck());
        objectOrderPage.clickButtonOrderStatus();
    }

    @Test
    public void orderTestFirefoxMiddleButton() {
        driver = new FirefoxDriver();
        OrderPageObject objectOrderPage = new OrderPageObject(driver);
        objectOrderPage.getOrderPageUrl();
        objectOrderPage.clickButtonCookieOrder();
        objectOrderPage.clickButtonOrderDown();
        objectOrderPage.enterName("Игорь");
        objectOrderPage.enterSurname("Левада");
        objectOrderPage.enterAddress("г.Ростов-на-Дону, пер.Казахстанский, д.19, кв.3");
        objectOrderPage.clickMetro();
        objectOrderPage.clickMetroSecondStep();
        objectOrderPage.enterPhone("89185324868");
        objectOrderPage.clickButtonThen();
        objectOrderPage.enterDate("11.05.2020");
        objectOrderPage.clickAboutRent();
        objectOrderPage.setRentalPeriod();
        objectOrderPage.setDay();
        objectOrderPage.setScooterColor();
        objectOrderPage.enterComment("Подеъд №1");
        objectOrderPage.clickButtonOrderRent();
        objectOrderPage.clickButtonYes();
        assertTrue(objectOrderPage.orderSuccessCheck());
        objectOrderPage.clickButtonOrderStatus();
    }

    @Test
    public void orderTestChromeHeaderButtonOrder() {
        driver = new ChromeDriver();
        OrderPageObject objectOrderPage = new OrderPageObject(driver);
        objectOrderPage.getOrderPageUrl();
        objectOrderPage.clickButtonCookieOrder();
        objectOrderPage.clickButtonOrderUp();
        objectOrderPage.enterName("Игорь");
        objectOrderPage.enterSurname("Левада");
        objectOrderPage.enterAddress("г.Ростов-на-Дону, пер.Казахстанский, д.19, кв.3");
        objectOrderPage.clickMetro();
        objectOrderPage.clickMetroSecondStep();
        objectOrderPage.enterPhone("89185324868");
        objectOrderPage.clickButtonThen();
        objectOrderPage.enterDate("11.05.2020");
        objectOrderPage.clickAboutRent();
        objectOrderPage.setRentalPeriod();
        objectOrderPage.setDay();
        objectOrderPage.setScooterColor();
        objectOrderPage.enterComment("Подеъд №1");
        objectOrderPage.clickButtonOrderRent();
        objectOrderPage.clickButtonYes();
        assertTrue(objectOrderPage.orderSuccessCheck());
        objectOrderPage.clickButtonOrderStatus();
    }

    @Test
    public void orderTestChromeMiddleButtonOrder() {
        driver = new ChromeDriver();
        OrderPageObject objectOrderPage = new OrderPageObject(driver);
        objectOrderPage.getOrderPageUrl();
        objectOrderPage.clickButtonCookieOrder();
        objectOrderPage.clickButtonOrderDown();
        objectOrderPage.enterName("Игорь");
        objectOrderPage.enterSurname("Левада");
        objectOrderPage.enterAddress("г.Ростов-на-Дону, пер.Казахстанский, д.19, кв.3");
        objectOrderPage.clickMetro();
        objectOrderPage.clickMetroSecondStep();
        objectOrderPage.enterPhone("89185324868");
        objectOrderPage.clickButtonThen();
        objectOrderPage.enterDate("11.05.2020");
        objectOrderPage.clickAboutRent();
        objectOrderPage.setRentalPeriod();
        objectOrderPage.setDay();
        objectOrderPage.setScooterColor();
        objectOrderPage.enterComment("Подеъд №1");
        objectOrderPage.clickButtonOrderRent();
        objectOrderPage.clickButtonYes();
        assertTrue(objectOrderPage.orderSuccessCheck());
        objectOrderPage.clickButtonOrderStatus();
    }

    @After
    public void teardown() {
        driver.quit();
    }
    }