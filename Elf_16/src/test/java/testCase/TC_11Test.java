package testCase;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pom_Repository.ContactsPage;
import pom_Repository.CreatingNewContactPage;

public class TC_11Test extends BaseClass{
    ContactsPage contactsPage;
    CreatingNewContactPage creatingNewContactpage;
    Select select;
	@Test
	//createContact
	public void conditon() throws InterruptedException {
		//Navigate to create new Contact page by click on "+" image
		contactsPage=new ContactsPage(driver);
		contactsPage.getCreateContactLink().click();
		Thread.sleep(2000);
		
		//Create a contact with mandatory fields and select assigned to "Group" as a "Support group" form dropdown and save
		creatingNewContactpage =new CreatingNewContactPage(driver);
		creatingNewContactpage.getLastNameTextFeild().sendKeys("piyush1");
		creatingNewContactpage.getGroupRadioButton().click();
		select=new Select(creatingNewContactpage.getMarketingGroupDropdown());
		select.selectByVisibleText("Support Group");
	    creatingNewContactpage.getSaveButton().click();
		
	}
}

