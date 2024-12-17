package com.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ListBoxExample {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/91886/IdeaProjects/SelectWebPage.html");
        WebElement list=driver.findElement(By.id("mtr"));

        Select select=new Select(list);

        List<WebElement> options=select.getOptions();
        int size=options.size();
        System.out.println("No of options are: "+size);

        System.out.println("Elements in options are");
        for (WebElement ele:options){
            System.out.print(ele.getText()+" ");
        }
        System.out.println();

        select.selectByIndex(0);
        select.selectByValue("v");
        select.selectByVisibleText("Puri");

        List<WebElement> allSelectedOptions=select.getAllSelectedOptions();
        int noOfSelectedOptions=allSelectedOptions.size();
        System.out.println("No of selected options are: "+noOfSelectedOptions);
        System.out.println(" Selected items are printed below ");
        for (WebElement webElement : allSelectedOptions) {
            System.out.println(webElement.getText());
        }

        System.out.println("check whether it is a multiple select listbox or not");
        boolean multiple = select.isMultiple();
        System.out.println(multiple +" it is multi select");

        if (multiple) {
            WebElement firstSelectedOption = select.getFirstSelectedOption();
            System.out.println(firstSelectedOption.getText()+" is the first selected item in the list box");
            select.deselectByIndex(0);
            WebElement firstSelectedOption1 = select.getFirstSelectedOption();
            System.out.println(firstSelectedOption1.getText()+" is the first selected item");
            select.deselectByValue("v");
            WebElement firstSelectedOption2 = select.getFirstSelectedOption();
            System.out.println(firstSelectedOption2.getText()+" is the first selected item");
            select.deselectByVisibleText("Puri");
        }
    }
}
