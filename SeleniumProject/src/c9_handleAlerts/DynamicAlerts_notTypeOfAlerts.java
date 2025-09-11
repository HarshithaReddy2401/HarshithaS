package c9_handleAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicAlerts_notTypeOfAlerts {
    public static void main(String[] args) {
        handleDynamicAlert();
    }
    //Dynamic Alerts
    public static void handleDynamicAlert(){
        WebDriver oBrowser = null;
        try{
            oBrowser = new ChromeDriver();
            oBrowser.manage().window().maximize();

            oBrowser.navigate().to("file:///D:/Javascript_Alerts.html");
            Thread.sleep(2000);

            //Click the 'alertBtn'
            oBrowser.findElement(By.xpath("//input[@id='btn_id1']")).click();
            if(isAlertPresent(oBrowser) == true){
                Thread.sleep(1000);

                Alert oAlert = oBrowser.switchTo().alert();
                System.out.println(oAlert.getText());
                oAlert.accept();
            }else{
                System.out.println("No alert is present at this time");
            }
            Thread.sleep(2000);
            oBrowser.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            oBrowser = null;
        }
    }
    public static boolean isAlertPresent(WebDriver oBrowser){
        try{
            oBrowser.switchTo().alert();
            return true;
        }catch(NoAlertPresentException e){
            return false;
        }
    }
}
