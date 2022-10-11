package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Alert.html");
        driver.manage().window().maximize();
        WebElement alertbox=driver.findElement(By.xpath("//button[text()='Alert Box']"));
        alertbox.click();
        Alert alert=driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();

        WebElement confirmbox=driver.findElement(By.xpath("//button[text()='Confirm Box']"));
        confirmbox.click();
        Alert confirm=driver.switchTo().alert();
        Thread.sleep(3000);
        confirm.dismiss();

        WebElement promptbox=driver.findElement(By.xpath("//button[text()='Prompt Box']"));
        promptbox.click();
        Alert prompt=driver.switchTo().alert();
        prompt.sendKeys("google");
        Thread.sleep(3000);
        prompt.accept();

	// write your code here
    }
}
