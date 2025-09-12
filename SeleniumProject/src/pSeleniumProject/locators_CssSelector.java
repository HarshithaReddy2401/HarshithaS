package pSeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_CssSelector {
    public static void main(String[] args) {
        css_selector();
    }
    public static void css_selector(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();
            chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");

//            Q: Using AC find first username?
//            chrome.findElement(By.cssSelector("html body form input")).sendKeys("aaaaaaaaaaaa");
//            chrome.findElement(By.cssSelector("html body form input[id = 'frm1_un_id']")).sendKeys("aaaaaaaaaaaa");
//            chrome.findElement(By.cssSelector("html body form[id='frm1'] input[id='frm1_un_id']")).sendKeys("aaaaaaaaaaaa");

//            Q: Using AC find first password?
//            chrome.findElement(By.cssSelector("html body form[id = 'frm1'] input[id = 'frm1_pwd_id']")).sendKeys("aaaaaaaa");
//            chrome.findElement(By.cssSelector("html body form input[id = 'frm1_pwd_id']")).sendKeys("aaaaaaaa");
//
//            Q:Using AC find second username?
//            chrome.findElement(By.cssSelector("html body form[id = 'frm2'] input[id='frm1_un_id']")).sendKeys("aaaaaaaa");
//            chrome.findElement(By.cssSelector("html body form[id='frm2'] input")).sendKeys("aaaaaaaaaaaa");
//
//            Q:Using Ac find second password?
//            chrome.findElement(By.cssSelector("html body form[id='frm2'] input[id='frm1_pwd_id']")).sendKeys("aaaaaaaaaaaa");

//            ===========Relative cssSelector====================
//            (a) using tagName
//            Q: Identify the first username?
//           chrome.findElement(By.cssSelector("input")).sendKeys("aaaaaaaaaaaa");

//            (b) using attribute name and value
//            syntax:
//            <tagName>[<attrName>='<attrVal>']
//            Q: Identify the first username?
//            chrome.findElement(By.cssSelector("input[id = 'frm1_un_id']")).sendKeys("aaaaaaaaaaaa");

//            (c) using more than one attribute name and value
//            syntax:
//            <tagName>[<attrName>='<attrVal>'][<attrName>='<attrVal>']
//            Q: Identify the first username?
//           chrome.findElement(By.cssSelector("input[id='frm1_un_id'][name='frm1_un_name']")).sendKeys("aaaaaaaaaaaa");
//           chrome.findElement(By.cssSelector("input[type = 'text'][id='frm1_un_id']")).sendKeys("aaaaaaaaaaaa");
            //do using name and type................

//            (d) using not logical operator
//            Q: find the link which doesnot have target attribute?

//            chrome.findElement(By.cssSelector("a:not([target])")).click();

//            cssSelector with Partial Match
//            (a) ^ (starts-with):
//            Q: Enter first username value?
//            Ans:
//            <tagName>[<attrName>^=<attrValue>
//            chrome.findElement(By.cssSelector("input[id^='frm1_un_i']")).sendKeys("aaaaaaaaaaaa");

//            (b) $ (ends-with)
//            Q: Enter first username value?
//            chrome.findElement(By.cssSelector("input[id$='1_un_id']")).sendKeys("aaaaaaaaaaaa");

//            (c) * (contains)
//            Q: Enter first username value?
//            chrome.findElement(By.cssSelector("input[id*='_un_id']")).sendKeys("aaaaaaaaaaaa");

//            (f) using regualr expression
//            Q: Identify the first username?
//           chrome.findElement(By.cssSelector("*[id='frm1_un_id']")).sendKeys("aaaaaaaaaaaa");

//            (g) using parnt hierarchy
//            Q: Identify the first username?
            chrome.findElement(By.cssSelector("form[id='frm1_un_id']>input[id = 'frm1_un_id']")).sendKeys("aaaaaaaaaaaa");
            chrome.findElement(By.cssSelector("")).sendKeys("aaaaaaaaaaaa");
            chrome.findElement(By.cssSelector("")).sendKeys("aaaaaaaaaaaa");
            chrome.findElement(By.cssSelector("")).sendKeys("aaaaaaaaaaaa");
            chrome.findElement(By.cssSelector("")).sendKeys("aaaaaaaaaaaa");



            //Thread.sleep(2000);
            //chrome.close();
        }catch(Exception e){
            e.printStackTrace();
        }




    }
}
