package c2_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class c4_tagName_locators {
    public static void main(String[] args) {
        tagNameLocator();
    }
    //tagName locator example
    public static void tagNameLocator(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///D:/HTML/SampleWebProject.html");
            chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");

            //using tagName enter userName and password
            chrome.findElement(By.tagName("input")).sendKeys("aaaaaaaaaaaaa");
            chrome.findElement(By.tagName("a")).click();
            Thread.sleep(2000);

            //chrome.quit();
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            chrome = null;
        }
    }
}
