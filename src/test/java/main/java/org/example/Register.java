package main.java.org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "W:\\Automation testing\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sinsay.com/ro/ro/customer/account/login/#login");
        driver.manage().window().maximize();

        WebElement searchButton = driver.findElement(By.id("cookiebotDialogOkButton"));
        searchButton.click();
        driver.findElement(By.xpath("//*[@data-selen='register-select']")).click();
        driver.findElement(By.name("email")).sendKeys("t760389@mor.com");

        driver.findElement(By.xpath("//*[@data-selen='firstname']")).click();
        driver.findElement(By.name("firstname")).sendKeys("a");

        driver.findElement(By.xpath("//*[@data-selen='lastname']")).click();
        driver.findElement(By.name("lastname")).sendKeys("a");

        driver.findElement(By.xpath("//*[@data-selen='register-password']")).click();
        driver.findElement(By.name("password")).sendKeys("123456");

        driver.findElement(By.xpath("//*[@data-selen='create-account-submit']")).click();
    }
}
