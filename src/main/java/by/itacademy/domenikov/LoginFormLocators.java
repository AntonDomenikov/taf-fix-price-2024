package by.itacademy.domenikov;

public class LoginFormLocators {
    final static String LOGIN_BUTTON_XPATH = "//span[@class='title' and @data-v-6a0a060d and text()='Войти']";
    final static String LOGIN_FORM_HEADER_TEXT_CSS_LOCATOR = "h1.form-title[data-v-1e57b9c8]";
    final static String LOGIN_FORM_EMAIL_SELECT_CSS_SELECTOR = "button.button.toggle.small[data-test='button'][data-v-6face323]:nth-child(2)";
    final static String LOGIN_FORM_EMAIL_FIELD_CSS_SELECTOR = "input.input-text[type='email'][data-v-50f9c07e]";
    final static String LOGIN_FORM_PASSWORD_FIELD_CSS_SELECTOR = "input.input-text[type='password'][data-v-50f9c07e]";
    final static String LOGIN_FORM_AGREE_CHECKBOX_CSS_SELECTOR = "div.checkbox-field[data-v-9ba0b238]";
    final static String LOGIN_FORM_SUBMIT_BUTTON_CSS_SELECTOR = "button.button.enter-button.normal[data-test='enter'][data-v-6face323][data-v-1e57b9c8][data-v-dfa3b924]";
    final static String LOGIN_FORM_WRONG_LOGIN_PASS_MESSAGE_CSS_SELECTOR = "div.error[data-v-1e57b9c8]";
    final static String LOGIN_FORM_CLOSE_FORM_BUTTON_CSS_SELECTOR = "i.close[data-v-1e57b9c8][data-test='close']";
}