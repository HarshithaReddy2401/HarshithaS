package c6_locators_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class                                                                                                                                                                                                                                                                                                                                                                    CSS_Selector {
    public static void main(String[] args) {
        CSS_Selector();
    }
    public static void CSS_Selector(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");

            //Q:Using AC find first UserName?
            //chrome.findElement(By.cssSelector("html body form input")).sendKeys("aaaaaaaaaaaaa");
            //chrome.findElement(By.cssSelector("html body form[id = 'frm1'] input")).sendKeys("bbbbbbbb");
            //chrome.findElement(By.cssSelector("html body form[id = 'frm1'] input[id = 'frm1_un_id']")).sendKeys("cccccccccc");

            //Q:Using AC find first Password?
            //chrome.findElement(By.cssSelector("html body form[id = 'frm1'] input[id = 'frm1_pwd_id']")).sendKeys("aaaaaaaaaaaaa");
            //chrome.findElement(By.cssSelector("html body form input[id = 'frm1_pwd_id']")).sendKeys("aaaaaaaaaaaaa");

            //Q:Using AC find second username
            //chrome.findElement(By.cssSelector("html body form[id = 'frm2'] input")).sendKeys("aaaaaaaaaaaaa");
            //chrome.findElement(By.cssSelector("html body form[id = 'frm2'] input[id ='frm1_un_id']")).sendKeys("aaaaaaaaaaaaa");

            //Q:Using AC find second password
            //HS chrome.findElement(By.cssSelector("html body form[id = 'frm2'] input")).sendKeys("aaaaaaaaaaaaa");
            //chrome.findElement(By.cssSelector("html body form[id = 'frm2'] input[id = 'frm1_pwd_id']")).sendKeys("aaaaaaaaaaaaa");

            //-----------Relative cssSelector
            //a. using tagName
            //Q: Identify the first username?
            //chrome.findElement(By.cssSelector("input")).sendKeys("aaaaaaaaaaaaa");

            //(b)Using attribute name and value
            //Q:Identify the first username
            //chrome.findElement(By.cssSelector("input[id = 'frm1_un_id']")).sendKeys("aaaaaaaaaaaaa");
            //chrome.findElement(By.cssSelector("input[name = 'frm1_un_name']")).sendKeys("aaaaaaaaaaaaa");

            //(c)using morethan one attribute name and value
            // Do name and id
            //chrome.findElement(By.cssSelector("input[id = 'frm1_un_id'][type = 'text']")).sendKeys("aaaaaaaaaaaaa");
            //chrome.findElement(By.cssSelector("input[name = 'frm1_un_name'][type = 'text']")).sendKeys("aaaaaaaaaaaaa");

            //(d)using not logical operator
            //chrome.findElement(By.cssSelector("a:not([target])")).click();

            //(e)cssSeector with PartialMatch
            //(a) ^(starts-with)
            //Q: Enter first username value?
            //chrome.findElement(By.cssSelector("input[id^='frm1_un_i']")).sendKeys("aaaaaaaaaaaaa");

            //(b) $(ends-with)
            //Q:Enter first username value?
            //chrome.findElement(By.cssSelector("form[id='frm1']>input[id$='1_un_id']")).sendKeys("aaaaaaaaaaaaa");

            //Q:Enter first password value?
            //chrome.findElement(By.cssSelector("input[name$='1_pwd_name']")).sendKeys("aaaaaaaaaaaaa");

            //(c) *(contains)
            //Q:Enter first username value?
            //chrome.findElement(By.cssSelector("input[id*='_un_id']")).sendKeys("aaaaaaaaaaaaa");

            //(f)using Regular expression
            //Q:Identify the first username?
            //tagName
            //chrome.findElement(By.cssSelector("*[id='frm1_un_id']")).sendKeys("aaaaaaaaaaaaa");

            //(g)using parent hierarchy
            //Identify the first username?
            //chrome.findElement(By.cssSelector("form[id='frm1']>input[id = 'frm1_un_id']")).sendKeys("aaaaaaaaaaaaa");

            //nth child concept in css selector
            //(a) First-child()
            // Identify the first element in the form parent tag?
            //chrome.findElement(By.cssSelector("form[id='frm1']>:first-child")).sendKeys("aaaaaaaaaaaaa");

            //(b)last-child()
            //chrome.findElement(By.cssSelector("form[id='frm1']>:last-child")).click();

            //(c)nth-child(<index>) takes <br> also every tag names
            chrome.findElement(By.cssSelector("form[id='frm1']>:nth-child(5)")).click();

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
