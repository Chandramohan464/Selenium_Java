package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;


public class WebTable {

    WebDriver driver=null;

    @Test
    public void noOfRows() throws InterruptedException {

        driver=new ChromeDriver();
        driver.get("file:///C:/Users/91886/IdeaProjects/WebTable.html");
        Thread.sleep(2000);
        List<WebElement> rowEle=driver.findElements(By.tagName("tr"));
        System.out.println("No of rows present: "+rowEle.size());
        driver.quit();
    }

    @Test
    public void noOfColumns() throws InterruptedException {

        driver=new ChromeDriver();
        driver.get("file:///C:/Users/91886/IdeaProjects/WebTable.html");
        Thread.sleep(2000);
        List<WebElement> colEle=driver.findElements(By.tagName("th"));
        System.out.println("No of columns present: "+colEle.size());
        driver.quit();
    }

    @Test
    public void noOfCells() throws InterruptedException {

        driver=new ChromeDriver();
        driver.get("file:///C:/Users/91886/IdeaProjects/WebTable.html");
        Thread.sleep(2000);
        List<WebElement> cellEle=driver.findElements(By.xpath("//th|//td"));
        System.out.println("No of columns present: "+cellEle.size());
        driver.quit();
    }

    @Test
    public void printNumberEle(){

        driver=new ChromeDriver();
        driver.get("file:///C:/Users/91886/IdeaProjects/WebTable.html");
        System.out.println("Number element's are: ");
        List<WebElement> cellEle=driver.findElements(By.xpath("//td"));
        for(WebElement i:cellEle){
            String cellElement=i.getText();
            try {
                int numEle=Integer.parseInt(cellElement);
                System.out.print(" "+numEle);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        driver.quit();
    }

    @Test
    public void numEleOperation(){

        driver=new ChromeDriver();
        driver.get("file:///C:/Users/91886/IdeaProjects/WebTable.html");
        List<WebElement> cellEle=driver.findElements(By.xpath("//td"));
        int noOfNumValues=0;
        int sumOfNumValues=0;
        for(WebElement cell:cellEle){
            String cellElement=cell.getText();
            try {
                int numEle = Integer.parseInt(cellElement);
                noOfNumValues++;
                sumOfNumValues=sumOfNumValues+numEle;
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("No of numeric values: "+noOfNumValues);
        System.out.println("Sum of numeric values: "+sumOfNumValues);
        driver.quit();
    }
}
