package com.herpkupapp.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.herpkupapp.pages.WelcomePage;
import com.herpkupapp.testbase.TestBase;

/*
 * This method contains various annotated methods for the test case to run
 */

public class WelomePageTestCase extends TestBase {

	WelcomePage welcomePage;

	public WelomePageTestCase() {
		super(); // need to invoke the property loading of the test base class
	}

	@BeforeMethod
	public void initheroupapp() {
		initialization();
		welcomePage = new WelcomePage();
	}

	/*
	 * @Test(priority = 1) public void validateTitle() {
	 * System.out.println("Validation title"); String title =
	 * welcomePage.verifyTitle(); if (title.equals(prop.getProperty("frame"))) {
	 * Assert.assertEquals(title, prop.getProperty("frame")); } }
	 */
	
	@Test(priority = 1)
	public void validateLogin() throws InterruptedException {
		System.out.println("calling click method");
		welcomePage.click();
	}
}
