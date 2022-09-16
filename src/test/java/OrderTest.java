import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.OrderPageObject;



public class OrderTest{
    WebDriver driver = new ChromeDriver();


    @Test
    public void orderTestChrome() {
        OrderPageObject objectOrderPage = new OrderPageObject(driver);
        objectOrderPage.OrderPageUrl();
        objectOrderPage.ButtonCookie();
        objectOrderPage.ButtonOrderUp();
        objectOrderPage.Name("Игорь");
        objectOrderPage.Surname("Левада");
        objectOrderPage.Address("г.Ростов-на-Дону, пер.Казахстанский, д.19, кв.3");
        objectOrderPage.Metro();
        objectOrderPage.Metro2();
        objectOrderPage.Phone("89185324868");
        objectOrderPage.ButtonThen();
        objectOrderPage.Date("11.05.2020");
        objectOrderPage.AboutRent();
        objectOrderPage.RentalPeriod();
        objectOrderPage.Day();
        objectOrderPage.ScooterColor();
        objectOrderPage.Comment("Подеъд №1");
        objectOrderPage.ButtonOrderRent();
        objectOrderPage.ButtonYes();
        objectOrderPage.ButtonOrderStatus();
        objectOrderPage.OrderNumber();
        objectOrderPage.ButtonGO();
    }
    @Test
    public void errorName() {

        OrderPageObject objectOrderPage = new OrderPageObject(driver);
        objectOrderPage.OrderPageUrl();
        objectOrderPage.ButtonCookie();
        objectOrderPage.ButtonOrderUp();
        String[] simbols = {"RAG77", "12233", "-+=", "   ", "омррр219@mail.ru", "mail@mail.ru"};
        for (int i = 0; i < simbols.length; i++) {
            objectOrderPage.Name(simbols[i]);
        }
        objectOrderPage.Surname("Левада");
        objectOrderPage.Address("г.Ростов-на-Дону, пер.Казахстанский, д.19, кв.3");
        objectOrderPage.Metro();
        objectOrderPage.Metro2();
        objectOrderPage.Phone("89185324868");
        objectOrderPage.ButtonThen();
        objectOrderPage.Date("11.05.2020");
        objectOrderPage.AboutRent();
        objectOrderPage.RentalPeriod();
        objectOrderPage.Day();
        objectOrderPage.ScooterColor();
        objectOrderPage.Comment("Подеъд №1");
        objectOrderPage.ButtonOrderRent();
        objectOrderPage.ButtonYes();
        objectOrderPage.ButtonOrderStatus();
        objectOrderPage.OrderNumber();
        objectOrderPage.ButtonGO();
    }

    @Test
    public void errorSurName() {

        OrderPageObject objectOrderPage = new OrderPageObject(driver);
        objectOrderPage.OrderPageUrl();
        objectOrderPage.ButtonCookie();
        objectOrderPage.ButtonOrderUp();
        objectOrderPage.Name("Игорь");
        String[] simbols = {"RAG77", "12233", "-+=", "   ", "омррр219@mail.ru", "mail@mail.ru"};
        for (int i = 0; i < simbols.length; i++) {
            objectOrderPage.Surname(simbols[i]);
        }
        objectOrderPage.Address("г.Ростов-на-Дону, пер.Казахстанский, д.19, кв.3");
        objectOrderPage.Metro();
        objectOrderPage.Metro2();
        objectOrderPage.Phone("89185324868");
        objectOrderPage.ButtonThen();
        objectOrderPage.Date("11.05.2020");
        objectOrderPage.AboutRent();
        objectOrderPage.RentalPeriod();
        objectOrderPage.Day();
        objectOrderPage.ScooterColor();
        objectOrderPage.Comment("Подеъд №1");
        objectOrderPage.ButtonOrderRent();
        objectOrderPage.ButtonYes();
        objectOrderPage.ButtonOrderStatus();
        objectOrderPage.OrderNumber();
        objectOrderPage.ButtonGO();
    }
    @Test
    public void errorAdress() {

        OrderPageObject objectOrderPage = new OrderPageObject(driver);
        objectOrderPage.OrderPageUrl();
        objectOrderPage.ButtonCookie();
        objectOrderPage.ButtonOrderUp();
        objectOrderPage.Name("Игорь");
        objectOrderPage.Surname("Левада");
        String[] simbols = {"RAG77", "12233", "-+=", "   ", "омррр219@mail.ru", "mail@mail.ru"};
        for (int i = 0; i < simbols.length; i++) {
            objectOrderPage.Address(simbols[i]);
        }
        objectOrderPage.Metro();
        objectOrderPage.Metro2();
        objectOrderPage.Phone("89185324868");
        objectOrderPage.ButtonThen();
        objectOrderPage.Date("11.05.2020");
        objectOrderPage.AboutRent();
        objectOrderPage.RentalPeriod();
        objectOrderPage.Day();
        objectOrderPage.ScooterColor();
        objectOrderPage.Comment("Подеъд №1");
        objectOrderPage.ButtonOrderRent();
        objectOrderPage.ButtonYes();
        objectOrderPage.ButtonOrderStatus();
        objectOrderPage.OrderNumber();
        objectOrderPage.ButtonGO();
    }
    @Test
    public void errorMetro() {
        OrderPageObject objectOrderPage = new OrderPageObject(driver);
        objectOrderPage.OrderPageUrl();
        objectOrderPage.ButtonCookie();
        objectOrderPage.ButtonOrderUp();
        objectOrderPage.Name("Игорь");
        objectOrderPage.Surname("Левада");
        objectOrderPage.Address("г.Ростов-на-Дону, пер.Казахстанский, д.19, кв.3");
        objectOrderPage.Phone("89185324868");
        objectOrderPage.ButtonThen();

    }

    @After
    public void teardown() {
        driver.quit();
    }
    }