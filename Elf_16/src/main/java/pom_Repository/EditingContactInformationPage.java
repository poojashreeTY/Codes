package pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditingContactInformationPage {

	public EditingContactInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Edit last name textfeild
	@FindBy(xpath="//input[@name='lastname']") private WebElement editLastNameTetFeild;

	public WebElement getEditLastNameTetFeild() {
		return editLastNameTetFeild;
	}
	
	
}
