package c2_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class c6_ParitalLinkText_locators {
    public static void main(String[] args) {
        partialLinkTextLocator();
    }

    //partialLinkText locator example
    public static void partialLinkTextLocator(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///D:/HTML/SampleWebProject.html");
            chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");

            //using linkText enter userName and password
            chrome.findElement(By.partialLinkText("gle In")).click();
            Thread.sleep(2000);

            //Click on back navigation
            chrome.navigate().back();

            chrome.findElement(By.partialLinkText("Facebook")).click(); //book
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
