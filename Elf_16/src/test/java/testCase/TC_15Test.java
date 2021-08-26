package testCase;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pom_Repository.ContactsPage;
import pom_Repository.CreatingNewContactPage;
import pom_Repository.EditingContactInformationPage;

public class TC_15Test extends BaseClass {
ContactsPage contactsPage;
EditingContactInformationPage editingContactInformationPage;
CreatingNewContactPage creatingNewContactPage;
	@Test
	public void EditContact() {
		contactsPage=new ContactsPage(driver);
		creatingNewContactPage=new CreatingNewContactPage(driver);
		editingContactInformationPage=new EditingContactInformationPage(driver);
		
		//Select  contacts and edit it
		contactsPage.getSelectedCheckBox().click();
		contactsPage.getEditLink().click();
		editingContactInformationPage.getEditLastNameTetFeild().clear();
		editingContactInformationPage.getEditLastNameTetFeild().sendKeys("piyush");
		
		//save it and check again in contacts list page
	    creatingNewContactPage.getSaveButton().click();
		
	}
}
