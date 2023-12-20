package main.java.org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "W:\\Automation testing\\chromedriver-win64\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.get("https://www.sinsay.com/ro/ro");
        WebElement searchButton = driver.findElement(By.id("cookiebotDialogOkButton"));
        searchButton.click();
        driver.manage().window().maximize();









    }
    }
