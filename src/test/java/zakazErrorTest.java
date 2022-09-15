import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObject.OrderPageObject;

public class zakazErrorTest {
    private WebDriver driver;

    public zakazErrorTest(WebDriver driver) {

        this.driver = driver;
    }

    @Before
    public void before() {
        OrderPageObject.setOrderPageUrl();
    }

    @Test
    public void errorName() {
        Order.Zakaz("Rmmm", "Левада", "г.Ростов-на-Дону, пер.Казахстанский, д.19, кв.3", "89185324868", "11.05.2020", "Подеъд №1");
        if ((!driver.findElement(By.xpath("//*[text()='Введите корректное имя']")).getText()
                .contains("Введите корректное имя"))) throw new AssertionError();
    }

    @Test
    public void errorFamilia() {
        Order.Zakaz("Игорь", "64653", "г.Ростов-на-Дону, пер.Казахстанский, д.19, кв.3", "89185324868", "11.05.2020", "Подеъд №1");
        if ((!driver.findElement(By.xpath("//*[text()='Введите корректную фамилию']")).getText()
                .contains("Введите корректную фамиию"))) throw new AssertionError();
    }

    @Test
    public void errorAdress() {
        Order.Zakaz("Игорь", "Левада", "-=-=-=-=-=-=;;;***", "89185324868", "11.05.2020", "Подеъд №1");
        if ((!driver.findElement(By.xpath("//*[text()='Введите корректный адрес']")).getText()
                .contains("Введите корректный адрес"))) throw new AssertionError();
    }

    @Test
    public void errorMetro() {
        OrderPageObject.setOrderPageUrl();
        OrderPageObject.setButtonCookie();
        OrderPageObject.setButtonOrderUp();
        OrderPageObject.setName("Игорь");
        OrderPageObject.setSurname("Левада");
        OrderPageObject.setAddress("г.Ростов-на-Дону, пер.Казахстанский, д.19, кв.3");
        OrderPageObject.setPhone("89185324868");
        OrderPageObject.setButtonThen();
        if ((!driver.findElement(By.xpath("//*[text()='Выберете станцию']")).getText()
                .contains("Выберете станцию"))) throw new AssertionError();
    }

    @After
    public void teardown() {
        driver.quit();
    }
}