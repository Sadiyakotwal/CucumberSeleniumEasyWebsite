package com.PageFactory;

import java.util.concurrent.TimeUnit;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.generic.BaseTest;

public class SimpleFormDemoPage 
{
	private BaseTest objBaseTest;
	public boolean blnFlag = false;
	/**
	 * Description:Created constructor and passed BaseTest class reference so that we can access all 
	 * methods of basetest
	 * @param :baseTest
	 */
	public SimpleFormDemoPage(BaseTest  baseTestNew) 
	{
		this.objBaseTest = baseTestNew;
	}
	
	/**
	 * Description: Locators of Simple form Demo page
	 */
	By loc_SimpleFormDemoPageHeader = By.xpath("//h3[text()='This would be your first example to start with Selenium.']");
	By loc_SingleInputFieldHeader = By.xpath("//div[text()='Single Input Field']");
	By loc_singleInputFieldText = By.xpath("//div//label[text()='Your Message: ']/following-sibling::span[@id='display']");
	By loc_twoInputFieldHeader = By.xpath("//div[text()='Two Input Fields']");
	By loc_Enter_Value_A = By.xpath("//input[@id='sum1']");
	By loc_Enter_Value_B = By.xpath("//input[@id='sum2']");

	/**
	 * Description: To check if simple form demo page header is visible after selecting 
	 * the menu Input forms and drop down Simple from Demo
	 */
	public void verifySimpleFormDemoPageIsDisplayed() 
	{
		Assert.assertTrue(objBaseTest.getObjWrapperFunctions().checkIfElementIsDisplayed(loc_SimpleFormDemoPageHeader));
	}
	/**
	 * Description: To verify the header of Single Input field Section
	 */
	public void verifySingleInputFieldHeader() 
	{
		Assert.assertEquals((objBaseTest.getObjWrapperFunctions().checkIfElementIsDisplayed(loc_SingleInputFieldHeader)),true);
	}
	/**
	 *Description: To verify if the textbox field is empty or not
	 * @return: strValue
	 * 	This method returns the string value from the page of textbox field
	 */
	public String verifySingleInputEnterMsgFieldIsEmptyOrNOt() 
	{
		WebElement inputField = objBaseTest.getDriver().findElement(By.xpath("//input[@type='text']"));
	    String strValue =inputField.getAttribute("value");
	    return strValue;
	}
	/**
	 * Description: With the help of assert verify if returned value from textbox field is
	 * empty or not and if assert is true then send a text message in field
	 * @param strMessage
	 * 	To set a message in the textbox field
	 */
	public void setSingleInputFieldMessage(String strMessage) 
	{
		Assert.assertTrue(verifySingleInputEnterMsgFieldIsEmptyOrNOt().isEmpty());
		objBaseTest.getDriver().findElement(By.xpath("//input[@id='user-message']")).sendKeys(strMessage);
	}
	/**
	 *Description: Click the button witth show message
	 */
	public void clickShowMessageButton() 
	{
		objBaseTest.getDriver().findElement(By.xpath("//button[text()='Show Message']")).click();
	}
	/**
	 *Description: Verify if message is displayed after the button click 
	 */
	public void verifyMessageEnteredInSingleInputField() 
	{
		Assert.assertTrue(objBaseTest.getObjWrapperFunctions().checkIfElementIsDisplayed(loc_singleInputFieldText));
	}
	public void toScroll(int intYaxis) 
	{
		objBaseTest.getObjWrapperFunctions().toScrollDownPage(intYaxis);
	}
	public void verifyTwoInputFieldsSectionHeader() 
	{
		Assert.assertTrue(objBaseTest.getObjWrapperFunctions().checkIfElementIsDisplayed(loc_twoInputFieldHeader));		
	}
	
	public void setFieldEnterValueA(String strMessageA) 
	{
		objBaseTest.getDriver().findElement(loc_Enter_Value_A).sendKeys(strMessageA);		
	}
	
	public void setFieldEnterValueB(String strMessageB) 
	{
		objBaseTest.getDriver().findElement(loc_Enter_Value_B).sendKeys(strMessageB);		
	}
	
	public void clickGetTotalButton() 
	{
		objBaseTest.getDriver().findElement(By.xpath("//button[text()='Get Total']")).click();
		
	}
	
	public String getTotal() 
	{
		String strTotal = objBaseTest.getDriver().findElement(By.xpath("//label[text()=' Total a + b = ']/following-sibling::span[@id='displayvalue']")).getText();
		return strTotal;
	}
	public void verifyGetTotal(String strValue1,String strValue2,String strTotal) 
	{
		int intTotal = Integer.parseInt(strValue1)+Integer.parseInt(strValue2);
		String strExpectedTotal = String.valueOf(intTotal);
		String strActualTotal = this.getTotal();
		Assert.assertTrue(strActualTotal.equals(strExpectedTotal));
	}

}
