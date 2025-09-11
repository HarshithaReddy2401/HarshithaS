package c4_c8locators_RelativeXpath;

/* (g) using text() method
Q: find header, paragraph and lin using text method?
Ans:

//h1[text()='Header One']
//p[text()='Sample paragraphs One']
//a[text()='ActiTime']*/

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rxpath7_text_method {
    public static void main(String[] args) {
        rxpathtext();
    }
    public static void rxpathtext(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///D:/HTML/SampleWebProject.html");
            chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");

            //using xpath enter userName and password
            String text =  chrome.findElement(By.xpath("//h1[text()='Header One']")).getText();
            System.out.println(text);
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
