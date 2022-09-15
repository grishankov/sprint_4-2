import pageObject.OrderPageObject;

public class Order{
    public static void Zakaz(String nameEnter, String surnameEnter, String addressEnter, String phoneEnter, String dateEnter, String commentEnter) {
        OrderPageObject.setOrderPageUrl();
        OrderPageObject.setButtonCookie();
        OrderPageObject.setButtonOrderUp();
        OrderPageObject.setName(nameEnter);
        OrderPageObject.setSurname(surnameEnter);
        OrderPageObject.setAddress(addressEnter);
        OrderPageObject.setMetro();
        OrderPageObject.setMetro2();
        OrderPageObject.setPhone(phoneEnter);
        OrderPageObject.setButtonThen();
        OrderPageObject.setDate(dateEnter);
        OrderPageObject.setAboutRent();
        OrderPageObject.setRentalPeriod();
        OrderPageObject.setDay();
        OrderPageObject.setScooterColor();
        OrderPageObject.setComment(commentEnter);
        OrderPageObject.setButtonOrderRent();
        OrderPageObject.setButtonYes();
        OrderPageObject.setButtonOrderStatus();
        OrderPageObject.setOrderNumber();
        OrderPageObject.setButtonGO();
    }
}
