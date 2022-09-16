import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.FaqPage;


import static org.junit.Assert.*;


public class FaqTest {
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
    public void FirstQuestion() {
        driver = new ChromeDriver();
        pages.FaqPage objectFaqPage = new FaqPage(driver);
        objectFaqPage.FAQ_PAGE_URL();
        objectFaqPage.clickCookieButton();
        objectFaqPage.clickFirstQuestion();
        String actualFirstAnswerText = objectFaqPage.getFirstAnswerText();
        assertEquals(expectedFirstAnswerText, actualFirstAnswerText);
        System.out.println(actualFirstAnswerText);
    }

    @Test
    public void secondQuestion() {
        driver = new ChromeDriver();
        pages.FaqPage objectFaqPage = new FaqPage(driver);
        objectFaqPage.FAQ_PAGE_URL();
        objectFaqPage.clickCookieButton();
        objectFaqPage.clickSecondQuestion();
        String actualSecondAnswerText = objectFaqPage.getSecondAnswerText();
        assertEquals(expectedSecondAnswerText, actualSecondAnswerText);
        System.out.println(actualSecondAnswerText);
    }

    @Test
    public void thirdQuestion() {
        driver = new ChromeDriver();
        pages.FaqPage objectStartPage = new pages.FaqPage(driver);
        pages.FaqPage objectFaqPage = new FaqPage(driver);
        objectFaqPage.FAQ_PAGE_URL();
        objectFaqPage.clickCookieButton();
        objectFaqPage.clickThirdQuestion();
        String actualThirdAnswerText = objectStartPage.getThirdAnswerText();
        assertEquals(expectedThirdAnswerText, actualThirdAnswerText);
        System.out.println(actualThirdAnswerText);
    }

    @Test
    public void fourthQuestion() {
        driver = new ChromeDriver();
        pages.FaqPage objectFaqPage = new FaqPage(driver);
        objectFaqPage.FAQ_PAGE_URL();
        objectFaqPage.clickCookieButton();
        objectFaqPage.clickFourthQuestion();
        String actualFourthAnswerText = objectFaqPage.getFourthAnswerText();
        assertEquals(expectedFourthAnswerText, actualFourthAnswerText);
        System.out.println(actualFourthAnswerText);
    }

    @Test
    public void fifthQuestion() {
        driver = new ChromeDriver();
        pages.FaqPage objectFaqPage = new FaqPage(driver);
        objectFaqPage.FAQ_PAGE_URL();
        objectFaqPage.clickCookieButton();
        objectFaqPage.clickFifthQuestion();
        String actualFifthAnswerText = objectFaqPage.getFifthAnswerText();
        assertEquals(expectedFifthAnswerText, actualFifthAnswerText);
        System.out.println(actualFifthAnswerText);
    }

    @Test
    public void sixthQuestion() {
        driver = new ChromeDriver();
        pages.FaqPage objectFaqPage = new FaqPage(driver);
        objectFaqPage.FAQ_PAGE_URL();
        objectFaqPage.clickCookieButton();
        objectFaqPage.clickSixthQuestion();
        String actualSixthAnswerText = objectFaqPage.getSixthAnswerText();
        assertEquals(expectedSixthAnswerText, actualSixthAnswerText);
        System.out.println(actualSixthAnswerText);
    }

    @Test
    public void seventhQuestion() {
        driver = new ChromeDriver();
        pages.FaqPage objectFaqPage = new FaqPage(driver);
        objectFaqPage.FAQ_PAGE_URL();
        objectFaqPage.clickCookieButton();
        objectFaqPage.clickSeventhQuestion();
        String actualSeventhAnswerText = objectFaqPage.getSeventhAnswerText();
        assertEquals(expectedSeventhAnswerText, actualSeventhAnswerText);
        System.out.println(actualSeventhAnswerText);
    }

    @Test
    public void eighthQuestion() {
        driver = new ChromeDriver();
        pages.FaqPage objectFaqPage = new FaqPage(driver);
        objectFaqPage.FAQ_PAGE_URL();
        objectFaqPage.clickCookieButton();
        objectFaqPage.clickEighthQuestion();
        String actualEighthAnswerText = objectFaqPage.getEighthAnswerText();
        assertEquals(expectedEighthAnswerText, actualEighthAnswerText);
        System.out.println(actualEighthAnswerText);
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
