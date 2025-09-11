package c4_c8locators_RelativeXpath;
/* (c) using more than one attribute name and value
syntax:
//<tagName>[@<attrName>='<attrValue>'][@<attrName>='<attrValue>']
Q: Enter value for first username?
Ans:
//input[@id='frm1_un_id'][@type='text']
//input[@name='frm1_un_name'][@placeholder='Enter UserName'] */

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rxpath3_Morethan1AttrAndValue {
    public static void main(String[] args) {
        rxpathLocatorMorethanOneAttAndValue();
    }

    //Rxpath locator example MoreThanOneAttributevalue
    public static void rxpathLocatorMorethanOneAttAndValue(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///D:/HTML/SampleWebProject.html");
            chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");

            //using xpath enter userName and password
            chrome.findElement(By.xpath("//input[@id='frm1_un_id'][@type='text']")).sendKeys("aaaaaaaaaaaaa");
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
