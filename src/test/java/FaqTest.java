import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.FaqPageObject;


import static org.junit.Assert.*;



public class FaqTest {
    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }
    private WebDriver driver;
    private String expectedFirstAnswerText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private String expectedSecondAnswerText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private String expectedThirdAnswerText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private String expectedFourthAnswerText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private String expectedFifthAnswerText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private String expectedSixthAnswerText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private String expectedSeventhAnswerText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private String expectedEighthAnswerText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    @Test
    public void firstQuestion() {
        driver = new ChromeDriver();
        FaqPageObject objectFaqPageObject = new FaqPageObject(driver);
        objectFaqPageObject.getFaqPageUrl();
        objectFaqPageObject.clickCookieButtonFaq();
        objectFaqPageObject.clickFirstQuestion();
        String actualFirstAnswerText = objectFaqPageObject.getFirstAnswerText();
        assertEquals(expectedFirstAnswerText, actualFirstAnswerText);
    }

    @Test
    public void secondQuestion() {
        driver = new ChromeDriver();
        FaqPageObject objectFaqPageObject = new FaqPageObject(driver);
        objectFaqPageObject.getFaqPageUrl();
        objectFaqPageObject.clickCookieButtonFaq();
        objectFaqPageObject.clickSecondQuestion();
        String actualSecondAnswerText = objectFaqPageObject.getSecondAnswerText();
        assertEquals(expectedSecondAnswerText, actualSecondAnswerText);
    }

    @Test
    public void thirdQuestion() {
        driver = new ChromeDriver();
        FaqPageObject objectFaqPageObject = new FaqPageObject(driver);
        objectFaqPageObject.getFaqPageUrl();
        objectFaqPageObject.clickCookieButtonFaq();
        objectFaqPageObject.clickThirdQuestion();
        String actualThirdAnswerText = objectFaqPageObject.getThirdAnswerText();
        assertEquals(expectedThirdAnswerText, actualThirdAnswerText);
    }

    @Test
    public void fourthQuestion() {
        driver = new ChromeDriver();
        FaqPageObject objectFaqPageObject = new FaqPageObject(driver);
        objectFaqPageObject.getFaqPageUrl();
        objectFaqPageObject.clickCookieButtonFaq();
        objectFaqPageObject.clickFourthQuestion();
        String actualFourthAnswerText = objectFaqPageObject.getFourthAnswerText();
        assertEquals(expectedFourthAnswerText, actualFourthAnswerText);
    }

    @Test
    public void fifthQuestion() {
        driver = new ChromeDriver();
        FaqPageObject objectFaqPageObject = new FaqPageObject(driver);
        objectFaqPageObject.getFaqPageUrl();
        objectFaqPageObject.clickCookieButtonFaq();
        objectFaqPageObject.clickFifthQuestion();
        String actualFifthAnswerText = objectFaqPageObject.getFifthAnswerText();
        assertEquals(expectedFifthAnswerText, actualFifthAnswerText);
    }

    @Test
    public void sixthQuestion() {
        driver = new ChromeDriver();
        FaqPageObject objectFaqPageObject = new FaqPageObject(driver);
        objectFaqPageObject.getFaqPageUrl();
        objectFaqPageObject.clickCookieButtonFaq();
        objectFaqPageObject.clickSixthQuestion();
        String actualSixthAnswerText = objectFaqPageObject.getSixthAnswerText();
        assertEquals(expectedSixthAnswerText, actualSixthAnswerText);
    }

    @Test
    public void seventhQuestion() {
        driver = new ChromeDriver();
        FaqPageObject objectFaqPageObject = new FaqPageObject(driver);
        objectFaqPageObject.getFaqPageUrl();
        objectFaqPageObject.clickCookieButtonFaq();
        objectFaqPageObject.clickSeventhQuestion();
        String actualSeventhAnswerText = objectFaqPageObject.getSeventhAnswerText();
        assertEquals(expectedSeventhAnswerText, actualSeventhAnswerText);
    }

    @Test
    public void eighthQuestion() {
        driver = new ChromeDriver();
        FaqPageObject objectFaqPageObject = new FaqPageObject(driver);
        objectFaqPageObject.getFaqPageUrl();
        objectFaqPageObject.clickCookieButtonFaq();
        objectFaqPageObject.clickEighthQuestion();
        String actualEighthAnswerText = objectFaqPageObject.getEighthAnswerText();
        assertEquals(expectedEighthAnswerText, actualEighthAnswerText);
    }
    @After
    public void tearDown() {
        driver.quit();
    }

}
