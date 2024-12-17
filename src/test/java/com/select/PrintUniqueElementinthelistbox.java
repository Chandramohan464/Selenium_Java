package com.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.HashSet;
import java.util.List;

public class PrintUniqueElementinthelistbox {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/91886/IdeaProjects/SelectWebPage.html");
        WebElement list=driver.findElement(By.id("mtr"));

        Select select=new Select(list);
        List<WebElement> allOptions=select.getOptions();
        HashSet<String> uniqueEle=new HashSet<>();
        for (WebElement ele:allOptions){
            uniqueEle.add(ele.getText());
        }
        System.out.println("Printing unique options");
        System.out.println(uniqueEle);
    }
}
