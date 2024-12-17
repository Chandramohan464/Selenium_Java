package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FaceBookAccount {

    public WebDriver driver=null;

    @Test
    public void loginPage(){

        driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys("mohan@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("mohan");
        driver.findElement(By.name("login")).click();
    }

    @Test
    public void sigUpPage(){

        driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("Chandramohan");
        driver.findElement(By.name("lastname")).sendKeys("Halemani");
        driver.findElement(By.name("birthday_day")).sendKeys("31");
        driver.findElement(By.name("birthday_month")).sendKeys("Oct");
        driver.findElement(By.name("birthday_year")).sendKeys("2001");
        driver.findElement(By.cssSelector("input[value='2']")).click();
        driver.findElement(By.name("reg_email__")).sendKeys("mohan@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("mohan");
    }
}
