package c5_c9locators_XpathAxis;
/*
Xpath Axis:
(6) descendant: It goes in a forward direction to the child element

Q: Starting form the body identify its child element userNAme & enter the value?
Ans:
//body/descendant::input[1]

Q: Starting form the body, get the abdul kalam cell?
Ans:
//body/descendant::td[text()='Abdul Kalam']
 */
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathaxis6_descendant_webproject {
    public static void main(String[] args) {
        descendant_webpage();
    }
    public static void descendant_webpage(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///D:/HTML/SampleWebProject.html");
            chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");

            //using xpath enter userName and password
            chrome.findElement(By.xpath("//body/descendant::input[1]")).sendKeys("aaaaaaaaaaaaa");
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
