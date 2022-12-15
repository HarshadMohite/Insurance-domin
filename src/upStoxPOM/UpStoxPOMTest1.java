package upStoxPOM;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpStoxPOMTest1 {

	public static <UpStoxHomPage> void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Software Testing class\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://login-v2.upstox.com");
        Thread.sleep(2000);
//        
//        File myfile=new File("C:\\Software Testing class\\MyBooK1.xlsx");
//      Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
//       String un = mySheet.getRow(0).getCell(0).getStringCellValue();
//       
//      String pwd = mySheet.getRow(0).getCell(1).getStringCellValue();
//     
//     String pCode = mySheet.getRow(0).getCell(2).getStringCellValue();
//     
      
     //Create object of login page
        UpStoxLoginPage login=new UpStoxLoginPage(driver);
        login.enterUserId();
        login.enterPassword();
        login.clickOnSignInButton();
        
        Thread.sleep(5000);
        
        //Create object of Passcode page
        UpStoxPasscodePage passcode=new UpStoxPasscodePage(driver);
        passcode.enderPasscode();
   
        Thread.sleep(14000);
 
        //Create object of Welcome page
        UpstoxWelcomePage welcomePage=new  UpstoxWelcomePage(driver);
        welcomePage.clickOnNoImGoodButton();
        
        Thread.sleep(3000);
 
        //Create object of HomePage
        UpStoxHomePage homePage=new UpStoxHomePage(driver);
        homePage.validateUserId();
        homePage.clickOnFundButton();
        
        Thread.sleep(6000);

        
        //Create object of FundsPage
        UpStoxFundsPage fund=new UpStoxFundsPage(driver);
        fund.getMyFund();
        
        Thread.sleep(5000);

        homePage.logOut();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
