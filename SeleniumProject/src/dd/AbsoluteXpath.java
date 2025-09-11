package dd;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
    public static void main(String[] args){
        AbsoluteXpath1();
    }
    public static void AbsoluteXpath1(){
        ChromeDriver chrome = null;
    try{
        chrome = new ChromeDriver();
        chrome.manage().window().maximize();

        chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");
        //Q: Using AX find first password?

        //chrome.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("aaaaaaaaaaaaaaaa");
       // chrome.findElement(By.xpath("/html/body/form[1]/input[2]")).sendKeys("bbbbbbbbbbb");
       // chrome.findElement(By.xpath("/html/body/form[@id = 'frm1']/input[2]")).sendKeys("ccccccccccc");
       // chrome.findElement(By.xpath("/html/body/form[@id='frm1']/input[@id='frm1_pwd_id']")).sendKeys("ddddddddddddddddddddd");

        //Q: Using AX find second username?
        //chrome.findElement(By.xpath("/html/body/form[2]/input[1]")).sendKeys("aaaaaaaaaaaaa");
        //chrome.findElement(By.xpath("/html/body/form[@id = 'frm2']/input[1]")).sendKeys("bbbbbbbbbbbb");
        //chrome.findElement(By.xpath("/html/body/form[@id = 'frm2']/input[@id = 'frm1_un_id']")).sendKeys("aaaaaaaaaaaa");

        // Using AX find second password?
        //chrome.findElement(By.xpath("/html/body/form[2]/input[2]")).sendKeys();
        //chrome.findElement(By.xpath("/html/body/form[@id = 'frm2']/input[@id = 'frm1_pwd_id']")).sendKeys();

        //Q: Using AX find the second link?
        //chrome.findElement(By.xpath("/html/body/a[2]")).click();
        //chrome.findElement(By.xpath("/html/body/a[@id = 'link2_id']")).click();
        //chrome.findElement(By.xpath("/html/body/a[@name='link2_name']")).click();


        Thread.sleep(2000);

        //chrome.close();

    }catch(Exception e){
        e.printStackTrace();
    }
    }
}
