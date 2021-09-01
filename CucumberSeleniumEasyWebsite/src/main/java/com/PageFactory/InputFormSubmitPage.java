package com.PageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;

public class InputFormSubmitPage 
{
	private BaseTest objBaseTest;
	public boolean blnFlag = false;
	/**
	 * Description:Created constructor and passed BaseTest class reference so that we can access all 
	 * methods of basetest
	 * @param :baseTest
	 */
	public InputFormSubmitPage(BaseTest  baseTest) 
	{
		this.objBaseTest = baseTest;
	}
	/**
	 * Description: Locators of Input Form Submit page
	 */
	By loc_InputFromSubmitPageHeader = By.xpath("//h2[text()='Input form with validations']");
	By loc_FirstName = By.xpath("//input[@name='first_name']");
	By loc_LastName = By.xpath("//input[@name='last_name']");
	By loc_EmailAddress = By.xpath("//input[@name='email']");

	
	public void verifyInputFormSubmitPageHeaderIsDisplayed() 
	{
		Assert.assertEquals(objBaseTest.getObjWrapperFunctions().checkIfElementIsDisplayed(loc_InputFromSubmitPageHeader), true);
	}
	public void verifyFirstNameFieldIsEmpty() 
	{
		Assert.assertTrue(objBaseTest.getObjWrapperFunctions().checkIfFieldIsEmpty(loc_FirstName));
	}
	public void setFirstName(String strFirstName) 
	{
		objBaseTest.getDriver().findElement(loc_FirstName).sendKeys(strFirstName);
	}
	public void verifyLastNameFieldIsEmpty() 
	{
		Assert.assertTrue(objBaseTest.getObjWrapperFunctions().checkIfFieldIsEmpty(loc_LastName));
	}
	public void setLastName(String strLastName) 
	{
		objBaseTest.getDriver().findElement(loc_LastName).sendKeys(strLastName);
	}
	public void verifyEmailAddressFieldIsEmpty() 
	{
		Assert.assertTrue(objBaseTest.getObjWrapperFunctions().checkIfFieldIsEmpty(loc_EmailAddress));
	}
	public void setEmailAddress(String strEmailAddress) 
	{
		objBaseTest.getDriver().findElement(loc_EmailAddress).sendKeys(strEmailAddress);
	}
}
