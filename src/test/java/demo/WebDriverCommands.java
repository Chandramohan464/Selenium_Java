package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/");
        String pageTitle=driver.getTitle();
        int titleLength=pageTitle.length();
        System.out.println("Page-title: "+pageTitle+" length of the title: "+titleLength);
        String url=driver.getCurrentUrl();
        if ("https://demoqa.com/".equals(url)){

            System.out.println("Opened correct website");
        }
        else {
            System.out.println("Invalid website");
        }
        String pageSrc=driver.getPageSource();
        int pageSrcLength=pageSrc.length();
        System.out.println("Page Source: "+pageSrc);
        System.out.println("Length: "+pageSrcLength);
        driver.quit();
    }
}
