package pSeleniumProject;

import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
    public static void main(String[] args) {
        RelativeXpath();
    }
    public static void RelativeXpath(){
        ChromeDriver chrome = null;
    try{
        chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.navigate().to("file:///D:/HTML/SampleWebProject.html");

        //===========Relative xpath========================
        //(a1) using tagName
        //chrome.findElement(By.xpath("//input")).sendKeys("aaaaaaaaaaaaaa");

        //(b2) using password
        //chrome.findElement(By.xpath("//input[2]")).sendKeys("bbbbbbbbbbb");

        //(c3) first link
        //chrome.findElement(By.xpath("//a")).click();

        //(b4) using attribute name and value
        //syntax : //<tagName>[@attribute = value]
        //Q: Enter value for first username?
        //chrome.findElement(By.xpath("//input[@id = 'frm1_un_id']")).sendKeys("cccccccc");
        //chrome.findElement(By.xpath("//input[@name='frm1_un_name']")).sendKeys("bbbbbbbbb");
        //chrome.findElement(By.xpath("//input[@placeholder = 'Enter UserName']")).sendKeys("cccccccc");

        //(c5) using more than one attribute name and value
        //Synatx: //<tagName>[@AttributeName = Value]
        //Q: Enter value for first username?
        //chrome.findElement(By.xpath("//input[@id = 'frm1_un_id'][@name = 'frm1_un_name']")).sendKeys("dddddddddddd");
        //chrome.findElement(By.xpath("//input[@type='text'][@id = 'frm1_un_id']")).sendKeys("eeeeeeeeee");
        //chrome.findElement(By.xpath("//input[@class = 'frm1_un_class'][@placeholder = 'Enter UserName']]")).sendKeys("ffffffff");

        //(d6) using and logical operator
        //syntax: //tagName[@<attributeName> = <'value'> and <@attributeName> = <'value'>]
       // Q: Enter value for first username?
        //chrome.findElement(By.xpath("//input[@type='text' and  @id='frm1_un_id']")).sendKeys("ffffffff");

        //(e7) using or logical operator
        //syntax: //<tagName>[@<attrName>='<attrValue>' or @<attrName>='<attrValue>']
        //Q: Enter value for first username?
       // chrome.findElement(By.xpath("//input[@type='text' or  @id='frm1_un_id']")).sendKeys("ffffffff");

        //(f8) using not logical operator
        //Q: Find the link which doesnot have target attribute?
        //Syntax: //<tagName>[not@<attrName> = <'value'>]
        //chrome.findElement(By.xpath("//a[not(@target)]")).click();

        //(g9) using text() method
        //Q: find header, paragraph and lin using text method?
        //String text = chrome.findElement(By.xpath("//h2[text() = 'Header Two']")).getText();
        //System.out.println(text);

//       String text = chrome.findElement(By.xpath("//h3[text() = 'Header Three']")).getText();
//       System.out.println(text);

        //String text = chrome.findElement(By.xpath("//h3[text() = 'Header Three']")).getText();
        //System.out.println(text);

        //String text = chrome.findElement(By.xpath("//pre[text() = 'Sample paragraphs Three']")).getText();
        //System.out.println(text);

//        (h) using index
//
//        Q: identify the user name using index?
//        Ans:
//        without index:
        //chrome.findElement(By.xpath("(//input[@id = 'frm1_un_id'])")).sendKeys("Harshitha");
        //chrome.findElement(By.xpath("(//input[@id='frm1_un_id'])[1]")).sendKeys("aaaaaaaaaa");
        //Q: identify the user name using index?
        //chrome.findElement(By.xpath("//input[@name = 'frm1_pwd_name']")).sendKeys("vvvvvvv");

        //with index:
        //chrome.findElement(By.xpath("//input[@name = 'frm1_un_name'][1]")).sendKeys("aaaaaaaaaa");

        //Absolute Xpath
//        chrome.findElement(By.xpath("/html/body/form[@id = 'frm1']/input[1]")).sendKeys("aaaaa");
//        chrome.findElement(By.xpath("(/html/body/form/input[1])[1]")).sendKeys("aaaaa");
//        chrome.findElement(By.xpath("(/html/body/form/index[1])")).sendKeys("aaaaa");

        //partial matches
        //(1) starts-with()
        //[tagName][starts-with(@<attName>, <const strting value>)]
        //chrome.findElement(By.xpath("//input[starts-with(@id, 'frm1_un_i')]"));

        //(2) ends-with()
        //chrome.findElement(By.xpath("//input[ends-with(@id, 'm1_un_id')]"));

        //(3) contains()
        //chrome.findElement(By.xpath("//input[contains(@name, '_un_')] ")).sendKeys("aaaaaaa");
        //chrome.findElement(By.xpath("//input[contains(@class, '_un_')] ")).sendKeys("aaaaaaa");


        Thread.sleep(2000);
    }catch(Exception e){
        e.printStackTrace();
    }
    }


}
