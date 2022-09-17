package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FaqPageObject {
    private final WebDriver driver;

    public FaqPageObject(WebDriver driver) {
        this.driver = driver;
    }
    private static final String FAQ_PAGE_URL = "https://qa-scooter.praktikum-services.ru";
    private final By cookieButtonFaq = By.id("rcc-confirm-button");
    private final By firstQuestion = By.id("accordion__heading-0");
    private final By firstAnswerText = By.xpath(".//div[@id='accordion__panel-0']/p");
    private final By secondQuestion = By.id("accordion__heading-1");
    private final By secondAnswerText = By.xpath(".//div[@id='accordion__panel-1']/p");
    private final By thirdQuestion = By.id("accordion__heading-2");
    private final By thirdAnswerText = By.xpath(".//div[@id='accordion__panel-2']/p");
    private final By fourthQuestion = By.id("accordion__heading-3");
    private final By fourthAnswerText = By.xpath(".//div[@id='accordion__panel-3']/p");
    private final By fifthQuestion = By.id("accordion__heading-4");
    private final By fifthAnswerText = By.xpath(".//div[@id='accordion__panel-4']/p");
    private final By sixthQuestion = By.id("accordion__heading-5");
    private final By sixthAnswerText = By.xpath(".//div[@id='accordion__panel-5']/p");
    private final By seventhQuestion = By.id("accordion__heading-6");
    private final By seventhAnswerText = By.xpath(".//div[@id='accordion__panel-6']/p");
    private final By eighthQuestion = By.id("accordion__heading-7");
    private final By eighthAnswerText = By.xpath(".//div[@id='accordion__panel-7']/p");


    public void getFaqPageUrl() {
        driver.get(FAQ_PAGE_URL);
    }

    public void clickCookieButtonFaq() {
        driver.findElement(cookieButtonFaq).click();
    }

    public void clickFirstQuestion() {
        driver.findElement(firstQuestion).click();
    }

    public String getFirstAnswerText() {
        return driver.findElement(firstAnswerText).getText();
    }

    public void clickSecondQuestion() {
        driver.findElement(secondQuestion).click();
    }

    public String getSecondAnswerText() {
        return driver.findElement(secondAnswerText).getText();
    }

    public void clickThirdQuestion() {
        driver.findElement(thirdQuestion).click();
    }

    public String getThirdAnswerText() {
        return driver.findElement(thirdAnswerText).getText();
    }

    public void clickFourthQuestion() {
        driver.findElement(fourthQuestion).click();
    }

    public String getFourthAnswerText() {
        return driver.findElement(fourthAnswerText).getText();
    }

    public void clickFifthQuestion() {
        driver.findElement(fifthQuestion).click();
    }

    public String getFifthAnswerText() {
        return driver.findElement(fifthAnswerText).getText();
    }

    public void clickSixthQuestion() {
        driver.findElement(sixthQuestion).click();
    }

    public String getSixthAnswerText() {
        return driver.findElement(sixthAnswerText).getText();
    }

    public void clickSeventhQuestion() {
        driver.findElement(seventhQuestion).click();
    }

    public String getSeventhAnswerText() {
        return driver.findElement(seventhAnswerText).getText();
    }

    public void clickEighthQuestion() {
        driver.findElement(eighthQuestion).click();
    }

    public String getEighthAnswerText() {
        return driver.findElement(eighthAnswerText).getText();
    }

}