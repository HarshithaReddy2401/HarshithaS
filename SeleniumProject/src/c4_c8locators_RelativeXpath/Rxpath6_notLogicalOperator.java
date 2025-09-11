package c4_c8locators_RelativeXpath;
/* (f) using not logical operator
        syntax:
//<tagName>[not(@<attrName>='<attrValue>')]
        Q: Find the link which doesnot have target attribute?
        Ans:
//a[not(@target)] */

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rxpath6_notLogicalOperator {
    public static void main(String[] args) {
        rxpathNOTLogicalOperator();
    }
    public static void rxpathNOTLogicalOperator(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///D:/HTML/SampleWebProject.html");
            chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");

            //using xpath enter userName and password
            chrome.findElement(By.xpath("//a[not(@target)][2]")).sendKeys("aaaaaaaaaaaaa");
            Thread.sleep(2000);

            chrome.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            chrome = null;
        }
    }
}
