package com.test.step_definitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.helpers.DataHelper;
import com.test.helpers.Hooks;
import com.test.modules.LoansPageAction;
import com.test.pageobjects.LoansPageObjects;

import cucumber.api.java.en.Then;

public class ExcelLoansPageSteps {
	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public ExcelLoansPageSteps() {
		driver = Hooks.driver;
		PageFactory.initElements(driver, LoansPageObjects.class);
	}

	@Then("^I read data from excel and validate emi details$")
	public void i_read_data_from_excel_and_validate_emi_details()
			throws Throwable {
		
		List<HashMap<String, String>> data = DataHelper.data();
		
		for (HashMap<String, String> map : data) {
			System.out.println(map);
			LoansPageAction.enterLoanData(map.get("Home Loan Amount"), map.get("Interest Rate"), map.get("Loan Tenure"));
			LoansPageAction.validateLoanDetails(map.get("Loan EMI"), map.get("Total Interest Payable"), map.get("Total Payment"));
		}
	}
	
	public void i_read_data_from_excel_and_validate_Personal_Loan_emi_details() throws Throwable {
List<HashMap<String, String>> data = DataHelper.data();
		
		for (HashMap<String, String> map : data) {
			System.out.println(map);
			LoansPageAction.enterLoanData(map.get("Home Loan Amount"), map.get("Interest Rate"), map.get("Loan Tenure"));
			LoansPageAction.validateLoanDetails(map.get("Loan EMI"), map.get("Total Interest Payable"), map.get("Total Payment"));
		}
	}
}