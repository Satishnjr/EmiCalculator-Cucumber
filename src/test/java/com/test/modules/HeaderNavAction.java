package com.test.modules;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.test.pageobjects.HomePageObjects;

public class HeaderNavAction {

	public static void headerNav(WebDriver driver) {
		//WebDriverWait wait = new WebDriverWait(driver, 10);

		List<WebElement> items = HomePageObjects.verifyMenuLinks;

		Reporter.log("Found Menu links: ", items.size());
		System.out.println(items.size());
		Assert.assertTrue(items.size() > 4);
		Assert.assertTrue(items.size() < 10);
		for (WebElement links : items) {
			System.out.println(links.getText());
		}

	}

	public static void subNavLinks(WebDriver driver) {
		//WebDriverWait wait = new WebDriverWait(driver, 10);

		List<WebElement> items = HomePageObjects.verifyAllLinks;
		Reporter.log("Found Menu links: ", items.size());
		/*
		 * System.out.println(items.size()); Assert.assertTrue(items.size() >
		 * 5); Assert.assertTrue(items.size() < 10);
		 */
		int visibleElementCount = 0;
		for (WebElement links : items) {
			if (links.isDisplayed()) {
				visibleElementCount++;
				System.out.println(links.getText());
			}

		}
		System.out.println(visibleElementCount);
		

		Assert.assertEquals(4, visibleElementCount);

		Reporter.log("Clicked on Menu");

	}

	public static void faqNavLinks(WebDriver driver) {
		//WebDriverWait wait = new WebDriverWait(driver, 10);

		List<WebElement> items = HomePageObjects.verifyFaqLinks;
		Reporter.log("Found Menu links: ", items.size());
		System.out.println(items.size());
		Assert.assertTrue(items.size() > 3);
		Assert.assertTrue(items.size() < 10);
		
		for (WebElement links : items) {
				System.out.println(links.getText());
			}

	}

}
