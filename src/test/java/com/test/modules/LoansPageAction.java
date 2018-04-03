package com.test.modules;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.test.helpers.Log;
import com.test.pageobjects.LoansPageObjects;
import com.test.pageobjects.HomePageObjects;

public class LoansPageAction {

	public static void calculator(WebDriver driver) throws Exception {

		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 10);
		 * wait.until(ExpectedConditions
		 * .presenceOfElementLocated(HomePage.locator));
		 */

		HomePageObjects.calculatorsDropDown.click();

		Log.info("Click action is perfromed on Calculator and Indicators Link");

		Reporter.log("Click action is perfromed on Calculator and Indicators Link");
	}

	
	public static void enterLoanData(String homeLoanAmount, String interest,
			String tenure) {
		LoansPageObjects.homeloan.sendKeys(Keys.HOME,
				Keys.chord(Keys.SHIFT, Keys.END), homeLoanAmount);

		LoansPageObjects.interestRate.sendKeys(Keys.HOME,
				Keys.chord(Keys.SHIFT, Keys.END), interest);

		LoansPageObjects.loanTenure.sendKeys(Keys.HOME,
				Keys.chord(Keys.SHIFT, Keys.END), tenure);

		LoansPageObjects.loanTenure.sendKeys(Keys.ENTER);
	}
	
	public static void validateLoanDetails(String emiAmount, String loanInterest,
			String loanTotalPay) {
		
		String emi = LoansPageObjects.loanEMI.getText();
        Assert.assertEquals(emiAmount, emi);

		String interest = LoansPageObjects.loanInterest.getText();
		Assert.assertEquals(loanInterest, interest);

		String TotalPay = LoansPageObjects.LoanTotalPay.getText();
		Assert.assertEquals(loanTotalPay, TotalPay);
	}

}
