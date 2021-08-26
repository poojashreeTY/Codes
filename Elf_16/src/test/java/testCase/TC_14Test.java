package testCase;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pom_Repository.ContactsPage;

public class TC_14Test extends BaseClass {
    ContactsPage contactspage;
    Alert alert;
	@Test
	public void DeleteContact() throws InterruptedException {
		//Select  contacts and delete it
		contactspage=new ContactsPage(driver);
		contactspage.getSelectedCheckBox().click();
		Thread.sleep(2000);
		contactspage.getDeleteButton().click();
		alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		
		
		
	}
}
