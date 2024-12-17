package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XPath {

    WebDriver driver=null;

    @Test
    public void mainXPath() throws InterruptedException {

        driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mohan@gmail.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("mohan");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5_')]")).click();
    }
}
