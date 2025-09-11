package c1_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogout_Chrome {
    public static void main(String args[]){
        loginTestcase();
}
    public static void loginTestcase() {
        ChromeDriver chrome = null;
        try {
            //1.Open chrome browser
            chrome = new ChromeDriver();
            chrome.manage().window().maximize(); //chrome full page

            //2.navigate the actiTime URL (wait for page to load)
            chrome.get("http://localhost/login.do");
            Thread.sleep(2000); //ms

            //3.enter user name
            chrome.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");

            //4. enter password
            chrome.findElement(By.name("pwd")).sendKeys("manager");

            //5.click on login button (wait for page to load)
            chrome.findElement(By.cssSelector("a[id='loginButton'] div")).click();
            Thread.sleep(2000);

            if(chrome.findElement(By.xpath("//div[@id='gettingStartedShortcutsMenuCloseId']")).isDisplayed()){
                chrome.findElement(By.xpath("//div[@id='gettingStartedShortcutsMenuCloseId']")).click();
            }


            //6.Verify login is successfull
            String text = chrome.findElement(By.xpath("//td[@class='pagetitle']")).getText();

            if(text.equalsIgnoreCase("Enter Time-track")) {
                System.out.println("Login to ActiTime is successful");
            }else {
                System.out.println("Failed to login to ActiTime");
            }

            //7.Logout from actiTime(wait for page to load)
            chrome.findElement(By.xpath("//a[@id='logoutLink']")).click();
            Thread.sleep(2000);

            //8. Verify logout successfull
            if(chrome.findElement(By.xpath("//tbody/tr/td[@id='logoContainer']/div/img[1]")).isDisplayed()) {
                System.out.println("Logout from ActiTime is successfull");
            }else {
                System.out.println("Failed to logout from ActiTime");
                return;
            }

            //9.close the browser
            chrome.close();
        }catch(Exception e){
            e.printStackTrace();;
        }
        finally {
            chrome = null;
        }
    }
}
