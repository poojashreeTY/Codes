package genericLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pom_Repository.HomePage;
import pom_Repository.LoginPage;

public class BaseClass implements IAutoContants {
        
	    public  WebDriver driver;
	    LoginPage loginPage;
	    HomePage homePage;
		@BeforeClass
		//Lauching the Broswer
		public void preCondition() {
	    System.setProperty(CHROME_KEY, CHROME_PATH);
	    driver=new ChromeDriver(); 
	    System.out.println("Broswer Launched Successfuly");
	    driver.manage().window().maximize();
	    System.out.println("Window is maximized");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    //Navigating URL
	    driver.get(DEFAULT_URL);
	    Assert.assertEquals(driver.getCurrentUrl(),DEFAULT_URL, "URL is not Matching");
		}
	    
	    @BeforeMethod
	    //Login to App
	    public  void loginToApp() {
	    loginPage=new LoginPage(driver);
	    homePage=new HomePage(driver);
	    loginPage.getUserNameTextFeild().clear();
	    loginPage.getUserNameTextFeild().sendKeys(DEFAULT_USERNAME);
	    Assert.assertEquals(loginPage.getUserNameTextFeild().getAttribute("value"),DEFAULT_USERNAME, "User Name is not Matching");
	    loginPage.getPasswordTextFeild().clear();
	    loginPage.getPasswordTextFeild().sendKeys(DEFAULT_PASSWORD);
	    Assert.assertEquals(loginPage.getPasswordTextFeild().getAttribute("value"), DEFAULT_PASSWORD, "Password is not Matching");
	    loginPage.getLoginButton().click();
	    String expectedHomePageURL="http://localhost:8888/index.php?action=index&module=Home";
	    Assert.assertEquals(driver.getCurrentUrl(),expectedHomePageURL, "Home page is not Displayed");
	    
	    //Place the mouse cursor and click on "Contact" Link
        homePage.getContactsLink().click();        
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:8888/index.php?module=Contacts&action=index" , "Contact List page is not display");	
		}
	    
	    @AfterMethod
	    public void logoutApp() throws InterruptedException {
	    homePage.getLogoutImage().click();
	    homePage.getLogoutLink().click();
	   
	   	    }
	    
	    @AfterClass
	    public void postCondition() throws InterruptedException {
	    	Thread.sleep(2000);
	        driver.close();
	    }
	    
}
		
