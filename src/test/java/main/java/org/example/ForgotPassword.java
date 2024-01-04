package main.java.org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ForgotPassword {
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

        driver.findElement(By.xpath("//button[@data-selen='forgot-password']")).click();
        driver.findElement(By.id("email_id")).click();
        driver.findElement(By.id("email_id")).sendKeys("t760389@gmail.com");
        driver.findElement(By.xpath("/html/body/div[9]/div/div[2]/form/button")).click();
    }
}
