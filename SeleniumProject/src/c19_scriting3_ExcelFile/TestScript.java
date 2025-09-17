package c19_scriting3_ExcelFile;

import c19_scripting3_propFile.ReusableMethods;
import org.openqa.selenium.WebDriver;
import java.util.Map;

import static c19_scriting3_ExcelFile.ResusableMethods.getExcelData;


public class TestScript extends ReusableMethods {
    public static void main(String[] args) {
        TS_LoginLogout();
        TS_createAndDeleteUser();
    }

    public static void TS_LoginLogout() {
        WebDriver oBrowser = null;
        Map<String, String> data = null;
        try {
            data = getExcelData("TestData", "testData", "TC_ID_001");
            oBrowser = launchBrowser(data.get("browserName"));
            boolean blnRes = navigateURL(oBrowser, data.get("url"));
            blnRes = loginToApplication(oBrowser, data.get("userName") , data.get("password"));
            blnRes = logoutFromActiTime(oBrowser);

        } catch (Exception e) {
            System.out.println("Exception in 'TS_LoginLogout' test script");
        } finally {
            oBrowser.close();
            oBrowser = null;
        }
    }

    public static void TS_createAndDeleteUser() {
        WebDriver oBrowser = null;
        Map<String, String> data = null;
        try {
            data = getExcelData("TestData","testData","TC_ID_002");
            oBrowser = launchBrowser(data.get("browserName"));
            boolean blnRes = navigateURL(oBrowser, data.get("url"));
            blnRes = loginToApplication(oBrowser, data.get("userName") , data.get("password"));
            String userName = createUser(oBrowser, data);
            blnRes = deleteUser(oBrowser, userName);
            blnRes = logoutFromActiTime(oBrowser);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            oBrowser.close();
            oBrowser = null;
        }
    }
}

