package main.java.org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Loggout {
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

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement contTrue = driver.findElement(By.xpath("//button[@data-testid='account-info-logged-true']"));

        Actions actionContTrue = new Actions(driver);
        actionContTrue.moveToElement(contTrue).perform();

        WebElement hoverLoggout = driver.findElement(By.xpath("//*[@id=\"headerWrapper\"]/div/div[3]/button[1]"));
        actionContTrue.click(hoverLoggout).perform();

        driver.findElement(By.xpath("//*[@id=\"customerAccount\"]/div/div[1]/ul/li/ul/li[6]/a")).click();

    }
}
