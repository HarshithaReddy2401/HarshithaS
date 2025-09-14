/*package c13_sikuli;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.UrlTemplate;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.Match;


public class Sikuli {
    public static void main(String[] args) {
        sikuliTest();
    }
    public static void sikuliTest(){
        WebDriver oBrowser = null;
        Screen screen = null;
        try{
            oBrowser = new ChromeDriver();
            oBrowser.manage().window().maximize();
            oBrowser.navigate().to("http://localhost/login.do");
            Thread.sleep(3000);


            //Sikuli code:
            screen = new Screen();
            UrlTemplate.Match userName = screen.find(System.getProperty("user.dir")+ "\\Library\\images\\userName.png");
            userName.type("admin");

            UrlTemplate.Match loginLogo = screen.find(System.getProperty("user.dir")+ "\\Library\\images\\loginLogo.png");
            loginLogo.click();

            UrlTemplate.Match password = screen.find(System.getProperty("user.dir")+ "\\Library\\images\\password.png");
            password.click();
            password.type("manager");

            UrlTemplate.Match loginButton = screen.find(System.getProperty("user.dir")+ "\\Library\\images\\LoginBtn.png");
            loginButton.click();

            Thread.sleep(2000);

            UrlTemplate.Match shortcutClose = screen.find(System.getProperty("user.dir")+ "\\Library\\images\\closeShortCut.png");
            shortcutClose.click();

            UrlTemplate.Match logoutLink = screen.find(System.getProperty("user.dir")+ "\\Library\\images\\logout.png");
            logoutLink.click();

        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            oBrowser = null;
        }
    }
}
*/