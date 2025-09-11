package dd;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HSHandleAlerts {
    public static void main(String[] args) {
        //handleStaticAlerts();
        //handleStaticConfirmAlerts();
        promptHandling();
    }
    //1.Handle Static Alerts
    public static void handleStaticAlerts() {
        WebDriver oBrowser = null;
        try {
            oBrowser = new ChromeDriver();
            oBrowser.manage().window().maximize();

            oBrowser.navigate().to("file:///D:/Javascript_Alerts.html");
            Thread.sleep(2000);

            oBrowser.findElement(By.xpath("//input[@id='btn_id1']")).click();
            Thread.sleep(2000);
            Alert oalert = oBrowser.switchTo().alert();
            System.out.println(oalert.getText());
            oalert.accept();
            Thread.sleep(2000);

            oBrowser.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            oBrowser=null;
        }
    }

    //2. Static confirm alert handling
    public static void handleStaticConfirmAlerts(){
        WebDriver oBrowser = null;
        try{
            //1.memory allocate
            oBrowser = new ChromeDriver();
            //2.open browser and maximize.
            oBrowser.manage().window().maximize();
            //3.Navigate to url
            oBrowser.navigate().to("file:///D:/Javascript_Alerts.html");
            Thread.sleep(2000);
            //4.findElement and click
            oBrowser.findElement(By.xpath("//input[@id = 'btn_id2']")).click();
            Thread.sleep(2000);
            //5.click on accept Button
            Alert oalert = oBrowser.switchTo().alert();
            System.out.println(oalert.getText());
            oalert.accept();
            Thread.sleep(2000);
            //6.After accepting we get text now Verify if we really get Text
            if(oBrowser.findElement(By.xpath("//body")).getText().equals("User clicked OK button")){
                System.out.println("User clicked OK button");
            }else{
                System.out.println("Failed to click OK button");
            }
            //7.Now go back to previous page
            oBrowser.navigate().refresh();
            Thread.sleep(2000);
            //8.Click on confirm button
            oBrowser.findElement(By.xpath("//input[@id='btn_id2']")).click();
            Thread.sleep(2000);
            //9.switch to alert and getText() and dismiss
            oalert = oBrowser.switchTo().alert();
            System.out.println(oalert.getText());
            oalert.dismiss();
            Thread.sleep(2000);
            //10.verify if we really getText of CANCEL button
            if(oBrowser.findElement(By.xpath("//body")).getText().equals("User clicked cancel button")){
                System.out.println("User clicked CANCEL button");
            }else{
                System.out.println("Failed to click CANCEL button");
            }
            Thread.sleep(2000);


            oBrowser.quit();
        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            oBrowser=null;
        }
    }

    //3.Static prompt alert handling
    public static void promptHandling(){
        WebDriver oBrowser = null;
        String userName[] = {"Arjun","Bhima","Chanakya", "Bhima"};
        try{
            oBrowser = new ChromeDriver();
            //1.open chrome Browser
            oBrowser.manage().window().maximize();
            //2.navigate to url
            oBrowser.navigate().to("file:///D:/Javascript_Alerts.html");
            //3.FindElement and click on Prompt button and wait
            for(int i=0;i< userName.length;i++) {
                oBrowser.findElement(By.xpath("//input[@id='btn_id3']")).click();
                Thread.sleep(2000);
                //4.SwitchTo alert
                Alert oalert = oBrowser.switchTo().alert();
                System.out.println(oalert.getText());
                oalert.sendKeys(userName[i]);
                Thread.sleep(2000);
                oalert.accept();
                Thread.sleep(2000);
                //5.verify if user clicked the OK button
                if (oBrowser.findElement(By.xpath("//body")).getText().equals("User Name is: " +userName[i])) {
                    System.out.println("User name entered and clicked OK button");
                } else {
                    System.out.println("Failed to enter the username and clicked OK button");
                }
                //6.Back to page
                oBrowser.navigate().refresh();
                Thread.sleep(2000);
            }
            //7.Click on PromptBtn and CANCEL
            oBrowser.findElement(By.xpath("//input[@id='btn_id3']")).click();
            Alert oalert = oBrowser.switchTo().alert();
            System.out.println(oalert.getText());
            oalert.dismiss();
            //7.verify if the dismiss happened and check it
            if(oBrowser.findElement(By.xpath("//body")).getText().equals("User didn't enter any value for userName")){
                System.out.println("user name didn't entered and clicked CANCEL button");
            }
            else{
                System.out.println("Failed to enter the user name and clicked CANCEL");
            }
            Thread.sleep(2000);
            oBrowser.quit();
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            oBrowser=null;
        }
    }
}
