package pSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class button_validation {
    public static void main(String[] args) {
        Button_validations();
    }
    public static void Button_validations(){
        WebDriver oBrowser = null;
        try{
            oBrowser = new ChromeDriver();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
