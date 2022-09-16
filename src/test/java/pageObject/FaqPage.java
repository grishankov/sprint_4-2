package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FaqPage {
    private WebDriver driver;

    public FaqPage(WebDriver driver) {
        this.driver = driver;
    }
    public final String FAQ_PAGE_URL = "https://qa-scooter.praktikum-services.ru/order";
    private By cookieButton = By.id("rcc-confirm-button");
    private By firstQuestion = By.id("accordion__heading-0");
    private By firstAnswerText = By.xpath(".//div[@id='accordion__panel-0']/p");
    private By secondQuestion = By.id("accordion__heading-1");
    private By secondAnswerText = By.xpath(".//div[@id='accordion__panel-1']/p");
    private By thirdQuestion = By.id("accordion__heading-2");
    private By thirdAnswerText = By.xpath(".//div[@id='accordion__panel-2']/p");
    private By fourthQuestion = By.id("accordion__heading-3");
    private By fourthAnswerText = By.xpath(".//div[@id='accordion__panel-3']/p");
    private By fifthQuestion = By.id("accordion__heading-4");
    private By fifthAnswerText = By.xpath(".//div[@id='accordion__panel-4']/p");
    private By sixthQuestion = By.id("accordion__heading-5");
    private By sixthAnswerText = By.xpath(".//div[@id='accordion__panel-5']/p");
    private By seventhQuestion = By.id("accordion__heading-6");
    private By seventhAnswerText = By.xpath(".//div[@id='accordion__panel-6']/p");
    private By eighthQuestion = By.id("accordion__heading-7");
    private By eighthAnswerText = By.xpath(".//div[@id='accordion__panel-7']/p");
    private By TopButtonOfOrder = By.className("Button_Button__ra12g");
    private By BottomButtonOfOrder = By.cssSelector("#root > div > div > div.Home_ThirdPart__LSTEE > div.Home_RoadMap__2tal_ > div.Home_FinishButton__1_cWm > button");


    public void FAQ_PAGE_URL() {
        driver.get(FAQ_PAGE_URL);
    }

    public void clickCookieButton() {
        driver.findElement(cookieButton).click();
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