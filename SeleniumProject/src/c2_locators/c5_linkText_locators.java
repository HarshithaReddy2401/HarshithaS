package c2_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class c5_linkText_locators {
    public static void main(String[] args) {
        linkTextLocator();
    }

    //linkText locator example
    public static void linkTextLocator(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///D:/HTML/SampleWebProject.html");
            chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");

            //using linkText enter userName and password
            chrome.findElement(By.linkText("Google India")).click();
            Thread.sleep(2000);

            //Click on back navigation
            chrome.navigate().back();

            chrome.findElement(By.linkText("Facebook")).click();
            Thread.sleep(2000);

            //Click on back navigation
            chrome.navigate().back();

            chrome.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            chrome = null;
        }
    }
}
