package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class childWindow {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("windowButton")).click();
        String mainWindow=driver.getWindowHandle();
        Set<String> allWindows=driver.getWindowHandles();
        Iterator<String> itr= allWindows.iterator();
        while (itr.hasNext()){
            String childWindow= itr.next();
            if(!mainWindow.equalsIgnoreCase(childWindow)){
                driver.switchTo().window(childWindow);
                WebElement text=driver.findElement(By.id("sampleHeading"));
                System.out.println("Child window has text: "+text.getText());
            }
        }
    }
}
