package dd;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException;

public class HSDynamicAlerts {
    public static void main(String[] args) {
        dynamicAlerts();
    }
    //Dynamic Alerts
    public static void dynamicAlerts(){
        WebDriver oBrowser = null;
        try{
            oBrowser = new ChromeDriver();
            oBrowser.manage().window().maximize();

            oBrowser.navigate().to("file:///D:/Javascript_Alerts.html");
            oBrowser.findElement(By.xpath("//input[@id='btn_id1']")).click();
            if(isAlertPresent(oBrowser)==true){
                Thread.sleep(2000);
                Alert oalert = oBrowser.switchTo().alert();
                System.out.println(oalert.getText());
                oalert.accept();
            }else{
                System.out.println("No alert present at that time");
            }
            Thread.sleep(2000);
            oBrowser.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            oBrowser = null;
        }
    }
    private static boolean isAlertPresent(WebDriver oBrowser) {
        try {
            oBrowser.switchTo().alert();
            return true;
        } catch(NoAlertPresentException e) {
            return false;
        }
    }

}
