package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnterText_intoDisabledTextbox {

    WebDriver driver=null;
    JavascriptExecutor js=null;

    @Test
    public void testDisabledTextBox() throws InterruptedException {

        driver=new ChromeDriver();
        driver.get("file:///C:/Users/91886/IdeaProjects/JavaScriptExecutorDisabledPage.html");
        Thread.sleep(2000);
        js=(JavascriptExecutor)driver;
        js.executeScript("document.getElementById('t1').value='Chandramohan'");
        Thread.sleep(2000);
        js.executeScript("document.getElementById('t2').value=''");
        Thread.sleep(2000);
        js.executeScript("document.getElementById('t2').value='Halemani'");
        Thread.sleep(2000);
        js.executeScript("document.getElementById('t2').type='button'");
    }
}
