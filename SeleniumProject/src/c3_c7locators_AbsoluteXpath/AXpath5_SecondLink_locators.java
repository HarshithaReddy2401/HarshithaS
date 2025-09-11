package c3_c7locators_AbsoluteXpath;
/*Q: Using AX fidn the second link?
Ans:
/html/body/a[2]
/html/body/a[@id='link2_id']
/html/body/a[@name='link2_name']*/

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AXpath5_SecondLink_locators {
    public static void main(String[] args) {
        xpathLocator();
    }
    //xpath locator example
    public static void xpathLocator(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///D:/HTML/SampleWebProject.html");
            chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");

            //using xpath enter userName and password
            chrome.findElement(By.xpath("/html/body/a[2]")).sendKeys("aaaaaaaaaaaaa");
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
