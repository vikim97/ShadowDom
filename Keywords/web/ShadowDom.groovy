package web

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import io.github.bonigarcia.wdm.WebDriverManager as WebDriverManager
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.WebDriverWait
import org.testng.Assert as Assert
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.support.ui.ExpectedConditions;

import internal.GlobalVariable

public class ShadowDom {

	@Keyword
	def clickDomElement(String JSPath) throws StepFailedException {
		WebDriver driver = DriverFactory.getWebDriver();
		JavascriptExecutor jsExecutor = ((JavascriptExecutor) driver)


		WebElement elementLocator = ((jsExecutor.executeScript("return " + JSPath) as WebElement))

		if (elementLocator.isDisplayed() && elementLocator.isEnabled()) {

			WebUI.delay(3)
			elementLocator.click()

			KeywordUtil.markPassed("---> Element is clicked successfully")
		}
		else {

			KeywordUtil.markFailedAndStop("---> Element is not clicked successfully")
		}
	}

	@Keyword


	def scrollToDomElement(String JSPath) throws StepFailedException {
		WebDriver driver = DriverFactory.getWebDriver();
		JavascriptExecutor jsExecutor = ((JavascriptExecutor) driver)


		WebElement elementLocator = ((jsExecutor.executeScript("return " + JSPath) as WebElement))
		//WebUI.delay(8)

		if (elementLocator.isDisplayed() && elementLocator.isEnabled()){

			jsExecutor.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'});", elementLocator)
			KeywordUtil.markPassed("---> Element is scrolled successfully")
		}
		else {


			KeywordUtil.markFailedAndStop("---> Element is not scrolled")
		}
	}

	@Keyword
	def setTextDomElement(String JSPath, String text) throws StepFailedException {
		WebDriver driver = DriverFactory.getWebDriver();
		JavascriptExecutor jsExecutor = ((JavascriptExecutor) driver)


		WebElement elementLocator = ((jsExecutor.executeScript("return " + JSPath) as WebElement))
		if (elementLocator.isDisplayed() && elementLocator.isEnabled()) {
			WebUI.delay(3)
			elementLocator.sendKeys(text)
		}
		else {
			KeywordUtil.markFailedAndStop("---> Element is not clicked successfully")
		}
	}

	@Keyword
	def getTextDomElement(String JSPath) throws StepFailedException {
		WebDriver driver = DriverFactory.getWebDriver();
		JavascriptExecutor jsExecutor = ((JavascriptExecutor) driver)


		WebElement elementLocator = ((jsExecutor.executeScript("return " + JSPath) as WebElement))
		if (elementLocator.isDisplayed() && elementLocator.isEnabled()) {
			WebUI.delay(3)
			elementLocator.getText().toString()
		}
		else {
			KeywordUtil.markFailedAndStop("---> Element is not clicked successfully")
		}
	}
	@Keyword
	def verifyDomElementPresent(String JSPath) throws StepFailedException {
		WebDriver driver = DriverFactory.getWebDriver();
		JavascriptExecutor jsExecutor = ((JavascriptExecutor) driver)


		WebElement elementLocator = ((jsExecutor.executeScript("return " + JSPath) as WebElement))
		if (elementLocator.isDisplayed() && elementLocator.isEnabled()) {
			KeywordUtil.markPassed("---> Element is present successfully")
		}
		else {
			KeywordUtil.markFailedAndStop("---> Element is not present")
		}
	}
}
