package StepDefinitions;


import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.PageFactory.BootstrapAlertPage;
import com.PageFactory.InputFormSubmitPage;
import com.PageFactory.SeleniumEasyDemoHomePage;
import com.PageFactory.SimpleFormDemoPage;
import com.generic.BaseTest;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SeleniumEasyHomeStepDefinition extends BaseTest
{
	private SeleniumEasyDemoHomePage objSeleniumEasyDemoHomePage;
	private  SimpleFormDemoPage objSimpleFormDemoPage;
	private BootstrapAlertPage objBootstrapAlertPage;
	private InputFormSubmitPage objInputFormSubmitPage;
	private String testData = "";
	
	public SeleniumEasyHomeStepDefinition() 
	{
		objSeleniumEasyDemoHomePage = new SeleniumEasyDemoHomePage(this);
		objSimpleFormDemoPage = new SimpleFormDemoPage(this);
		objBootstrapAlertPage = new BootstrapAlertPage(this);
		objInputFormSubmitPage = new InputFormSubmitPage(this);
	}
	
	@Given("User is on selenium easy page")
	public void user_is_on_selenium_easy_page() 
	{
		//objSeleniumEasyDemoHomePage.navigateToHomePage();
	}

	@When("Chrome browser is lauched and url is entered")
	public void chrome_browser_is_lauched_and_url_is_entered() {
		this.initializeWebEnvironment();
	}

	@And("User closes the popup")
	public void user_closes_the_popup() {
	   objSeleniumEasyDemoHomePage.closePopUp();
	}

	@And("User checks if home page header is visible or not")
	public void user_checks_if_home_page_header_is_visible_or_not() {
		   objSeleniumEasyDemoHomePage.verifySeleniumEasyHomePageIsDisplayed();
	}	

	@And("User clicks on input forms  menubar option and Simple form demo dropdown")
	public void user_clicks_on_input_forms_menubar_option_and_simple_form_demo_dropdown() {
	   objSeleniumEasyDemoHomePage.selectMenuBarOptionAndDropDown(this.objConfigProperties.getProperty("strMenuBar"), this.objConfigProperties.getProperty("strDropDownValue"));
	}

	@And("User  is navigated to the Simple form demo page")
	public void user_is_navigated_to_the_simple_form_demo_page() {
	  
	}
	@And("User checks simple form demo page header")
	public void user_checks_simple_form_demo_page_header() {
	    objSimpleFormDemoPage.verifySimpleFormDemoPageIsDisplayed();
	}

	@And("User checks the single input field section header")
	public void user_checks_the_single_input_field_section_header() {
	    objSimpleFormDemoPage.verifySingleInputFieldHeader();
	}

	@And("User sets the single input field message")
	public void user_sets_the_single_input_field_message() {
	    objSimpleFormDemoPage.setSingleInputFieldMessage(this.objConfigProperties.getProperty("strMessage"));
	}

	@And("User clicks on show message")
	public void user_clicks_on_show_message() {
	   objSimpleFormDemoPage.clickShowMessageButton();
	}

	@Then("User is verifying the single input field message")
	public void user_is_verifying_the_single_input_field_message() {
	    objSimpleFormDemoPage.verifyMessageEnteredInSingleInputField();
	}
	@Given("User is on bootstrap alerts")
	public void user_is_on_bootstrap_alerts() {
	}

	@When("User clicks on alerts and and modals menubar option and select dropdown bootstrap alerts")
	public void user_clicks_on_alerts_and_and_modals_menubar_option_and_select_dropdown_bootstrap_alerts() {
	   objSeleniumEasyDemoHomePage.selectMenuBarOptionAndDropDown(this.objConfigProperties.getProperty("strMenuBarAlerts"), this.objConfigProperties.getProperty("strDropDownValueBootstrapAlerts"));
	}

	@And("User checks if bootstrap alerts header is visible or not")
	public void user_checks_if_bootstrap_alerts_header_is_visible_or_not() {
	   objBootstrapAlertPage.verifyBootstrapAlertPageIsDisplayed();
	}

	@And("Verifying  autocloseable success message button is displayed")
	public void verifying_autocloseable_success_message_button_is_displayed() {
		objBootstrapAlertPage.verifyAutocloseableSuccessMsgButtonIsDisplayed();
	}

	@And("User clicks on autocloseable success message button")
	public void user_clicks_on_autocloseable_success_message_button() {
	  objBootstrapAlertPage.clickBootstrapAlertButtonsOption(this.objConfigProperties.getProperty("strAutocloseableSuccessButton"));
	}
	@And("Verifying if autocloseable success message is displayed")
	public void verifying_if_autocloseable_success_message_is_displayed() {
	    objBootstrapAlertPage.verifyAutocloseableSuccessMsgIsDisplayed();
	}

	@And("User clicks on normal success message button")
	public void user_clicks_on_normal_success_message_button() {
	   objBootstrapAlertPage.clickBootstrapAlertButtonsOption(this.objConfigProperties.getProperty("strNormalSuccessButton"));
	}

	@And("Verifying  normal success message is displayed")
	public void verifying_normal_success_message_is_displayed() {
	   objBootstrapAlertPage.verifyNormalSuccessMessageIsDisplayed();
	}

	@And("User clicks on autocloseable warning message button")
	public void user_clicks_on_autocloseable_warning_message_button() {
	  objBootstrapAlertPage.clickBootstrapAlertButtonsOption(this.objConfigProperties.getProperty("strAutocloseableWarningButton"));
	}

	@Then("User is verifying autocloseable warning message is displayed")
	public void user_is_verifying_autocloseable_warning_message_is_displayed() {
	   objBootstrapAlertPage.verifyAutocloseableWarningMessageIsDisplayedOrNot(this.objConfigProperties.getProperty("strExpAutocloseableWarningMsg"));
	}
	@Given("User is verifying two input fields section header in simple input forms demo page")
	public void user_is_verifying_two_input_fields_section_header_in_simple_input_forms_demo_page() {
	    objSimpleFormDemoPage.verifyTwoInputFieldsSectionHeader();
	}

	@When("The dropdown selected is simple form demo")
	public void the_dropdown_selected_is_simple_form_demo() {
	   getObjWrapperFunctions().toScrollDownPage(200);
	}
	@When("User selects the value of {string} and {string}")
	public void user_selects_the_value_of_and(String strMessageA, String strMessageB) {
		objSimpleFormDemoPage.setFieldEnterValueA(strMessageA);
		objSimpleFormDemoPage.setFieldEnterValueB(strMessageB);
	}
	

	@When("User clicks on get total button")
	public void user_clicks_on_get_total_button() {
		objSimpleFormDemoPage.clickGetTotalButton();
	}

	@Then("The result should be {string} added with {string} to get {string}")
	public void the_result_should_be_added_with_to_get(String strMessageA, String strMessageB, String strTotal) {
	   objSimpleFormDemoPage.verifyGetTotal(strMessageA, strMessageB, strTotal);
	}

	@Given("User clicks on input forms  menubar option and Input form submit dropdown")
	public void user_clicks_on_input_forms_menubar_option_and_input_form_submit_dropdown() {
		   objSeleniumEasyDemoHomePage.selectMenuBarOptionAndDropDown(this.objConfigProperties.getProperty("strMenuBar"), this.objConfigProperties.getProperty("strInputFormSubmitDropdown"));
	}

	
	@Then("User checks Input form submit page header")
	public void user_checks_input_form_submit_page_header() {
	    objInputFormSubmitPage.verifyInputFormSubmitPageHeaderIsDisplayed();
	}
	@And("User is veriying all the text fields are empty or not")
	public void user_is_veriying_all_the_text_fields_are_empty_or_not() {
		objInputFormSubmitPage.verifyFirstNameFieldIsEmpty();
		objInputFormSubmitPage.verifyLastNameFieldIsEmpty();
		objInputFormSubmitPage.verifyEmailAddressFieldIsEmpty();	
	}

	@And("User fills the input form with validations")
	public void user_fills_the_input_form_with_validations(DataTable dataTable) {
		
		Map<String, String> userList = dataTable.asMap(String.class, String.class);
		objInputFormSubmitPage.setFirstName(userList.get("FirstName"));
		objInputFormSubmitPage.setLastName(userList.get("LastName"));
		objInputFormSubmitPage.setEmailAddress(userList.get("EmailAddress"));		

		
		}
	
	@And("User closes the browser")
	public void user_closes_the_browser() {
	  //tearDown();	
	}	
	
}

/* List<List<String>> userList = dataTable.cells();
objInputFormSubmitPage.setFirstName(userList.get(1).get(1));
objInputFormSubmitPage.setLastName(userList.get(2).get(1));
objInputFormSubmitPage.setEmailAddress(userList.get(3).get(1));*/	 			



/*	List<Map<String,String>> userList = dataTable.asMaps(String.class, String.class);
	objInputFormSubmitPage.setFirstName(userList.get(0).get("Values"));
	objInputFormSubmitPage.setLastName(userList.get(1).get("Values"));
	objInputFormSubmitPage.setEmailAddress(userList.get(2).get("Values"));	*/	 			

