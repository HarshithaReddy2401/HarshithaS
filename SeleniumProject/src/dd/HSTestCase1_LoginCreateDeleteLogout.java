package dd;

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
        try{
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

            //4.verify login successful
            String strText = oBrowser.findElement(By.xpath("//td[@class='pagetitle']")).getText();
            if(strText.equalsIgnoreCase("Enter Time Track")){
                System.out.println("Login to actiTime was successful");
                //resolution mistake for the logout
//                if(oBrowser.findElement(By.xpath("//div@style='display:block;'")).isDisplayed()){
//                    oBrowser.findElement(By.id("gettingStartedShortcutsMenuClosed")).click();
                }else{
                    System.out.println("Failed to login");
//                }
            }

            //5.click on 'logout link and verify 'logout' is successful
            oBrowser.findElement(By.xpath("//a[@id='logoutLink']")).click();
            Thread.sleep(2000);
            if(oBrowser.getTitle().equalsIgnoreCase("actiTIME - Login")){
                System.out.println("Logout from ActiTime was successful");
            }else{
                System.out.println("Failed to logout from ActiTime");
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            oBrowser.close();
        }
    }
}
