package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class FaqPageObject {
    private WebDriver driver;
    private String expected;
    public final WebElement questionText By.xpath("//*[text()");

    public FaqPageObject(WebDriver driver) {
        this.driver = driver;
    }

}
    public void FaqTest(String questionText, String expected) {
        this.questionText = questionText;
        this.expected = expected;

    Faq objHomePage = new Faq(driver);
        objHomePage.waitForLoadHomePage();
    driver.findElement(By.xpath("//*[text()='" + questionText + "']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);
        driver.findElement(By.xpath("//*[text()='" + questionText + "']")).click();
        objHomePage.waitForLoadQuestionText(expected);
    String actual = objHomePage.getQuestionText(expected);
    assertEquals(expected, actual);
}


    }
