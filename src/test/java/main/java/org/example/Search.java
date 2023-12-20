package main.java.org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "W:\\Automation testing\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sinsay.com/ro/ro/");

        WebElement searchButton = driver.findElement(By.id("cookiebotDialogOkButton"));
        searchButton.click();

        driver.findElement(By.xpath("//*[@data-form-control='search']")).click();
        WebElement parentDiv = driver.findElement(By.xpath("//*[@data-testid='search-input']"));
        WebElement childInput = parentDiv.findElement(By.tagName("input"));
        childInput.sendKeys("ceas");
        driver.findElement(By.name("Căutare 'ceas'")).click();
    }
}
