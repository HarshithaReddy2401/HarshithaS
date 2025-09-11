package c2_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_ClassName_locators {
    public static void main(String[] args) {
        classLocator();
    }

//className locator eample
public static void classLocator(){
    ChromeDriver chrome = null;
    try{
        chrome = new ChromeDriver();
        chrome.manage().window().maximize();

        //chrome.get("file:///D:/HTML/SampleWebProject.html");
        chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");

        //using name enter userName and password
        chrome.findElement(By.className("frm1_un_class")).sendKeys("aaaaaaaaaaaaa");
        chrome.findElement(By.className("frm1_pwd_class")).sendKeys("bbbbbbbbbbb");
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