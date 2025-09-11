package dd;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Axis {
    public static void main(String[] args) {
        Xpath_Axis();
    }
    public static void Xpath_Axis() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");
            chrome.navigate().to("file:///D:/HTML/SampleWebTable.html");
            Thread.sleep(2000);

//            Xpath Axis:
//            (a) following-sibling: It travels in forward direction within one row OR within next level.
//            Q: Identify the password by starting from username?
           // chrome.findElement(By.xpath("//input[@id = 'frm1_un_id']/following-sibling::input[1]")).sendKeys("aaaaaaaaaaaaa");

            //Q: Identify the designation for 'Abdul Kalam'?
//            String text = chrome.findElement(By.xpath("//td[text() = 'Abdul Kalam']/following-sibling::td[1]")).getText();
//            System.out.println(text);

//            Xpath Axis:
//            (2) following: It travels in forward direction within one row or many rows OR multiple levels.
//            The following can acts as following-sibling & following.
//             Q: Identify the password by starting from username?
               // chrome.findElement(By.xpath("//input[@id = 'frm1_un_id']/following::input[1]")).sendKeys("aaaaaaaaaaaaa");

            //Q: Identify the username by strting from the <pre> paragraph four and move down direction?
            ///chrome.findElement(By.xpath("//pre[contains(text(),'Three')]/following::input[1]")).sendKeys("aaaaaaaaaaaaa");

            //Q: Indetify the person name who is next to 'Abdul Kalam'?
            String text = chrome.findElement(By.xpath("//td[text() = 'Abdul Kalam']/following-sibling::td[1]")).getText();
            System.out.println(text);

            Thread.sleep(2000);
            //chrome.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
