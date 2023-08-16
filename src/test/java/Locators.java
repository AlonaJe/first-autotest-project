import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {


    //Booking.com
    private final By HEADER_LOGO = By.tagName("header-logo");
    private final By CURRENCY = By.xpath(".//*[span(@class, 'e57ffa4eb5']");
    private final By NOTIFICATION = By.xpath(".//*[div(@class = 'fc63351294 a822bdf511 e3c025e003 cfb238afa1 c334e6f658 e634344169']");
    private final By LOYALTY_lVL = By.xpath(".//*[span@class = 'd8eab2cf7f a2552429ab']");
    private final By AIRPORT_TAXIS = By.id("airport_taxis");
    private final By HEADING = By.xpath(" .//*[span@class = 'fa27fe07b6 c0ec8bd590 e0ff951c3e']");
    private final By DATES_CONTAINER = By.xpath(".//*[div@class = 'dec3155a06']");
    private final By SEARCH_BTN = By.xpath(".//*[div@class = 'e57ffa4eb5')]");
    private final By TRAVELING_FOR_WORK = By.xpath(".//*[div@class = 'db29ecfbe2 f0d4d6a2f5']");
    private final By COVID_19_INFO = By.xpath(".//*[div@class = 'f9afbb0024']");
    private final By YOUR_RECENT_SEARCHES_HEADING = By.xpath(".//*[span@class = 'bui-title__text']");

    //Google.com
    private final By GOOGLE_SEARCH = By.xpath(".//*[div@class = 'RNNXgb']");
    private final By SETTINGS = By.xpath(".//*[span@class = 'z1asCe E9hVAb']");
    private final By GOOGLE_ACCOUNT = By.xpath(".//*[div@class = 'gb_e gb_7a gb_7f gb_v']");
    private final By SEARCH_TYPE_MORE = By.xpath(".//*[div@class = 'LgbsSe']");
    private final By SEARCH_TYPE_TOOLS = By.id("hdtb-tls");
    private final By RESULTS_STATS = By.id("result-stats");
    private final By SEARCH_RESULT_ITEM_MORE = By.xpath(" .//*[span@class = 'Bil8Ae']");
    private final By INFO_BOX = By.xpath(".//*[div@class = 'OTFaAf']");

    //Amazon.de
    private final By AMAZON_LOGO = By.id("nav-logo-sprites");
    private final By AMAZON_SEARCH = By.id("nav-search-bar-form");
    private final By ACCOUNT_LISTS = By.id("nav-link-accountList");
    private final By SHOPPING_BASKET = By.id("nav-cart");
    private final By HAMBURGER_MENU_ALL = By.id("nav-hamburger-menu");
    private final By NEXT_SLIDE = By.xpath("//*[span@class = 'Next slide']");
    private final By TOP_DEALS = By.id("CardInstanceg8SR91pYTXbXA9YmcpeIrw");

    //1a.lv
    private final By SITE_TOP_MENU_LINK = By.xpath(".//*[a@class = 'Piedāvājums biznesam']");
    private final By PICKUP_POINTS = By.xpath(".//*[a@class = 'site-top__menu-right-link']");
    private final By LANGUAGE_SWITCHER = By.xpath(".//*[li@class = 'site-top__menu-right-item language-switcher']");
    private final By ONEA_LV_MAIN_LOGO = By.xpath(".//*[a@class = 'main-logo']");
    private final By MAIN_SEARCH_SUBMIT_BTN = By.xpath(".//*[div@class = 'main-search__submit']");
    private final By CART_BLOCK = By.xpath(".//*[div@class = 'cart-block']");
    private final By SMART_NET_BANNER_LOGO = By.xpath(" .//*[img@class = 'smart-net-banner__logo']");
    private final By SMART_NET_BANNER_IMAGE_GIFT = By.xpath(".//*[img@class = 'smart-net-banner__image']");
    private final By HAMBURGER_MENU = By.xpath(".//*[i@class = 'main-menu__handle-icon icon-svg']");


    @Test
    public void FindLocators() {
        WebDriver browser = new ChromeDriver();
        browser.get("booking.com");


    }
}
