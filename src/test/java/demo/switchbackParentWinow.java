package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class switchbackParentWinow {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");

        driver.findElement(By.id("windowButton")).click();
        driver.findElement(By.id("messageWindowButton")).click();

        String mainWindow=driver.getWindowHandle();
        System.out.println("Window Handle of main Window: "+mainWindow);
        Set<String> allWindows=driver.getWindowHandles();
        System.out.println("Window Handle's of all opened window's: "+allWindows);

        Iterator<String> itr=allWindows.iterator();
        while (itr.hasNext()){

            String childWindow=itr.next();
            if(!mainWindow.equalsIgnoreCase(childWindow)){
                driver.switchTo().window(childWindow);
                driver.close();
                System.out.println("child window closed");
            }
        }

        driver.switchTo().window(mainWindow);
        driver.quit();
        System.out.println("Main window closed");
    }
}
