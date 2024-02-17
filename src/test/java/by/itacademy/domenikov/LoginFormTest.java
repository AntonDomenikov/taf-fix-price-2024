package by.itacademy.domenikov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import util.CustomRandomEmailGenerator;
import util.CustomRandomPasswordGenerator;

public class LoginFormTest extends BaseTest {
    @Test
    public void openLoginForm(){
        driver.findElement(By.xpath(LoginFormLocators.LOGIN_BUTTON_XPATH)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(LoginFormLocators.LOGIN_FORM_HEADER_TEXT_CSS_LOCATOR)));
        String actualResult = driver.findElement(By.cssSelector(LoginFormLocators.LOGIN_FORM_HEADER_TEXT_CSS_LOCATOR)).getText();
        Assertions.assertTrue(actualResult.contains("Вход"),"Слово 'Вход' не найдено");
        driver.findElement(By.cssSelector(LoginFormLocators.LOGIN_FORM_CLOSE_FORM_BUTTON_CSS_SELECTOR)).click();
    }
    @Test
    public void warningLoginMessage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoginFormLocators.LOGIN_BUTTON_XPATH))).click();
        //driver.findElement(By.xpath(LoginFormLocators.LOGIN_BUTTON_XPATH)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(LoginFormLocators.LOGIN_FORM_EMAIL_SELECT_CSS_SELECTOR))).click();
        //driver.findElement(By.cssSelector(LoginFormLocators.LOGIN_FORM_EMAIL_SELECT_CSS_SELECTOR)).click();
        driver.findElement(By.cssSelector(LoginFormLocators.LOGIN_FORM_EMAIL_FIELD_CSS_SELECTOR)).sendKeys(CustomRandomEmailGenerator.generateRandomEmail());
        driver.findElement(By.cssSelector(LoginFormLocators.LOGIN_FORM_PASSWORD_FIELD_CSS_SELECTOR)).sendKeys(CustomRandomPasswordGenerator.generateRandomPassword(10));
        driver.findElement(By.cssSelector(LoginFormLocators.LOGIN_FORM_AGREE_CHECKBOX_CSS_SELECTOR)).click();
        driver.findElement(By.cssSelector(LoginFormLocators.LOGIN_FORM_SUBMIT_BUTTON_CSS_SELECTOR)).click();
        String actualResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(LoginFormLocators.LOGIN_FORM_WRONG_LOGIN_PASS_MESSAGE_CSS_SELECTOR))).getText();
        //String actualResult = driver.findElement(By.cssSelector(LoginFormLocators.LOGIN_FORM_WRONG_LOGIN_PASS_MESSAGE_CSS_SELECTOR)).getText();
        System.out.println(actualResult);
        Assertions.assertEquals("Неверный логин или пароль. Проверьте введённые данные и попробуйте снова. Осталось попыток: 4", actualResult);


    }
}