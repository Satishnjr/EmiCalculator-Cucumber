package com.test.step_definitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.helpers.Hooks;
import com.test.modules.HomePageAction;
import com.test.pageobjects.HomePageObjects;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageSteps {
	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public HomePageSteps() {
		driver = Hooks.driver;
	}

	@Given("^I open EMI Calculator website$")
	public void i_open_EMI_Calculator_website() throws Throwable {

		driver.get("https://emicalculator.net");
	}

	@Given("^I click on Calculators and Indicators Nav Link$")
	public void i_click_on_Calculators_and_Indicators_Nav_Link()
			throws Throwable {
		PageFactory.initElements(driver, HomePageObjects.class);
		HomePageAction.calculator(driver);

	}

	@Given("^I click on FAQS Nav Link$")
	public void i_click_on_FAQS_Nav_Link() throws Throwable {
		PageFactory.initElements(driver, HomePageObjects.class);
		HomePageAction.faqNav(driver);
	}

	@Given("^I open EMI Calculator website in mobile$")
	public void i_open_EMi_Calculator_website_in_mobile() throws Throwable {
		driver.get("https://emicalculator.net");
		driver.manage().window().setSize(new Dimension(412, 732));

	}

	@When("^I Click on menu$")
	public void i_Click_on_menu() throws Throwable {
		PageFactory.initElements(driver, HomePageObjects.class);
		HomePageAction.mobileMenuNav(driver);
	}

}
