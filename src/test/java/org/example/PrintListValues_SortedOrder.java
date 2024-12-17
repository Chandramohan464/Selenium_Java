package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PrintListValues_SortedOrder {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/91886/IdeaProjects/SelectWebPage.html");
        WebElement ele=driver.findElement(By.id("mtr"));

        Select select=new Select(ele);

        List<WebElement> options=select.getOptions();
        int size=options.size();
        System.out.println("No of options are: "+size);

        System.out.println("Printing the values");
        ArrayList<String> list=new ArrayList<>();
        for (WebElement opt:options){
            System.out.print(opt.getText()+" ");
            String text=opt.getText();
            list.add(text);
        }
        System.out.println();

        Collections.sort(list);

        System.out.println("Printing the elements in sorted form");
        for (String opt:list){
            System.out.print(opt+" ");
        }
    }
}
