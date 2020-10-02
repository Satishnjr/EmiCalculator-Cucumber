package com.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.test.helpers.BaseClass;

public class LoansPageObjects extends BaseClass {

	public LoansPageObjects(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.CSS, using = "#loanamount")
	public static WebElement homeloan;

	@FindBy(how = How.CSS, using = "#loaninterest")
	public static WebElement interestRate;

	@FindBy(how = How.CSS, using = "#loanterm")
	public static WebElement loanTenure;

	@FindBy(how = How.CSS, using = "#emiamount p span")
	public static WebElement loanEMI;

	@FindBy(how = How.CSS, using = "#emitotalinterest p span")
	public static WebElement loanInterest;

	@FindBy(how = How.CSS, using = "#emitotalamount p span")
	public static WebElement LoanTotalPay;

	@FindBy(how = How.CSS, using = "#personal-loan a")
	public static WebElement personalloan;
	
	@FindBy(how = How.CSS, using = "#car-loan a")
	public static WebElement carloan;
}
