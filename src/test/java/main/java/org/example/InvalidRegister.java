package main.java.org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidRegister {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "W:\\Automation testing\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sinsay.com/ro/ro/customer/account/login/#login");
        WebElement searchButton = driver.findElement(By.id("cookiebotDialogOkButton"));
        searchButton.click();
        driver.findElement(By.xpath("//*[@data-selen='register-select']")).click();
        driver.findElement(By.name("email")).sendKeys("testtest.com");

        driver.findElement(By.xpath("//*[@data-selen='firstname']")).click();
        driver.findElement(By.name("firstname")).sendKeys("a12");

        driver.findElement(By.xpath("//*[@data-selen='lastname']")).click();
        driver.findElement(By.name("lastname")).sendKeys("a12");

        driver.findElement(By.xpath("//*[@data-selen='register-password']")).click();
        driver.findElement(By.name("password")).sendKeys("1");

        driver.findElement(By.xpath("//*[@data-selen='create-account-submit']")).click();
    }
}
