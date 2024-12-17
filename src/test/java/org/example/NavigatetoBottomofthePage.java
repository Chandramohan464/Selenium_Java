package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatetoBottomofthePage {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/downloads/");
        WebElement element=driver.findElement(By.xpath("//a[@href='/about/']"));
        int x=element.getLocation().getX();
        int y=element.getLocation().getY();

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+x+","+y+")");
        Thread.sleep(2000);
        element.click();
    }
}

