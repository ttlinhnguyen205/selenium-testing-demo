import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class SauceDemoTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        // Đường dẫn Google Chrome trong Codespaces
        options.setBinary("/usr/bin/google-chrome");

        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--window-size=1920,1080");

        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void TC01_loginSuccessfully() {

        login();

        assertTrue(driver.getCurrentUrl().contains("inventory.html"));
    }

    @Test
    public void TC02_checkProductDisplayed() {

        login();

        WebElement product =
                driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));

        assertTrue(product.isDisplayed());
    }

    @Test
    public void TC03_addProductToCart() {

        login();

        driver.findElement(
                By.id("add-to-cart-sauce-labs-backpack"))
                .click();

        WebElement cartBadge =
                driver.findElement(By.className("shopping_cart_badge"));

        assertEquals("1", cartBadge.getText());
    }
    @Test
    public void TC04_loginFailedWithWrongPassword() {

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("wrong_password");

        driver.findElement(By.id("login-button"))
                .click();

        WebElement errorMessage =
                driver.findElement(By.cssSelector("[data-test='error']"));

        assertTrue(errorMessage.isDisplayed());
    }

    @Test
    public void TC05_sortProductByPriceLowToHigh() {

        login();

        WebElement sortDropdown =
                driver.findElement(By.className("product_sort_container"));

        sortDropdown.click();

        sortDropdown.findElement(By.cssSelector("option[value='lohi']")).click();

        WebElement firstPrice =
                driver.findElement(By.className("inventory_item_price"));

        assertEquals("$7.99", firstPrice.getText());
    }

    @Test
    public void TC06_logoutSuccessfully() {

        login();

        driver.findElement(By.id("react-burger-menu-btn")).click();

        driver.findElement(By.id("logout_sidebar_link")).click();

        WebElement loginButton =
                driver.findElement(By.id("login-button"));

        assertTrue(loginButton.isDisplayed());
    }
    @Test
        public void TC07_removeProductFromCart() {

        login();

        driver.findElement(
                By.id("add-to-cart-sauce-labs-backpack"))
                .click();

        driver.findElement(
                By.id("remove-sauce-labs-backpack"))
                .click();

        boolean badgeExists =
                driver.findElements(
                        By.className("shopping_cart_badge"))
                        .size() > 0;

        assertFalse(badgeExists);
        }
        @Test
        public void TC08_verifyCartContents() {

        login();

        driver.findElement(
                By.id("add-to-cart-sauce-labs-backpack"))
                .click();

        driver.findElement(
                By.className("shopping_cart_link"))
                .click();

        WebElement product =
                driver.findElement(
                        By.className("inventory_item_name"));

        assertEquals(
                "Sauce Labs Backpack",
                product.getText());
        }
        @Test
        public void TC09_openProductDetailsPage() {

        login();

        driver.findElement(
                By.xpath("//div[text()='Sauce Labs Backpack']"))
                .click();

        WebElement title =
                driver.findElement(
                        By.className("inventory_details_name"));

        assertEquals(
                "Sauce Labs Backpack",
                title.getText());
        }

    private void login() {

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();
    }

    @AfterEach
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}