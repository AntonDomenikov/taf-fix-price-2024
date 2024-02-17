package by.itacademy.domenikov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class HomePageTest extends BaseTest {
    @Test
    public void openHomePage() {

        ((JavascriptExecutor) driver).executeScript("scroll(0,10000)");
        String actualResult = driver.findElement(By.cssSelector(
                        HomePageLocators.COPY_RIGHT_CSS_SELECTOR))
                .getText();
        System.out.println(actualResult);
        String expectedResult = "© Fix Price, 2024\n" +
                "Все права защищены";
        Assertions.assertEquals(expectedResult,actualResult);

    }
}
