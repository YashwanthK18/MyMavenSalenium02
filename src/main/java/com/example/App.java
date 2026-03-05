package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

    public static void main(String[] args) {

        // Launch Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Open Login Page
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Maximize window
        driver.manage().window().maximize();

        // Enter Username
        driver.findElement(By.id("username")).sendKeys("student");

        // Enter Password
        driver.findElement(By.id("password")).sendKeys("Password123");

        // Click Login Button
        driver.findElement(By.id("submit")).click();

        // Optional: Wait 5 seconds to see result
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close browser
        driver.quit();
    }
}
