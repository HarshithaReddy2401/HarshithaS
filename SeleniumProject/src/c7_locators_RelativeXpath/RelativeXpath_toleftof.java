package c7_locators_RelativeXpath;

import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath_toleftof {
    public static void main(String[] args) {
        xpath_toLeftOf();
    }
    public static void xpath_toLeftOf(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///D:/HTML/SampleWebProject.html");
            chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");

//            RelativeLocator class:
//            (a) toLeftOf()
//
//            Q: Identify the username by traversing left direction from the password element.
//            chrome.findElement(RelativeLocator.
//                    with(By.tagName("input"))
//                    .toLeftOf(By.xpath("//input[@id='frm1_pwd_id']"))).sendKeys("aaaaaaaaa");

            //(b) toRightOf()
            //Q: Identify the username by traversing left direction from the password element
//            chrome.findElement(RelativeLocator.
//                    with(By.tagName("input"))
//                    .toRightOf(By.xpath("//input[@id='frm1_un_id']"))).sendKeys("aaaaaaaaa");
//            Thread.sleep(2000);

//            chrome.findElement(RelativeLocator.
//                   with(By.tagName("input")).
//                    above(By.xpath("//input[@id='frm1_ok_id']"))).sendKeys("aaaaaaaaa");

//           chrome.findElement(RelativeLocator.
//                    with(By.tagName("input")).
//                    below(By.xpath("//input[@id='frm1_ok_id']"))).click;

//            chrome.findElement(RelativeLocator.
//                            with(By.tagName("input")).
//                            near(By.xpath("//input[@id='frm1_ok_id']"))).sendKeys("aaaaaaaaa");

//            chrome.findElement(RelativeLocator.
//                            with(By.tagName("input")).
//                            near(By.xpath("//input[@id='frm1_ok_id']"))).sendKeys("aaaaaaaaa");


            chrome.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            chrome = null;
        }
    }

}
