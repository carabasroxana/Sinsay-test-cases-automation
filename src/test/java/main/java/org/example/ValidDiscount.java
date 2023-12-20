package main.java.org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ValidDiscount {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "W:\\Automation testing\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sinsay.com/ro/ro/");
        driver.manage().window().maximize();

        WebElement searchButton = driver.findElement(By.id("cookiebotDialogOkButton"));
        searchButton.click();

        WebElement cont = driver.findElement(By.xpath("//button[@data-testid='account-info-logged-false']"));
        Actions actionCont = new Actions(driver);
        actionCont.moveToElement(cont).perform();

        WebElement hoverCont = driver.findElement(
                By.xpath("//a[@data-testid='login']"));
        actionCont.click(hoverCont).perform();

        driver.findElement(By.xpath("//*[@data-selen='login-email']")).click();
        driver.findElement(By.name("login[username]")).sendKeys(" t760389@gmail.com");
        driver.findElement(By.xpath("//*[@data-selen='login-password']")).click();
        driver.findElement(By.name("login[password]")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@data-selen='login-submit']")).click();

        WebElement mainList = driver.findElement(
                By.xpath("//ul[@data-testid = 'category-list']/li[@data-testid='category-link']/a[text()='Femei']"));

        Actions action = new Actions(driver);
        action.moveToElement(mainList).perform();
        WebElement hoverList = driver.findElement(
                By.xpath("//li[@data-testid='subcategory-link']/a[text()='Rochii']"));
        action.click(hoverList).perform();

        driver.findElement(By.linkText("Rochie mini cu șnur decorativ")).click();
        WebElement size = driver.findElement(By.xpath("//li[text()='XXS']"));
        size.click();

        WebElement section = driver.findElement(By.cssSelector("section[data-selen='add-to-cart']"));
        WebElement addToCartButton = section.findElement(By.cssSelector("button[data-selen='add-to-cart-button']"));
        addToCartButton.click();
    }
}
