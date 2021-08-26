package pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContactPage {
    public WebDriver driver;
	public CreatingNewContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//LastName TextFeild
	@FindBy(name="lastname") private WebElement lastNameTextFeild;
	
	//Assigned To Group Radio Button
	@FindBy(xpath="//input[@name='assigntype'and @value='T']") private WebElement groupRadioButton;
	
	//Marketing Group Dropdown
	@FindBy(xpath="//select[@name='assigned_group_id']") private WebElement marketingGroupDropdown;
	
	//Save Button
	@FindBy(xpath="//tbody/tr[1]/td/div/input[1]") private WebElement saveButton;

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getGroupRadioButton() {
		return groupRadioButton;
	}

	public WebElement getMarketingGroupDropdown() {
		return marketingGroupDropdown;
	}

	public WebElement getLastNameTextFeild() {
		return lastNameTextFeild;
	}
	
}
