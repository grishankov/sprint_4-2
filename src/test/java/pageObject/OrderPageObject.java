package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



public class OrderPageObject{
    private static final String ORDER_PAGE_URL = "https://qa-scooter.praktikum-services.ru/order";
    private static WebDriver driver;
    private final static By buttonCookie = By.id("rcc-confirm-button");
    private final static By buttonOrderUp = By.xpath(".//button[@class='Button_Button__ra12g']");
    private final static By buttonOrderDown = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private final static By name = By.xpath("//input[@placeholder='* Имя']");
    private final static By surname = By.xpath("//input[@placeholder='* Фамилия']");
    private final static By address = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    private final static By metro = By.xpath("//input[@placeholder='* Станция метро']");
    private final static By metroStation = By.xpath("//*[@class='select-search__select']//*[text() = 'Бульвар Рокоссовского']");
    private final static By phone = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    private final static By buttonThen = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private final static By date = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    private final static By aboutRent = By.xpath("//*[text() = 'Про аренду']");
    private final static By rentalPeriod = By.xpath("//*[@class='Dropdown-control']");
    private final static By day = By.xpath("//*[text() = 'сутки']");
    private final static By scooterColor = By.id("black");
    private final static By comment = By.xpath("//input[@placeholder='Комментарий для курьера']");
    private final static By buttonOrderRent = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private final static By buttonYes = By.xpath("//*[text() = 'Да']");
    private final static By buttonOrderStatus = By.xpath("//button[@class='Header_Link__1TAG7']");
    private final static By orderNumber = By.xpath("//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']");
    private final static By buttonGO = By.xpath(".//button[@class='Button_Button__ra12g Header_Button__28dPO']");

    public static void setOrderPageUrl() {
        driver.get(ORDER_PAGE_URL);
    }
    public static void setButtonCookie() {
        driver.findElement(buttonCookie).click();
    }

    public static void setButtonOrderUp() {
        driver.findElement(buttonOrderUp).click();
    }

    public void setButtonOrderDown() {
        driver.findElement(buttonOrderDown).click();
    }

    public static void setName(String nameEnter) {
        driver.findElement(name).sendKeys(nameEnter);
    }

    public static void setSurname(String surnameEnter) {
        driver.findElement(surname).sendKeys(surnameEnter);
    }

    public static void setAddress(String addressEnter) {
        driver.findElement(address).sendKeys(addressEnter);
    }

    public static void setMetro() {
        driver.findElement(metro).sendKeys(Keys.ARROW_DOWN);
    }

    public static void setMetro2() {
        driver.findElement(metroStation).click();
    }

    public static void setPhone(String phoneEnter) {
        driver.findElement(phone).sendKeys(phoneEnter);
    }

    public static void setButtonThen() {
        driver.findElement(buttonThen).click();
    }

    public static void setDate(String dateEnter) {
        driver.findElement(date).sendKeys(dateEnter);
    }

    public static void setAboutRent() {
        driver.findElement(aboutRent).click();
    }

    public static void setRentalPeriod() {
        driver.findElement(rentalPeriod).click();
    }

    public static void setDay() {
        driver.findElement(day).click();
    }

    public static void setScooterColor() {
        driver.findElement(scooterColor).click();
    }

    public static void setComment(String commentEnter) {
        driver.findElement(comment).sendKeys(commentEnter);
    }

    public static void setButtonOrderRent() {
        driver.findElement(buttonOrderRent).click();
    }

    public static void setButtonYes() {
        driver.findElement(buttonYes).click();
    }

    public static void setButtonOrderStatus() {
        driver.findElement(buttonOrderStatus).click();
    }

    public static void setOrderNumber() {
        driver.findElement(orderNumber).sendKeys();
    }

    public static void setButtonGO() {
        driver.findElement(buttonGO).click();
    }

    }


