import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://shop.polymer-project.org/')

WebUI.maximizeWindow()

CustomKeywords.'web.ShadowDom.getTextDomElement'('document.querySelector("body > shop-app").shadowRoot.querySelector("iron-pages > shop-home").shadowRoot.querySelector("div:nth-child(2) > h2")')

'click SHOP NOW'
CustomKeywords.'web.ShadowDom.clickDomElement'('document.querySelector("body > shop-app").shadowRoot.querySelector("iron-pages > shop-home").shadowRoot.querySelector("div:nth-child(2) > shop-button > a")')

WebUI.delay(5)

'scroll to item'
CustomKeywords.'web.ShadowDom.scrollToDomElement'('document.querySelector("body > shop-app").shadowRoot.querySelector("iron-pages > shop-list").shadowRoot.querySelector("ul > li:nth-child(5) > a > shop-list-item").shadowRoot.querySelector("div")')

'click on item'
CustomKeywords.'web.ShadowDom.clickDomElement'('document.querySelector("body > shop-app").shadowRoot.querySelector("iron-pages > shop-list").shadowRoot.querySelector("ul > li:nth-child(5) > a")')

'set L size'
CustomKeywords.'web.ShadowDom.setTextDomElement'('document.querySelector("body > shop-app").shadowRoot.querySelector("iron-pages > shop-detail").shadowRoot.querySelector("#sizeSelect")', 
    'L')

