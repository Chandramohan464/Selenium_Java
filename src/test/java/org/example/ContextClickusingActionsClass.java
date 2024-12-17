package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ContextClickusingActionsClass {

    public static void main(String[] args) throws InterruptedException, AWTException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement link=driver.findElement(By.xpath("//a[@href='/about/']"));
        int x=link.getLocation().getX();
        int y=link.getLocation().getY();
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+x+","+y+")");
        Thread.sleep(2000);
        Actions action=new Actions(driver);
        action.contextClick(link).perform();
        Thread.sleep(1000);
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_W);
        robot.keyRelease(KeyEvent.VK_W);
        Thread.sleep(2000);
        driver.quit();
    }
}
