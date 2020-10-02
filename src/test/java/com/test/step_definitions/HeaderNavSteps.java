package com.test.step_definitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.helpers.Hooks;
import com.test.modules.HeaderNavAction;
import com.test.pageobjects.HomePageObjects;

import cucumber.api.java.en.Then;

public class HeaderNavSteps {

	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public HeaderNavSteps() {
		driver = Hooks.driver;
		PageFactory.initElements(driver, HomePageObjects.class);
	}

	@Then("^I Verify all the links in menu$")
	public void i_Verify_all_the_links_in_menu() throws Throwable {
		HeaderNavAction.headerNav(driver);
	}

	@Then("^I Verify it shows all the sub links$")
	public void i_Verify_it_shows_all_the_sub_links() throws Throwable {
		HeaderNavAction.subNavLinks(driver);
	}
	
	

	@Then("^I Verify all the FAQS sub links$")
	public void i_Verify_all_the_FAQS_sub_links() throws Throwable {
		HeaderNavAction.faqNavLinks(driver);
	}

}
