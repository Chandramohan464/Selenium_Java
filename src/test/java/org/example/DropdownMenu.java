package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropdownMenu {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement aboutEle=driver.findElement(By.xpath("//a[@id='navbarDropdown']"));
        Actions action=new Actions(driver);
        action.moveToElement(aboutEle).perform();
        Thread.sleep(2000);
        aboutEle.click();
        Thread.sleep(2000);
        WebElement subMenu=driver.findElement(By.xpath("//a[text()='Events']"));
        subMenu.click();
    }
}
