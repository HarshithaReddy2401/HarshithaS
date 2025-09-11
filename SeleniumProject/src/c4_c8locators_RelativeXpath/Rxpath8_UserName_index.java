package c4_c8locators_RelativeXpath;
 /*(h) using index
    Q: identify the user name using index?
    Ans:
    without index:
//input[@name='frm1_un_name']
    with index:
            (//input[@name='frm1_un_name'])[1]
            /html/body/form/input[1]
            (/html/body/form/input[1])[1]
            (/html/body/form[1]/index[1])[1]*/

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rxpath8_UserName_index {
    public static void main(String[] args) {
        rxpathindex();
    }
    public static void rxpathindex(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///D:/HTML/SampleWebProject.html");
            chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");

            //using xpath enter userName and password
            chrome.findElement(By.xpath("(//input[@name='frm1_un_name'])[1]")).sendKeys("bb");
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
