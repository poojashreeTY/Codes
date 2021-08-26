package testCase;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pom_Repository.ContactsPage;
import pom_Repository.CreatingNewContactPage;

public class TC_12Test extends BaseClass {
    CreatingNewContactPage creatingNewContactPage;
    Select select;
    ContactsPage contactsPage;
	@Test
	public void createContact() {
		creatingNewContactPage=new CreatingNewContactPage(driver);
		contactsPage=new ContactsPage(driver);
		contactsPage.getCreateContactLink().click();
		creatingNewContactPage.getLastNameTextFeild().sendKeys(" piyush11");
		creatingNewContactPage.getGroupRadioButton().click();
		select=new Select(creatingNewContactPage.getMarketingGroupDropdown());
		select.selectByVisibleText("Team Selling");
		creatingNewContactPage.getSaveButton().click();
		
	}
}
