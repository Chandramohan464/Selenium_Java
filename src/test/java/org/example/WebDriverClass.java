package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebDriverClass {

    public WebDriver driver=null;

    @Test
    public void webDriverMethods(){

        driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

//        String pageTitle=driver.getTitle();
//        System.out.println(pageTitle);
//
//        String pageSource=driver.getPageSource();
//        System.out.println(pageSource);
//
//        String windowHandle=driver.getWindowHandle();
//        System.out.println(windowHandle);
//
//        String windowHandles=driver.getWindowHandle();
//        System.out.println(windowHandles);
//
        driver.manage().window().maximize();

        try {
            driver.navigate().to("https://mail.google.com/");
            Thread.sleep(2000);

            driver.navigate().back();
            Thread.sleep(2000);

            driver.navigate().forward();
            Thread.sleep(2000);

            driver.navigate().refresh();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();
    }
}

