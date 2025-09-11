package c3_c7locators_AbsoluteXpath;
/*Q: Using AX find second username?
        /html/body/form[2]/input[1]
        /html/body/form[@id='frm2']/input[1]
        /html/body/form[@id='frm2']/input[@id='frm1_un_id']*/

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AXpath3_SecondUserName_locators {
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
            chrome.findElement(By.xpath("/html/body/form[@id='frm2']/input[1]")).sendKeys("aaaaaaaaaaaaa");
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
