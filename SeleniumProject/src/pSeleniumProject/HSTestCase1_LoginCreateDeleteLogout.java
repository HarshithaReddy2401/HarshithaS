package pSeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HSTestCase1_LoginCreateDeleteLogout {
    public static void main(String[] args) {
        testScript();
    }

    //login->create user->delete user->logout
    public static void testScript(){
        WebDriver oBrowser = null;
        try {
            oBrowser = new ChromeDriver();
            //1.open the Browser(chrome)
            oBrowser.manage().window().maximize();

            //2.enter the URL
            oBrowser.navigate().to("http://localhost/login.do");
            Thread.sleep(2000);

            //3.enter username and password and click login button
            oBrowser.findElement(By.id("username")).sendKeys("admin");
            oBrowser.findElement(By.name("pwd")).sendKeys("manager");
            oBrowser.findElement(By.id("loginButton")).click();

            //4.verify login is successful


        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            oBrowser.close();
        }
    }
}
