package com.pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class WindowPopup {

    public static void main(String[] args) throws IOException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://smallpdf.com/pdf-converter");
        driver.findElement(By.xpath("//span[contains(.,'Choose Files')]")).click();
        Runtime.getRuntime().exec("C:\\Users\\91886\\Desktop\\Wipro\\AutomationTesting\\ScriptWindow.exe");
    }
}
