package com.pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
        Thread.sleep(2000);

        Alert alert=driver.switchTo().alert();
        System.out.println("Text of pop up: "+alert.getText());

        alert.accept();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
        Thread.sleep(2000);
        alert.dismiss();
    }
}
