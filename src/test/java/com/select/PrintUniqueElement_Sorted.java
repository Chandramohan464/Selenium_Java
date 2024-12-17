package com.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.TreeSet;

public class PrintUniqueElement_Sorted {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/91886/IdeaProjects/SelectWebPage.html");
        WebElement list=driver.findElement(By.id("mtr"));

        Select select=new Select(list);
        List<WebElement> allOptions=select.getOptions();
        TreeSet<String> unique_sortedEle=new TreeSet<>();
        for (WebElement ele:allOptions){
            unique_sortedEle.add(ele.getText());
        }
        System.out.println("Printing unique and sorted options");
        System.out.println(unique_sortedEle);
    }
}
