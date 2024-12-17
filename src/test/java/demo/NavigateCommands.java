package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.findElement(By.xpath("//img[@alt='Selenium Online Training']")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("https://demoqa.com/");
        driver.navigate().refresh();
        driver.quit();
    }
}
