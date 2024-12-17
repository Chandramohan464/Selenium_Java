package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpandDown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();
        JavascriptExecutor js= (JavascriptExecutor) driver;
        for (int i = 1; i < 3; i++) {
            js.executeScript("window.scrollBy(0,1000)");
            Thread.sleep(2000);
        }
        for (int i = 1; i < 3; i++) {
            js.executeScript("window.scrollBy(0,-1000)");
            Thread.sleep(2000);
        }
    }
}
