package c5_c9locators_XpathAxis;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxis2_following_webProject2 {
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
            chrome.findElement(By.xpath("//pre[contains(text(), 'Three')]/following::input[1]")).sendKeys("aaaaaaaaaaaaa");
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
