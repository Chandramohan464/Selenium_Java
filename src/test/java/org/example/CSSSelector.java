package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CSSSelector {

    WebDriver driver=null;

    @Test
    public void mainCSSSelector(){

        driver=new  ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Chandramohan");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Halemani");
        driver.findElement(By.cssSelector("#day")).sendKeys("31");
        driver.findElement(By.cssSelector("#month")).sendKeys("Oct");
        driver.findElement(By.cssSelector("#year")).sendKeys("2001");
        driver.findElement(By.cssSelector("input[value='2']")).click();
        driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("mohan@gmail.com");
        driver.findElement(By.cssSelector("#password_step_input")).sendKeys("mohan");
    }
}
