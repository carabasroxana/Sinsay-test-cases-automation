package main.java.org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class OrdersView {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "W:\\Automation testing\\chromedriver-win64\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.get("https://www.sinsay.com/ro/ro");
        WebElement searchButton = driver.findElement(By.id("cookiebotDialogOkButton"));
        searchButton.click();
        driver.manage().window().maximize();

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

        WebElement personName = driver.findElement(By.xpath("//button[@data-testid='account-info-logged-true']"));
        Actions actionPersonName = new Actions(driver);
        actionPersonName.moveToElement(personName).perform();

        WebElement hoverPersonName = driver.findElement(
                By.xpath("//a[@data-testid='order-history]"));
        actionCont.click(hoverPersonName).perform();










    }
    }
