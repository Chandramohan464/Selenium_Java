package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyFirstTestClass {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();
        String title=driver.getTitle();
        System.out.println("Title of the Page: "+title);
        WebElement userName=driver.findElement(By.xpath("//input[@id='userName']"));
        WebElement passWord=driver.findElement(By.xpath("//input[@id='password']"));
        WebElement logInBtn=driver.findElement(By.xpath("//button[@id='login']"));
        userName.sendKeys("testuser");
        passWord.sendKeys("Password@123");
        logInBtn.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            WebElement logOutBtn=driver.findElement(By.xpath("(//button[text()='Log out'])[1]"));
            if (logOutBtn.isDisplayed()){

                logOutBtn.click();
                System.out.println("Logout successfull");
            }
        } catch (Exception e) {
            System.out.println("Invalid credential's");
        }
        driver.quit();
    }
}
