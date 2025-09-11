package c4_c8locators_RelativeXpath;
/*(b) using attribute name and value
syntax:
//<tagName>[@<attrName>='<attrValue>']
Q: Enter value for first username?
Ans:
//input[@id='frm1_un_id']
//input[@name='frm1_un_name']
//input[@placeholder='Enter UserName']*/

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RXpath2_attrNameAndValue {
    public static void main(String[] args) {
        attrNameAndValue();
    }
    public static void attrNameAndValue(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///D:/HTML/SampleWebProject.html");
            chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");

            //using xpath enter userName and password
            chrome.findElement(By.xpath("//input[@id='frm1_un_id']")).sendKeys("aaaaaaaaaaaaa");
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
