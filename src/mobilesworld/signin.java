package mobilesworld;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class signin {
     @Test(dataProvider="login")//LOGIN
        public void sign(String username,String Password) throws Exception
        {
        
           System.setProperty("webdriver.chrome.driver","C:\\Users\\sathiyapriya.s\\Downloads\\chromedriver_win32\\chromedriver.exe");
           WebDriver driver = new ChromeDriver();
                 
              signinlandingpage page=new signinlandingpage(driver);
              page.goTo();
              page.signin.click();
              Thread.sleep(2000);
              page.username.sendKeys(username);
              Thread.sleep(2000);
              page.password.sendKeys(Password);
              Thread.sleep(2000);
              page.loginbutton.click();
              driver.close();
        }
        @DataProvider(name="login")
        public Object[][] getdata()
        {
            Object [][] data=new Object[4][2];
          data [0][0]="sathiyapriya";
          data [0][1]="sathiya@123";
          data [1][0]="ab";
          data [1][1]="6929f1";
          data [2][0]="abcdefghijklmnopqrstu";
          data [2][1]="tcr@123456";
          data [3][0]=" ";
          data [3][1]="A123456789";

       return data;
        }
}