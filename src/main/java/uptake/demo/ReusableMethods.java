package uptake.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class ReusableMethods {

	/**
	 * to wait till a given element XPATH arrives on the page
	 * 
	 * */

	public static void waitForElementByXPATH(final WebDriver driver,
			final String elementXPATH) throws InterruptedException {

		Reporter.log("***In waitForElementByXPATH***");

		new WebDriverWait(driver, 10)
		.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath(elementXPATH)));
	}


	/**
	 * Returns ElementXPATH
	 * 
	 * */
	public static List<WebElement> findElementsbyXPATH(final WebDriver driver, final String elementXPATH)
	{
		Reporter.log("***In findElementsbyXPATH***");
		List<WebElement> XPATH = driver.findElements(By.xpath(elementXPATH));
		return XPATH;
	}

	/**
	 *  Clicks when the element XPATH is present
	 * 
	 * */
	public static void clickIfElementXPATHPresent(final WebDriver driver, final String elementXPATH) throws InterruptedException
	{
		Reporter.log("***In clickIfElementXPATHPresent***");
		waitForElementByXPATH(driver, elementXPATH);
		Reporter.log("Element elementID found: " + elementXPATH, true);
		driver.findElement(By.xpath(elementXPATH)).click();
	}

	/**
	 * to wait till a given element LinkText arrives on the page
	 * 
	 * */

	public static void waitForElementByLinkText(final WebDriver driver,
			final String elementLinkText) throws InterruptedException {

		Reporter.log("***In waitForElementByLinktext***");

		new WebDriverWait(driver, 10)
		.until(ExpectedConditions.presenceOfElementLocated(By
				.linkText(elementLinkText)));
	}


	/**
	 *  Clicks when the element LinkText is present
	 * 
	 * */
	public static void clickIfElementLinkTextPresent(final WebDriver driver, final String elementLinkText) throws InterruptedException
	{
		Reporter.log("***In clickIfElementLinktextPresent***");
		waitForElementByLinkText(driver, elementLinkText);
		Reporter.log("Element elementLinkText found: " + elementLinkText, true);
		driver.findElement(By.linkText(elementLinkText)).click();
	}

	/**
	 * to wait till a given element ClassName arrives on the page
	 * 
	 * */

	public static void waitForElementByClassName(final WebDriver driver,
			final String elementClassName) throws InterruptedException {

		Reporter.log("***In waitForelementClassName***");

		new WebDriverWait(driver, 10)
		.until(ExpectedConditions.presenceOfElementLocated(By
				.className(elementClassName)));
	}


	/**
	 *  Clicks when the element ClassName is present
	 * 
	 * */
	public static void getTextElementClassPresent(final WebDriver driver, final String elementClassName) throws InterruptedException
	{
		Reporter.log("***In clickIfelementClassNamePresent***");
		waitForElementByClassName(driver, elementClassName);
		Reporter.log("Element elementName found: " + elementClassName, true);
		String str = driver.findElement(By.className(elementClassName)).getText();
		System.out.println("Element Text :" +str);
	}
}
