package main.java.org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class InvalidDiscount {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "W:\\Automation testing\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sinsay.com/ro/ro/");
        driver.manage().window().maximize();

        WebElement searchButton = driver.findElement(By.id("cookiebotDialogOkButton"));
        searchButton.click();

        WebElement mainList = driver.findElement(
                By.xpath("//ul[@data-testid = 'category-list']/li[@data-testid='category-link']/a[text()='Femei']"));

        Actions action = new Actions(driver);
        action.moveToElement(mainList).perform();

        driver.findElement(
                By.xpath("//*[@id='navigation-wrapper']/div/ul/li[3]/ul/li[1]/ul/li[8]/a[text()='Rochii']")).click();

        driver.findElement(By.linkText("Rochie mini")).click();
        driver.findElement(By.xpath("//html/body/div[8]/div/button/span")).click();

        WebElement sizeXS = driver.findElement(By.xpath("//li[text()='XS']"));
        sizeXS.click();

        WebElement section = driver.findElement(By.cssSelector("section[data-selen='add-to-cart']"));
        WebElement addToCartButton = section.findElement(By.cssSelector("button[data-selen='add-to-cart-button']"));
        addToCartButton.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(
                By.cssSelector("button[data-selen='cart-confirmation-close']")).click();

        driver.findElement(By.xpath("//*[@id=\"headerWrapper\"]/div/div[3]/button[2]")).click();
        WebElement discountButton = driver.findElement(By.xpath("//*[@id=\"couponCode\"]"));
        discountButton.click();
        discountButton.sendKeys("Minus70");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"cartRoot\"]/div/div[2]/div[1]/div[2]/form/button")).click();
    }
}
