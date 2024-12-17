package com.actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String src="//div[@id='draggable']";
        WebElement srcBlock=driver.findElement(By.xpath(src));
        String target="//div[@id='droppable']";
        WebElement targetBlock=driver.findElement(By.xpath(target));
        Actions action=new Actions(driver);
        action.moveToElement(srcBlock).perform();
        Thread.sleep(2000);
        action.dragAndDrop(srcBlock,targetBlock).perform();
    }
}
