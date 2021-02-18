package com.herpkupapp.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.herpkupapp.pages.FramesPage;
import com.herpkupapp.testbase.TestBase;

public class FramesPageTestCase extends TestBase {

	FramesPage frampage;

	public FramesPageTestCase() {
		super();
	}

	@BeforeMethod
	public void initheroupapp() {
		frampage = new FramesPage();
	}

	@Test(priority = 1)
	public void validateiframeClick() {
		frampage.clickiframelabel();
	}

}
