package mobilesworld;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class signup {





  @Test(dataProvider="signup") //SIGNUP
    public void sign(String Firstname,String Lastname,String Email,String password,String date,String phonenumber,String shortbio) throws Exception
    {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\sathiyapriya.s\\Downloads\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       
       signuplandingpage page= new signuplandingpage(driver);
       page.goTo();
       Thread.sleep(2000);
       page.signin().click();;
       Thread.sleep(2000);
       page.signup().click();;
       Thread.sleep(2000);
       page.FirstName().sendKeys(Firstname);
       Thread.sleep(2000);
       page.LastName().sendKeys(Lastname);
       Thread.sleep(2000);
       page.Email().sendKeys(Email);
       Thread.sleep(2000);
       page.Password().sendKeys(password);
       Thread.sleep(2000);
       page.date().sendKeys(date);
       Thread.sleep(2000);
       page.gender().click();
       Thread.sleep(2000);
       page.phonenumber().sendKeys(phonenumber);
       Thread.sleep(2000);
       page.shortbio().sendKeys(shortbio);
       Thread.sleep(2000);
       page.register().click();
      }
   @DataProvider(name="signup")
   public Object[][] getdata()
   {
       Object [][] data=new Object[1][7];
       data [0][0]="sathiyapriya";
       data [0][1]="priya";
       data [0][2]="sathiya@123";
       data [0][3]="pqaws12";
       data [0][4]="08/10/2001";
       data [0][5]="9858207292";
       data [0][6]="Okay";
       
//       data [1][0]="Re";
//       data [1][1]="Shaha";
//       data [1][2]="rrs@123";
//       data [1][3]="764t35";
//       data [1][4]="20/08/2000";
//       data[1][5]="9876543314";
//       data[1][6]="Ok";
       return data;
       
}
}       

