package by.itacademy.domenikov;

public class CatalogPageLocators {
    final static String CATALOG_TAB_CSS_SELECTOR = "span.link-text[data-v-97de9da2]";
    final static String CATALOG_FIRST_CATEGORY_CSS_SELECTOR = "div.category-tree > :nth-child(1)";
    final static String CATALOG_FIRST_PRODUCT_XPATH = "//main/div/div[1]/div[2]/div[1]/div/div[3]/div[1]/div/a[contains(@href, '')]";
    final static String CATALOG_PRODUCT_HEADER_TEXT_CSS_SELECTOR = "h1.title[data-v-b325c668]";
    final static String CATALOG_NO_ACTIVE_FAVORITES_BUTTON_CSS_SELECTOR = "button.favorites[data-v-ef4b6508][data-v-b325c668][data-test='button']";
    final static String CATALOG_ACTIVE_FAVORITES_BUTTON_CSS_SELECTOR = "button.favorites.active[data-v-ef4b6508][data-v-b325c668][data-test='button']";
    final static String CATALOG_MAIN_FAVORITES_BUTTON_CSS_SELECTOR = "a.favorite.link[data-v-6a0a060d][href='/favorites']";
    final static String FAVORITES_FIRST_PRODUCT_CARD_XPATH = "//div[2]/div/div[2]/div/div[3]/div/div/a[contains(@href, '')]";
}