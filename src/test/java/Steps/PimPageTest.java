package Steps;

import Baselayer.BaseClass;
import Pagelayer.PimPage;
import io.cucumber.java.en.When;

public class PimPageTest extends BaseClass{
	public static PimPage pimPage;
	@When("user click on pim link")
	public void user_click_on_pim_link() {
		
		 pimPage  = new PimPage();
		 pimPage.clickonPim();
	   
	}

	@When("user click on add  button")
	public void user_click_on_add_button() {
		 pimPage.clickOnAddEmploy();
	   
	}

}
