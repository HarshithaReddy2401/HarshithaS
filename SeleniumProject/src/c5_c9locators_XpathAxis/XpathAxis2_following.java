package c5_c9locators_XpathAxis;
/*Xpath Axis:
(2) following: It travels in forward direction within one row or many rows OR multiple levels.
The following can acts as following-sibling & following.

Q: Identify the password by starting from username?
Ans:
//input[@id='frm1_un_id']/following::input[1]

Q: Identify the username by starting from the <pre> paragraph four and move down direction?
Ans:
//pre[contains(text(), 'Three')]/following::input[1]

Q: Indetify the person name who is next to 'Abdul Kalam'?
Ans:
//td[text()='Abdul Kalam']/following::tr[1]/td[1]*/

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxis2_following {
    public static void main(String[] args) {

        xpathAxisfollowing();
    }
    public static void xpathAxisfollowing(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///D:/HTML/SampleWebProject.html");
            chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");

            //using xpath enter userName and password
            chrome.findElement(By.xpath("//input[@id='frm1_un_id']/following::input[1]\n")).sendKeys("aaaaaaaaaaaaa");
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
