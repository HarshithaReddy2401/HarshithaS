package c12_AutoIT_UploadResume;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoITAssignment {
    public static void main(String[] args) {
        autoIT();
    }
    public static void autoIT(){
        WebDriver oBrowser = null;
        Actions oAction = null;
        try{
            //1.Open browser and navigate to https://demoqa.com/upload-download
            oBrowser = new ChromeDriver();
            oBrowser.manage().window().maximize();

            oBrowser.navigate().to("https://demoqa.com/upload-download");
            Thread.sleep(2000);

            //2. Scroll down actions we chose Select a file
            oAction = new Actions(oBrowser);
            oAction.moveToElement(oBrowser.findElement(By.xpath("//label"))).perform();
            Thread.sleep(2000);

            //3. Click on Choose File
            oBrowser.findElement(By.xpath("//input[@id='uploadFile']")).click();
            Thread.sleep(2000);

            //4. Handle the Upload window component using autoIT
            Runtime.getRuntime().exec("D:\\Demo.exe");

        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            oBrowser = null;
            oAction = null;
        }
    }
}
