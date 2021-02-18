package com.herpkupapp.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herpkupapp.testbase.TestBase;
import com.herpkupapp.util.HerpkuappUtil;

/*
 * this method contains all the page factory for the webleements need to be used
 */

public class WelcomePage extends TestBase {

	FramesPage framePage;

	// based on the needed Or's can be added here

	/*
	 * @FindBy(xpath = "//a[@href='/frames']") WebElement framevalue;
	 */
	@FindBy(xpath = "/html/body/div[2]/div/ul/li[22]/a")
	WebElement frameLabel;

	// need to invoke the page factory
	public WelcomePage() {
		PageFactory.initElements(driver, this);
	}

	/*
	 * // action method public String verifyTitle() { String value =
	 * titleWord.getText(); System.out.println(value); return value; }
	 */

	public FramesPage click() throws InterruptedException {
		System.out.println("clicking on framelabel");
		driver.manage().timeouts().implicitlyWait(HerpkuappUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		frameLabel.click();
		System.out.println("clicked  on framelabel");
		return new FramesPage();
	}
}
