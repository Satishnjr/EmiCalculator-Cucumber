package com.test.step_definitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.modules.LoansPageAction;
import com.test.pageobjects.LoansPageObjects;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoansPageSteps {
	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public LoansPageSteps() {
		driver = Hooks.driver;
		PageFactory.initElements(driver, LoansPageObjects.class);
	}

	@When("^I enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" in search textbox$")
	public void i_enter_in_search_textbox(String homeLoanAmount, String interest, String tenure) throws Throwable {

		LoansPageAction.enterLoanData(homeLoanAmount, interest, tenure);
	}

	@Then("^I should get result as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_should_get_result_as(String emiAmount, String loanInterest, String loanTotalPay) throws Throwable {

		LoansPageAction.validateLoanDetails(emiAmount, loanInterest, loanTotalPay);
	}

	@And("^I Click on Personal Loan$")
	public void i_Click_on_Personal_Loan() throws Throwable {
		LoansPageObjects.personalloan.click();
	}

	@When("^I Click on Car Loan$")
	public void i_Click_on_Car_Loan() throws Throwable {
		LoansPageObjects.carloan.click();
	}

}
