package c5_c9locators_XpathAxis;
/*
Xpath Axis:
(7) parent: It travels to the next immediate parent element?

Q: Identify the parnt element for first username and read its id?
Ans:
//input[@id='frm1_un_id']/parent::form


Q: Identify the parent id from the tbody?
Ans:
//tbody/parent::table
 */
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxis7_parent_webproject {
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
