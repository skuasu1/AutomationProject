package com.herpkupapp.testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.herpkupapp.pages.IFramePage;
import com.herpkupapp.testbase.TestBase;

public class IFramesPageTestCase extends TestBase {

	IFramePage iframePage;

	public IFramesPageTestCase() {
		super();
	}

	@BeforeMethod
	public void initheroupapp() {
		iframePage = new IFramePage();
	}

	@Test(priority = 1)
	public void verify() {
		String value = iframePage.verifyIframePageTitle();
		Assert.assertEquals(value, "An iFrame containing the TinyMCE WYSIWYG Editor");
	}

	@Test(priority = 2)
	public void clearIFrameLogic() {
		iframePage.iFrameLogicFrame();
	}
	
	@Test(priority = 3)
	public void clickElementSelenium() {
		System.out.println("clicking on link");
		iframePage.clickElementSelenium();
	}

}
