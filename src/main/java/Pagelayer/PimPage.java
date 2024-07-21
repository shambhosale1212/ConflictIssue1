package Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselayer.BaseClass;

public class PimPage extends BaseClass {
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pim;

	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement addEmploy;

	public PimPage()
	{
		PageFactory.initElements(driver, this);
	}

	public void clickonPim()
	{
		pim.click();
	}

	public void clickOnAddEmploy()
	{
		addEmploy.click();
	}


}
