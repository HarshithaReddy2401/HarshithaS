package c10_ChildWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class HandleChildWindow {
    public static void main(String[] args) {
        handleChildWindow();
    }
    public static void handleChildWindow(){
        WebDriver oBrowser = null;
        String sParent = null;
        Set<String> oChild = null;
        try{
            oBrowser = new ChromeDriver();
            //1.Open Browser and maximize it
            oBrowser.manage().window().maximize();

            //2.navigate the URL
            oBrowser.navigate().to("file:///D:/HTML/SampleWebProject.html");
            Thread.sleep(2000);

            //3.Read the parent window id and store it in a variable
            sParent = oBrowser.getWindowHandle();
            System.out.println("Parent Window ID: "+sParent);

            //4.click on ActiTime link
            oBrowser.findElement(By.linkText("ActiTime")).click();
            Thread.sleep(2000);

            //5.Read the 'ActiTime' child window id and switch to it
            oChild = oBrowser.getWindowHandles(); //contains both parent ID + child ID(s).
            for(String childWnd : oChild){
                if (!childWnd.equals(sParent)) {
                    oBrowser.switchTo().window(childWnd);
                    System.out.println(oBrowser.getTitle());
                    System.out.println(oBrowser.getCurrentUrl());

                    oBrowser.findElement(By.id("username")).sendKeys("aaaaaaaaaaaaaa");
                    Thread.sleep(2000);
                    oBrowser.close();
                    break;
                }
            }
            oBrowser.switchTo().window(sParent);

            Thread.sleep(2000);
            oBrowser.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            oBrowser = null;
        }
    }
}
