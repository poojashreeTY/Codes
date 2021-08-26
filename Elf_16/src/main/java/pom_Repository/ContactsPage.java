package pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Create Contact Link
	@FindBy(xpath="//img[@title='Create Contact...']") private WebElement createContactLink;
	
	//Selected Check Box
	@FindBy(xpath="(//input[@name='selected_id'])[1]") private WebElement selectedCheckBox;
	
	//SelectAll Check Box
	@FindBy(xpath="//input[@name='selectall']") private WebElement selectAllCheckBox;
	
	public WebElement getSelectAllCheckBox() {
		return selectAllCheckBox;
	}

	//Delete Button
	@FindBy(xpath="//tr[1]/td/table[2]/tbody/tr/td/input[1]") private WebElement deleteButton;
	
	//Edit Link
	@FindBy(xpath="//*[@id=\"row_21\"]/td[10]/a[1]") private WebElement editLink;

	public WebElement getEditLink() {
		return editLink;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public WebElement getSelectedCheckBox() {
		return selectedCheckBox;
	}

	public WebElement getCreateContactLink() {
		return createContactLink;
	}
	
	
}
