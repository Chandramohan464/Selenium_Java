package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simplealert {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.xpath("//button[@id='alertButton']")).click();
        driver.switchTo().alert().accept();
    }
}
