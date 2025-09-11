package c2_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_ID_Locator {
    public static void main(String[] args){
        idLocator();
    }
    public static void idLocator(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///D:/HTML/SampleWebProject.html");
            chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");

            //using id enter userName and password
            chrome.findElement(By.id("frm1_un_id")).sendKeys("aaaaaaaaaaaaa");
            chrome.findElement(By.id("frm1_pwd_id")).sendKeys("bbbbbbbbbbb");
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
