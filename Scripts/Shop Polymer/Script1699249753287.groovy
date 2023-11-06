import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI




WebUI.openBrowser('https://shop.polymer-project.org/')

WebUI.maximizeWindow()

'click SHOP NOW'
CustomKeywords.'web.ShadowDom.clickDomElement'('document.querySelector("body > shop-app").shadowRoot.querySelector("iron-pages > shop-home").shadowRoot.querySelector("div:nth-child(2) > shop-button > a")')

'scroll to item'
CustomKeywords.'web.ShadowDom.ScrollToDomElement'('document.querySelector("body > shop-app").shadowRoot.querySelector("iron-pages > shop-list").shadowRoot.querySelector("ul > li:nth-child(5) > a > shop-list-item").shadowRoot.querySelector("div")')

//WebUI.delay(5)
'click on item'
CustomKeywords.'web.ShadowDom.clickDomElement'('document.querySelector("body > shop-app").shadowRoot.querySelector("iron-pages > shop-list").shadowRoot.querySelector("ul > li:nth-child(5) > a")')

'set L size'
CustomKeywords.'web.ShadowDom.setTextDomElement'('document.querySelector("body > shop-app").shadowRoot.querySelector("iron-pages > shop-detail").shadowRoot.querySelector("#sizeSelect")', 
    'L')

