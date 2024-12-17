package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElementMethods {

    public WebDriver driver=null;

    @Test
    public void webDriverMethods(){

        driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

//        WebElement userName=driver.findElement(By.name("email"));
//        int un_y=userName.getLocation().getX();
//        System.out.println("y-cordinate of Username"+un_y);
//
//        WebElement passWord=driver.findElement(By.name("pass"));
//        int pw_y=passWord.getLocation().getX();
//        System.out.println("y-cordinate of Password"+pw_y);

        driver.findElement(By.name("email")).sendKeys("mohan@gmail.com");

        driver.findElement(By.name("pass")).sendKeys("mohan");

//        driver.findElement(By.name("login")).click();


    }
}
