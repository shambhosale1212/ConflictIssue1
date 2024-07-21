package Steps;

import Baselayer.BaseClass;
import Pagelayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest extends  BaseClass {
	
	public static LoginPage LoginPage;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		BaseClass.initialization();

	}

	@When("user enter valid credentials")
	public void user_enter_valid_credentials() {
		
		LoginPage= new LoginPage();
		LoginPage.loginpageFun("Admin", "admin123");
	    
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {

		LoginPage.clickLogin();
	}

}
