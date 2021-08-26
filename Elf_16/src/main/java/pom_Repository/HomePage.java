package pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*** 
 * 
 * @author B
 *
 */
public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Contacts Link
	@FindBy(xpath="//a[.='Contacts']") private WebElement contactsLink;
	
	//Logout  Image
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']") private WebElement logoutImage;
	
	//Logout Link
	@FindBy(xpath="//a[.='Sign Out']") private WebElement logoutLink;

	public WebElement getContactsLink() {
		return contactsLink;
	}

	public WebElement getLogoutImage() {
		return logoutImage;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	
}
