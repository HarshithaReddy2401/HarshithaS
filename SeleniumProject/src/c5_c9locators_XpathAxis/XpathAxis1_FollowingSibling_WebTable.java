package c5_c9locators_XpathAxis;
/*Q: Identify the designation for 'Abdul Kalam'?
Ans:
//td[text()='Abdul Kalam']/following-sibling::td[1]*/

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxis1_FollowingSibling_WebTable {
    public static void main(String[] args) {
        xpathAxisWebTable();
    }
    public static void xpathAxisWebTable(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///D:/HTML/SampleWebProject.html");
            chrome.navigate().to("file:///D:/HTML/SampleWebtable.html");

            //using xpath enter userName and password ////changed to this
            String text =  chrome.findElement(By.xpath("//td[text()='Abdul Kalam']/following-sibling::td[1]")).getText();
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
