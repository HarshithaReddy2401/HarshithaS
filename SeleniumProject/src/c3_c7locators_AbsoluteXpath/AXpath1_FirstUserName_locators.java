package c3_c7locators_AbsoluteXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Absolute xpath ctrl-F , paste

/* First User name field possible Absolute xpaths:
 /html/body/form/input
/html/body/form[1]/input
/html/body/form[1]/input[1]
/html/body/form[@id='frm1']/input[@id='frm1_un_id']
/html/body/form[@id='frm1']/input[@name='frm1_un_name']
/html/body/form/input[@name='frm1_un_name'] */

public class AXpath1_FirstUserName_locators {
    public static void main(String[] args) {

        xpathLocator();
    }

    //xpath locator example
    public static void xpathLocator(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///D:/HTML/SampleWebProject.html");
            chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");

            //using xpath enter userName and password
            chrome.findElement(By.xpath("/html/body/form[@id='frm1']/input[@name='frm1_un_name']")).sendKeys("aaaaaaaaaaaaa");
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
