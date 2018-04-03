package com.test.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class HomePageObjects extends BaseClass {

	public HomePageObjects(WebDriver driver) {
		super(driver);
	}

	@FindBys(@FindBy(css = "#menu-main-menu > li"))
	public static List<WebElement> verifyMenuLinks;

	@FindBy(how = How.CLASS_NAME, using = "dropdown-toggle")
	public static WebElement calculatorsDropDown;

	@FindBys(@FindBy(css = " .dropdown-menu li"))
	public static List<WebElement> verifyAllLinks;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'FAQs ')]")
	public static WebElement faqsDropDown;

	@FindBys(@FindBy(xpath = "//a[contains(text(),'FAQs ')]/following-sibling::ul[1]/li"))
	public static List<WebElement> verifyFaqLinks;

	@FindBy(how = How.CLASS_NAME, using = "navbar-toggle")
	public static WebElement mobilemenu;

}
