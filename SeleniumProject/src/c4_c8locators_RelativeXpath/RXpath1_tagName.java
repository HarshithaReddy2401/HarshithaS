package c4_c8locators_RelativeXpath;
/*===========Relative xpath========================
        (a) using tagName
        Q: first username
//input
        Q: first password
//input[2]*/

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RXpath1_tagName {
    public static void main(String[] args) {
        rxpathLocator();
    }
    public static void rxpathLocator(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///D:/HTML/SampleWebProject.html");
            chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");

            //using xpath enter userName and password
            chrome.findElement(By.xpath("//input")).sendKeys("aaaaaaaaaaaaa"); //input
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
