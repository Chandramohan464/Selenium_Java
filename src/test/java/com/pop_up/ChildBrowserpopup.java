package com.pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class ChildBrowserpopup {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//img[@class='banner-image']")).click();
        Thread.sleep(2000);

        Set<String> windowHandles =driver.getWindowHandles();
        System.out.println(windowHandles);

        int countOpenedWindows=windowHandles.size();
        System.out.println("Number of windows opened by selenium: "+countOpenedWindows);

        for(String window:windowHandles){
            Thread.sleep(2000);
            driver.switchTo().window("window");
            Thread.sleep(2000);
            String title= driver.getTitle();
            System.out.println("Window handle id of: "+title+"-> is "+window);
        }
        driver.quit();
    }
}
