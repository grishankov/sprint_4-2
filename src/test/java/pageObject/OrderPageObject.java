package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrderPageObject{
    private final String ORDER_PAGE_URL = "https://qa-scooter.praktikum-services.ru/order";
    private static WebDriver driver;
    private final By buttonCookie = By.id("rcc-confirm-button");
    private final By buttonOrderUp = By.xpath(".//button[@class='Button_Button__ra12g']");
    private final By buttonOrderDown = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
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

    public OrderPageObject(WebDriver driver) {
    }

    public void OrderPageUrl() {
        driver.get(ORDER_PAGE_URL);
    }
    public void ButtonCookie() {
        driver.findElement(buttonCookie).click();
    }

    public void ButtonOrderUp() {
        driver.findElement(buttonOrderUp).click();
    }

    public void ButtonOrderDown() {
        driver.findElement(buttonOrderDown).click();
    }

    public void Name(String nameEnter) {
        driver.findElement(name).sendKeys(nameEnter);
    }

    public void Surname(String surnameEnter) {
        driver.findElement(surname).sendKeys(surnameEnter);
    }

    public void Address(String addressEnter) {
        driver.findElement(address).sendKeys(addressEnter);
    }

    public void Metro() {
        driver.findElement(metro).sendKeys(Keys.ARROW_DOWN);
    }

    public void Metro2() {
        driver.findElement(metroStation).click();
    }

    public void Phone(String phoneEnter) {
        driver.findElement(phone).sendKeys(phoneEnter);
    }

    public void ButtonThen() {
        driver.findElement(buttonThen).click();
    }

    public void Date(String dateEnter) {
        driver.findElement(date).sendKeys(dateEnter);
    }

    public void AboutRent() {
        driver.findElement(aboutRent).click();
    }

    public void RentalPeriod() {
        driver.findElement(rentalPeriod).click();
    }

    public void Day() {
        driver.findElement(day).click();
    }

    public void ScooterColor() {
        driver.findElement(scooterColor).click();
    }

    public void Comment(String commentEnter) {
        driver.findElement(comment).sendKeys(commentEnter);
    }

    public void ButtonOrderRent() {
        driver.findElement(buttonOrderRent).click();
    }

    public void ButtonYes() {
        driver.findElement(buttonYes).click();
    }

    public void ButtonOrderStatus() {
        driver.findElement(buttonOrderStatus).click();
    }

    public void OrderNumber() {
        driver.findElement(orderNumber).sendKeys();
    }

    public void ButtonGO() {
        driver.findElement(buttonGO).click();
    }

    }


