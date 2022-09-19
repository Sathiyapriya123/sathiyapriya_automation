package mobilesworld;

import java.util.Set;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;






public class contactus {
    @Test(dataProvider="contactus")
    public void Contactus(String cusername,String cemail,String cphone,String cmessage) throws Exception
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sathiyapriya.s\\Downloads\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         
         contactuslandingpage cpage = new contactuslandingpage(driver);
         cpage.goTo();
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);





       driver.manage().window().maximize();
         cpage.supdrop().click();
         Thread.sleep(1000);
         cpage.contdrop().click();
         Thread.sleep(1000);
         Set<String> id = driver.getWindowHandles();
         java.util.Iterator<String> it = id.iterator();
         String parentId = it.next();
         String childId = it.next();
         driver.switchTo().window(childId);
         driver.manage().window().maximize();
         cpage.cuname().sendKeys(cusername);
         Thread.sleep(1000);
         cpage.cmail().sendKeys(cemail);
         Thread.sleep(1000);
         cpage.cphn().sendKeys(cphone);
         cpage.cmsg().sendKeys(cmessage);
         Thread.sleep(1000);
         cpage.sd().click();   
         driver.close();
    }     
         @DataProvider(name="contactus")
         public Object[][] getdata()
         {
             Object [][] data=new Object[1][4];
              data [0][0]="sathiyapriya";
              data [0][1]="sathiya123@gmail.com";
              data [0][2]="9885889124";
              data [0][3]="Hello";
              return data;
             
            }
}