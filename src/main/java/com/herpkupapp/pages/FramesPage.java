package com.herpkupapp.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herpkupapp.testbase.TestBase;
import com.herpkupapp.util.HerpkuappUtil;

public class FramesPage extends TestBase {

	IFramePage iframepage;
	/*
	 * @FindBy(xpath = "//h3[text()='Frames']") WebElement frameheadertext;
	 */

	@FindBy(xpath = "/html/body/div[2]/div/div/ul/li[2]/a")
	WebElement iFrameLabel;

	// need to invoke the page factory
	public FramesPage() {
		PageFactory.initElements(driver, this);
	}

	/*
	 * // verify the title public String verifyFramesTitle() { return
	 * driver.getTitle(); }
	 */
	public IFramePage clickiframelabel() {
		System.out.println("Trying to click on I Frame");
		try {
			driver.manage().timeouts().implicitlyWait(HerpkuappUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			iFrameLabel.click();
		}catch (TimeoutException e) {
			e.printStackTrace();
			e.getMessage();
		}
		return new IFramePage();
	}
}
