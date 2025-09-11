package c5_c9locators_XpathAxis;
/*
Xpath Axis:
(5) ancestor: It travels in backward direction from child element towards parent element

Q: Identify the parent form id in which first username exist?
Ans:
//input[@id='frm1_un_id']/ancestor::form
//input[@id='frm1_un_id']/ancestor::body
//input[@id='frm1_un_id']/ancestor::html

Q: Identify the table id in which Smrthii Irani exist?
Ans:
//td[text()='Smruthi Irani']/ancestor::table
 */
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxis5_ancestor_webproject {
    public static void main(String[] args) {
        ancestor();
    }
    public static void ancestor(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///D:/HTML/SampleWebProject.html");
            chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");

            //using xpath enter userName and password ////changed to this
            String text =  chrome.findElement(By.xpath("//input[@id='frm1_un_id']/ancestor::form")).getDomAttribute("id");
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
