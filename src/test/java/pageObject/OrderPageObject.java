package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class OrderPageObject {
    private final WebDriver driver;

    public OrderPageObject(WebDriver driver) {
        this.driver = driver;
    }

    private static final String ORDER_PAGE_URL = "https://qa-scooter.praktikum-services.ru";
    private final By buttonCookieOrder = By.id("rcc-confirm-button");
    private final By buttonOrderUp = By.xpath(".//button[@class='Button_Button__ra12g']"); //кнопка заказать в верху страницы
    private final By buttonOrderDown = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"); //кнопка заказать в середине страницы
    private final By name = By.xpath("//input[@placeholder='* Имя']");
    private final By surname = By.xpath("//input[@placeholder='* Фамилия']");
    private final By address = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    private final By metro = By.xpath("//input[@placeholder='* Станция метро']");
    private final By metroStation = By.xpath("//*[@class='select-search__select']//*[text() = 'Бульвар Рокоссовского']");
    private final By phone = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    private final By buttonThen = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private final By date = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    private final By aboutRent = By.xpath("//*[text() = 'Про аренду']");
    private final By rentalPeriod = By.xpath("//*[@class='Dropdown-control']");
    private final By day = By.xpath("//*[text() = 'сутки']");
    private final By scooterColor = By.id("black");
    private final By comment = By.xpath("//input[@placeholder='Комментарий для курьера']");
    private final By buttonOrderRent = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private final By buttonYes = By.xpath("//*[text() = 'Да']");
    private final By buttonOrderStatus = By.xpath("//button[@class='Header_Link__1TAG7']");
    private final By orderNumber = By.xpath("//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']");
    private final By buttonGO = By.xpath(".//button[@class='Button_Button__ra12g Header_Button__28dPO']");
    private final By orderSuccessCheck = By.xpath("/html/body/div/div/div[2]");

    public void getOrderPageUrl() {
        driver.get(ORDER_PAGE_URL);
    }

    public void clickButtonCookieOrder() {
        driver.findElement(buttonCookieOrder).click();
    }

    public void clickButtonOrderUp() {
        driver.findElement(buttonOrderUp).click();
    }

    public void clickButtonOrderDown() {
        driver.findElement(buttonOrderDown).click();
    }

    public void enterName(String nameEnter) {
        driver.findElement(name).sendKeys(nameEnter);
    }

    public void enterSurname(String surnameEnter) {
        driver.findElement(surname).sendKeys(surnameEnter);
    }

    public void enterAddress(String addressEnter) {
        driver.findElement(address).sendKeys(addressEnter);
    }

    public void clickMetro() {
        driver.findElement(metro).sendKeys(Keys.ARROW_DOWN);
    }

    public void clickMetroSecondStep() {
        driver.findElement(metroStation).click();
    }

    public void enterPhone(String phoneEnter) {
        driver.findElement(phone).sendKeys(phoneEnter);
    }

    public void clickButtonThen() {
        driver.findElement(buttonThen).click();
    }

    public void enterDate(String dateEnter) {
        driver.findElement(date).sendKeys(dateEnter);
    }

    public void clickAboutRent() {
        driver.findElement(aboutRent).click();
    }

    public void setRentalPeriod() {
        driver.findElement(rentalPeriod).click();
    }

    public void setDay() {
        driver.findElement(day).click();
    }

    public void setScooterColor() {
        driver.findElement(scooterColor).click();
    }

    public void enterComment(String commentEnter) {
        driver.findElement(comment).sendKeys(commentEnter);
    }

    public void clickButtonOrderRent() {
        driver.findElement(buttonOrderRent).click();
    }

    public void clickButtonYes() {
        driver.findElement(buttonYes).click();
    }

    public void clickButtonOrderStatus() {
        driver.findElement(buttonOrderStatus).click();
    }

    public void getOrderNumber() {
        driver.findElement(orderNumber).sendKeys();
    }

    public void clickButtonGO() {
        driver.findElement(buttonGO).click();
    }

    public boolean orderSuccessCheck() {
        return driver.findElement(orderSuccessCheck).isDisplayed();
    }
}


