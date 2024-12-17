package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands_2 {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows/");
        driver.findElement(By.xpath("//button[@id='windowButton']")).click();
        driver.quit();
    }
}
