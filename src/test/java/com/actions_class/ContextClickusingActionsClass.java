package com.actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ContextClickusingActionsClass {

    public static void main(String[] args) throws AWTException, InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        String homeXPath="//a[@class='home-link']";
        WebElement home=driver.findElement(By.xpath(homeXPath));
        Actions actions=new Actions(driver);
        actions.moveToElement(home).perform();
        Thread.sleep(1000);
        actions.contextClick(home).perform();
        Thread.sleep(1000);
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_W);
        robot.keyRelease(KeyEvent.VK_W);
        Thread.sleep(1000);
        driver.quit();
    }
}