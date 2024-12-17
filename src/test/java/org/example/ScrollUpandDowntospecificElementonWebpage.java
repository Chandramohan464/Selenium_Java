package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpandDowntospecificElementonWebpage {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        Thread.sleep(2000);
        WebElement ele=driver.findElement(By.xpath("//img[@title='Applitools']"));
        int x=ele.getLocation().getX();
        int y=ele.getLocation().getY();

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+x+","+y+")");
    }
}
