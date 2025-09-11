package c4_c8locators_RelativeXpath;
/*(i) using partial matches
   (3) contains()
Q: If the first username attributes are chaning (ex id attribute values) at the beginning/middle/end of the attribute values. Then use contains():
syntax:
//[tagName][contains(@<attName>, <const ending/starting/middle value>)]
//input[contains(@id, 'm1_un_id')]*/

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rxpath9_PartialMatches_contains {
    public static void main(String[] args) {
        partialmatchesContains();
    }
    public static void partialmatchesContains(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///D:/HTML/SampleWebProject.html");
            chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");

            //using xpath enter userName and password
            chrome.findElement(By.xpath("//input[contains(@id, 'm1_un_id')]")).sendKeys("aaaaaaaaaaaaa");
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
