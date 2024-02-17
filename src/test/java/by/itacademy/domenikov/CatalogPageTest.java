package by.itacademy.domenikov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class CatalogPageTest extends BaseTest {
    @Test
    public void favoriteProduct() {
        driver.findElement(By.cssSelector(HomePageLocators.TOWN_SELECT_MODAL_YES_BUTTON_CSS_SELECTOR)).click();
        driver.findElement(By.cssSelector(HomePageLocators.REJECT_COOKIE_NOTICE_BUTTON_CSS_SELECTOR)).click();
        driver.findElement(By.cssSelector(CatalogPageLocators.CATALOG_TAB_CSS_SELECTOR)).click();
        driver.findElement(By.cssSelector(CatalogPageLocators.CATALOG_FIRST_CATEGORY_CSS_SELECTOR)).click();
        driver.findElement(By.xpath(CatalogPageLocators.CATALOG_FIRST_PRODUCT_XPATH)).click();
        String expectedResult = driver.findElement(By.cssSelector(CatalogPageLocators.CATALOG_PRODUCT_HEADER_TEXT_CSS_SELECTOR)).getText();
        driver.findElement(By.cssSelector(CatalogPageLocators.CATALOG_NO_ACTIVE_FAVORITES_BUTTON_CSS_SELECTOR)).click();
        driver.findElement(By.cssSelector(CatalogPageLocators.CATALOG_MAIN_FAVORITES_BUTTON_CSS_SELECTOR)).click();
        driver.findElement(By.xpath(CatalogPageLocators.FAVORITES_FIRST_PRODUCT_CARD_XPATH)).click();
        String actualResult = driver.findElement(By.cssSelector(CatalogPageLocators.CATALOG_PRODUCT_HEADER_TEXT_CSS_SELECTOR)).getText();
        Assertions.assertEquals(expectedResult, actualResult);
        System.out.println("Ожидаемый результат" + expectedResult + "  " + "Актуальный результат: " + actualResult);
    }
}
