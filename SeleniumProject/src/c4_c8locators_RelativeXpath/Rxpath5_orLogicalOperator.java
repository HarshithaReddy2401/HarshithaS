package c4_c8locators_RelativeXpath;
/*(e) using or logical operator
        syntax:
//<tagName>[@<attrName>='<attrValue>' or @<attrName>='<attrValue>']
        Q: Enter value for first username?
        Ans:
//input[@id='frm1_un_id' or @type='text']
//input[@name='frm1_un_name' or @placeholder='Enter UserName']*/

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rxpath5_orLogicalOperator {
    public static void main(String[] args) {
        rxpathORLogicalOperator();
    }
    public static void rxpathORLogicalOperator(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///D:/HTML/SampleWebProject.html");
            chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");

            //using xpath enter userName and password
            chrome.findElement(By.xpath("//input[@id='frm1_un_id' or @type='text']")).sendKeys("aaaaaaaaaaaaa");
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
