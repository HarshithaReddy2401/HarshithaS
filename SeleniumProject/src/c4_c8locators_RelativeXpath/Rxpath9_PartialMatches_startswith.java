package c4_c8locators_RelativeXpath;
/*(i) using partial matches
   (1) starts-with()
Q: If the first username attributes are chaning (ex id attribute values) at the end of the attribute values. Then use stars-with():
syntax:

//[tagName][starts-with(@<attName>, <const strting value>)]

Ex:
//input[starts-with(@id, 'frm1_un_i')]*/

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rxpath9_PartialMatches_startswith {

    public static void main(String[] args) {
        partialmatchesStartsWith();
    }
    public static void partialmatchesStartsWith(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///D:/HTML/SampleWebProject.html");
            chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");

            //using xpath enter userName and password
            chrome.findElement(By.xpath("//input[starts-with(@id, 'frm1_un_i')]")).sendKeys("aaaaaaaaaaaaa");
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
