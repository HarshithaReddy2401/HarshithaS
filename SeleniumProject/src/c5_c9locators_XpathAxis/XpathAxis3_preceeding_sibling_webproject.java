package c5_c9locators_XpathAxis;
/*
Xpath Axis:
(3) preceding-sibling: It travels in a backward direction within one row OR one level.

Q: Identify the username by starting from the password and move in backward direction?
Ans:
//input[@id='frm1_pwd_id']/preceding-sibling::input

Q: Find the person name whose designation is Indian Scientist?
Ans:
//td[text()='Indian Scientist']/preceding-sibling::td[1]
 */
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxis3_preceeding_sibling_webproject {
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
            chrome.findElement(By.xpath("//input[@id='frm1_pwd_id']/preceding-sibling::input")).sendKeys("aaaaaaaaaaaaa");
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
