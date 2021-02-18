package com.herpkupapp.pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herpkupapp.testbase.TestBase;
import com.herpkupapp.util.HerpkuappUtil;

public class IFramePage extends TestBase {

	ElementalSelenium eleSelenium;
	WelcomePage welcomePage;

	@FindBy(id = "tinymce")
	WebElement framebox;

	public IFramePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyIframePageTitle() {
		String text = driver
				.findElement(By.xpath("//h3[normalize-space()='An iFrame containing the TinyMCE WYSIWYG Editor']"))
				.getText();
		return text;
	}

	public void iFrameLogicFrame() {

		Actions actions = new Actions(driver);

		System.out.println("Entered the Iframe method");
		System.out.println("Frame Box will enter");
		driver.manage().timeouts().implicitlyWait(HerpkuappUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.switchTo().frame("mce_0_ifr");
		System.out.println("Frame Box has already entered");
		framebox.clear();
		System.out.println("After clear");
		System.out.println("Sending test");
		framebox.sendKeys("test");
		System.out.println("value has been entered");

		// Select the Current value using CTRL + A
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("a");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		System.out.println("text is copied");

		// to make the text bold
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("b");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		driver.switchTo().defaultContent();
	}

	public ElementalSelenium clickElementSelenium() {
		driver.manage().timeouts().implicitlyWait(HerpkuappUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		System.out.println("Need to click");
		driver.findElement(By.xpath("//a[normalize-space()='Elemental Selenium']")).click();
		System.out.println("Clicked");
		String parentwindow = driver.getWindowHandle();
		Set<String> childwindowSet = driver.getWindowHandles();
		Iterator<String> it = childwindowSet.iterator();
		while (it.hasNext()) {
			String childwindowValue = it.next();
			if (!parentwindow.equalsIgnoreCase(childwindowValue)) {
				driver.switchTo().window(childwindowValue);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		return new ElementalSelenium();
	}

}
