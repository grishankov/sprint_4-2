import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObject.OrderPageObject;



public class OrderTest{

    @Test
    public void orderTestFirefoxHeaderButtonOrder() {
        WebDriver driver = new FirefoxDriver();
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
        objectOrderPage.orderSuccessCheck();
        objectOrderPage.clickButtonOrderStatus();
        objectOrderPage.getOrderNumber();
        objectOrderPage.clickButtonGO();
    }

    @Test
    public void orderTestFirefoxHeaderButtonDown() {
        WebDriver driver = new FirefoxDriver();
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
        objectOrderPage.orderSuccessCheck();
        objectOrderPage.clickButtonOrderStatus();
        objectOrderPage.getOrderNumber();
        objectOrderPage.clickButtonGO();
    }

    @Test
    public void orderTestChromeHeaderButtonOrder() {
        WebDriver driver = new ChromeDriver();
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
        objectOrderPage.orderSuccessCheck();
        objectOrderPage.clickButtonOrderStatus();
        objectOrderPage.getOrderNumber();
        objectOrderPage.clickButtonGO();
    }

    @Test
    public void orderTestChromeMiddleButtonOrder() {
        WebDriver driver = new ChromeDriver();
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
        objectOrderPage.orderSuccessCheck();
        objectOrderPage.clickButtonOrderStatus();
        objectOrderPage.getOrderNumber();
        objectOrderPage.clickButtonGO();
    }

    @After
    public void teardown() {
        WebDriver driver = new ChromeDriver();
        driver.quit();
    }
    }