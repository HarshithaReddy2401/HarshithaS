package c5_c9locators_XpathAxis;
/*Xpath Axis:
(a) following-sibling: It travels in forward direction within one row OR within next level.

Q: Identify the password by starting from username?
Ans:
//input[@id='frm1_un_id']/following-sibling::input[1]

Q: Identify the designation for 'Abdul Kalam'?
Ans:
//td[text()='Abdul Kalam']/following-sibling::td[1]*/

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxis1_FollowingSibling {
    public static void main(String[] args) {
        xpath_locator_webpage();
    }
    public static void xpath_locator_webpage(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///D:/HTML/SampleWebProject.html");
            chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");

            //using xpath enter userName and password
            chrome.findElement(By.xpath("//input[@id='frm1_un_id']/following-sibling::input[1]")).sendKeys("aaaaaaaaaaaaa");
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
