package c4_c8locators_RelativeXpath;
/*(i) using partial matches
   (2) ends-with()
Q: If the first username attributes are chaning (ex id attribute values) at the beginning of the attribute values. Then use ends-with():
syntax:
//[tagName][ends-with(@<attName>, <const ending value>)]
//input[ends-with(@id, 'm1_un_id')]*/

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rxpath9_PartialMatches_endswith_Error {
    public static void main(String[] args) {
        partialmatchesEndsWith();
    }
    public static void partialmatchesEndsWith(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///D:/HTML/SampleWebProject.html");
            chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");

            //using xpath enter userName and password
            chrome.findElement(By.xpath("//input[ends-with(@id, 'm1_un_id')]")).sendKeys("aaaaaaaaaaaaa");
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
