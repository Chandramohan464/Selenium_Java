package com.pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.xpath("//button[@id='alertButton']")).click();
        Thread.sleep(2000);

        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);

        System.out.println("Text of alert "+alert.getText());
        alert.accept();
    }
}
