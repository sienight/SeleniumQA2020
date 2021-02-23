package com.company.lesson7;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        System.out.println("Start test");
        webDriver.get("C:\\Users\\Student\\IdeaProjects\\QA2020\\src\\main\\resources\\windows.html");

        WebElement iframe = null;
        try {
            webDriver.findElement(By.cssSelector("#iframe > iframe"));
        }catch (NotFoundException e){
            System.out.println("GG WP");
        }

        webDriver.switchTo().frame(iframe);


        System.out.println("End test");
    }
}
