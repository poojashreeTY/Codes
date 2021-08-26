package testCase;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pom_Repository.ContactsPage;

public class TC_13Test extends BaseClass{
	ContactsPage contactPage;
	Alert alert;
	@Test
	public void DeleteContact() {
		// Select  contacts and edit it
		contactPage=new ContactsPage(driver);
		contactPage.getSelectAllCheckBox().click();
		contactPage.getDeleteButton().click();
		alert=driver.switchTo().alert();
		alert.accept();
	}

}
