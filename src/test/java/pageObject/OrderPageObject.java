package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class OrderPageObject{
    private final String orderPageUrl = "https://qa-scooter.praktikum-services.ru/order";
    private final WebElement fieldName;
    private final WebElement fieldSurname;
    private final WebElement fieldAdress;
    private final WebElement fieldMetro;
    private final WebElement fieldPhoneNumber;
    private final WebDriver driver;

    public OrderPageObject(WebElement fieldName, WebElement fieldSurname, WebElement fieldAdress, WebElement fieldMetro, WebElement fieldPhoneNumber, WebDriver driver) {
        this.fieldName = fieldName;
        this.fieldSurname = fieldSurname;
        this.fieldAdress = fieldAdress;
        this.fieldMetro = fieldMetro;
        this.fieldPhoneNumber = fieldPhoneNumber;
        this.driver = driver;
    }

}
