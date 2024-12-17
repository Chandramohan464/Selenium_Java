package com.pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopup {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.findElement(By.xpath("//input[starts-with(@class,'ng-tns-c58')]")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("9")).click();
        Thread.sleep(2000);

        driver.quit();
    }
}
