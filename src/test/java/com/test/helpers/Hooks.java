package com.test.helpers;

import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	public static WebDriver driver;

	@Before
	/**
	 * Delete all cookies at the start of each scenario to avoid shared state
	 * between tests
	 */
	public void openBrowser() throws MalformedURLException {
		System.out.println("Called openBrowser");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\EmiCalculator-Cucumber\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

	}

	@After
	/**
	 * Embed a screenshot in test report if test is marked as failed
	 */
	public void embedScreenshot(Scenario scenario) {

		if (scenario.isFailed()) {
			try {
				scenario.write("Current Page URL is " + driver.getCurrentUrl());
		

				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			} catch (WebDriverException e) {
				System.out.println(e.getMessage());

			}

		}
		driver.quit();

	}
	
/*
	public static RemoteWebDriver driver1;

	@BeforeTest
	@Parameters({ "platform", "browserName", "remoteurl" })
	public void beforeTest(String platform, String browserName, String remoteurl) throws MalformedURLException {

		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		DesiredCapabilities cap = null;

		if (browserName.equals("firefox")) {
			cap = new DesiredCapabilities().firefox();
			cap.setBrowserName("firefox");

		} else if (browserName.equals("chrome")) {
			cap = new DesiredCapabilities().chrome();
			cap.setBrowserName("chrome");
		}

		cap.setPlatform(Platform.XP);
		// URL url = new URL("http://192.168.2.17:4444/wd/hub");

		driver1 = new RemoteWebDriver(new URL(remoteurl), cap);
*/
	}


