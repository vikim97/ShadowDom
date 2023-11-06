import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.awt.Robot;
import java.awt.event.KeyEvent;

WebUI.openBrowser('https://trailhead.salesforce.com/projects')

'Newest Option'
def newestOption = 'document.querySelector("#main > div > lx-project-index-page").shadowRoot.querySelector("lwc-lx-index-page").shadowRoot.querySelector("lwc-tds-layout > lwc-lx-content-filter-header").shadowRoot.querySelector("lwc-tds-page-header > lwc-tds-filters").shadowRoot.querySelector("div.controls.controls--desktop > div > lwc-tds-form-control.form-control.form-control--sort").shadowRoot.querySelector("lwc-tds-combobox").shadowRoot.querySelector("#input")'

'Most Points Dropdown Option'
def mostPointsDropdown = 'document.querySelector("#main > div > lx-project-index-page").shadowRoot.querySelector("lwc-lx-index-page").shadowRoot.querySelector("lwc-tds-layout > lwc-lx-content-filter-header").shadowRoot.querySelector("lwc-tds-page-header > lwc-tds-filters").shadowRoot.querySelector("div.controls.controls--desktop > div > lwc-tds-form-control.form-control.form-control--sort").shadowRoot.querySelector("lwc-tds-combobox").shadowRoot.querySelector("#MOST_POINTS > div")'

'Levels Textbox'
def levelsTextBox = 'document.querySelector("#main > div > lx-project-index-page").shadowRoot.querySelector("lwc-lx-index-page").shadowRoot.querySelector("lwc-tds-layout > lwc-lx-content-filter-header").shadowRoot.querySelector("lwc-tds-page-header > lwc-tds-filters").shadowRoot.querySelector("div.controls.controls--desktop > div > lwc-tds-form-control:nth-child(2)").shadowRoot.querySelector("lwc-tds-combobox").shadowRoot.querySelector("#input")'

'Beginner Radio'
def beginnerRadio = 'document.querySelector("#main > div > lx-project-index-page").shadowRoot.querySelector("lwc-lx-index-page").shadowRoot.querySelector("lwc-tds-layout > lwc-lx-content-filter-header").shadowRoot.querySelector("lwc-tds-page-header > lwc-tds-filters").shadowRoot.querySelector("div.controls.controls--desktop > div > lwc-tds-form-control:nth-child(2)").shadowRoot.querySelector("lwc-tds-combobox").shadowRoot.querySelector("#Beginner > lwc-tds-input").shadowRoot.querySelector("div > label > div")'

'Products Textbox'
def productTextbox = 'document.querySelector("#main > div > lx-project-index-page").shadowRoot.querySelector("lwc-lx-index-page").shadowRoot.querySelector("lwc-tds-layout > lwc-lx-content-filter-header").shadowRoot.querySelector("lwc-tds-page-header > lwc-tds-filters").shadowRoot.querySelector("div.controls.controls--desktop > div > lwc-tds-form-control:nth-child(3)").shadowRoot.querySelector("lwc-tds-combobox").shadowRoot.querySelector("#input")'

'Einstein Radio'
def einsteinRadio = 'document.querySelector("#main > div > lx-project-index-page").shadowRoot.querySelector("lwc-lx-index-page").shadowRoot.querySelector("lwc-tds-layout > lwc-lx-content-filter-header").shadowRoot.querySelector("lwc-tds-page-header > lwc-tds-filters").shadowRoot.querySelector("div.controls.controls--desktop > div > lwc-tds-form-control:nth-child(3)").shadowRoot.querySelector("lwc-tds-combobox").shadowRoot.querySelector("#Einstein > div")'

'Put Predictions into Action with Next Best Action Project'
def expectedProject = 'document.querySelector("#main > div > lx-project-index-page").shadowRoot.querySelector("lwc-lx-index-page").shadowRoot.querySelector("lwc-tds-layout > lwc-lx-learning-search-collection").shadowRoot.querySelector("lwc-th-content-collection").shadowRoot.querySelector("lwc-tds-content-collection-card > lwc-tds-content-collection-item:nth-child(2)").shadowRoot.querySelector("article > lwc-tds-content-summary").shadowRoot.querySelector("lwc-tds-summary").shadowRoot.querySelector("div > div.body > div.content > lwc-tds-heading > a")'

CustomKeywords.'web.ShadowDom.clickDomElement'(newestOption)

CustomKeywords.'web.ShadowDom.clickDomElement'(mostPointsDropdown)

CustomKeywords.'web.ShadowDom.setTextDomElement'(levelsTextBox, 'Beginner')

CustomKeywords.'web.ShadowDom.clickDomElement'(beginnerRadio)

CustomKeywords.'web.ShadowDom.clickDomElement'(productTextbox)

CustomKeywords.'web.ShadowDom.scrollToDomElement'(einsteinRadio)

CustomKeywords.'web.ShadowDom.clickDomElement'(einsteinRadio)

CustomKeywords.'web.ShadowDom.clickDomElement'(productTextbox)

CustomKeywords.'web.ShadowDom.verifyDomElementPresent'(expectedProject)