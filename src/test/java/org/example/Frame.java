package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frame {

    WebDriver driver=null;

    @Test
    public void iframe() throws InterruptedException {

        driver=new ChromeDriver();
        driver.get("file:///C:/Users/91886/IdeaProjects/page2.html");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.switchTo().frame(0);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='t1']")).sendKeys("Chandramohan");
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='t2']")).sendKeys("Halemani");
        Thread.sleep(1000);
        driver.close();
    }
}
