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
public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//User Name TextFeild
	@FindBy(name="user_name") private WebElement userNameTextFeild;
	
	//Password TextFeild
	@FindBy(name="user_password") private WebElement passwordTextFeild;
	
	//Login Button
	@FindBy(id="submitButton") private WebElement LoginButton;

	public WebElement getUserNameTextFeild() {
		return userNameTextFeild;
	}

	public WebElement getPasswordTextFeild() {
		return passwordTextFeild;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	
}
