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

WebUI.callTestCase(findTestCase('SauceLabsApp/TC_21_LoginWithValidUser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/SwagLab_VerifyCheckoutPage/Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/SwagLab_VerifyCheckoutPage/Page_Swag Labs/a_1'))

WebUI.click(findTestObject('Object Repository/SwagLab_VerifyCheckoutPage/Page_Swag Labs/button_Checkout'))

WebUI.verifyElementText(findTestObject('Object Repository/SwagLab_VerifyCheckoutPage/Page_Swag Labs/span_Checkout Your Information'), 
    'Checkout: Your Information')

WebUI.setText(findTestObject('Object Repository/SwagLab_VerifyCheckoutPage/Page_Swag Labs/input_Checkout Your Information_firstName'), 
    'Bruvie')

WebUI.setText(findTestObject('Object Repository/SwagLab_VerifyCheckoutPage/Page_Swag Labs/input_Checkout Your Information_lastName'), 
    'MArtins')

WebUI.setText(findTestObject('Object Repository/SwagLab_VerifyCheckoutPage/Page_Swag Labs/input_Checkout Your Information_postalCode'), 
    '433333')

WebUI.click(findTestObject('Object Repository/SwagLab_VerifyCheckoutPage/Page_Swag Labs/input_Cancel_continue'))

WebUI.verifyElementText(findTestObject('Object Repository/SwagLab_VerifyCheckoutPage/Page_Swag Labs/span_Checkout Overview'), 
    'Checkout: Overview')

WebUI.verifyElementText(findTestObject('Object Repository/SwagLab_VerifyCheckoutPage/Page_Swag Labs/div_Payment Information'), 
    'Payment Information')

WebUI.verifyElementText(findTestObject('Object Repository/SwagLab_VerifyCheckoutPage/Page_Swag Labs/div_Shipping Information'), 
    'Shipping Information')

WebUI.verifyElementText(findTestObject('Object Repository/SwagLab_VerifyCheckoutPage/Page_Swag Labs/div_Price Total'), 'Price Total')

WebUI.closeBrowser()

