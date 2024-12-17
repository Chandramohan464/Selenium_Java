package com.screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;

public class CaptureScreenshot {

    public static void main(String[] args){

        WebDriver driver=new ChromeDriver();

        Date d=new Date();
        String date1=d.toString();
        System.out.println(date1);

        String date2=date1.replaceAll(":","_");
        System.out.println(date2);

        driver.get("https://testautomationpractice.blogspot.com/");

        TakesScreenshot ts=(TakesScreenshot) driver;
        File src=ts.getScreenshotAs(OutputType.FILE);

        File dest=new File(".\\screenshot\\"+date2+"_testautomation_screenshot.png");

        try {
            Files.copy(src.toPath(), dest.toPath());
            System.out.println("File copied successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
