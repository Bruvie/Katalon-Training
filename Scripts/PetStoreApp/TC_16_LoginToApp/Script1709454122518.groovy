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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://petstore.octoperf.com/')

WebUI.verifyElementText(findTestObject('Object Repository/LoginToApp/Page_JPetStore Demo/h2_Welcome to JPetStore 6'), 'Welcome to JPetStore 6')

WebUI.click(findTestObject('Object Repository/LoginToApp/Page_JPetStore Demo/a_Enter the Store'))

WebUI.verifyElementText(findTestObject('Object Repository/LoginToApp/Page_JPetStore Demo/img'), '')

WebUI.click(findTestObject('Object Repository/LoginToApp/Page_JPetStore Demo/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/LoginToApp/Page_JPetStore Demo/input_Need a user name and password_username'), 
    'bruvie')

WebUI.setEncryptedText(findTestObject('Object Repository/LoginToApp/Page_JPetStore Demo/input_Need a user name and password_password'), 
    'qPDWtMYEx+8=')

WebUI.click(findTestObject('Object Repository/LoginToApp/Page_JPetStore Demo/p_UsernamesetTimeout(function()tryvar zdocu_90a06a'))

WebUI.setEncryptedText(findTestObject('Object Repository/LoginToApp/Page_JPetStore Demo/input_Need a user name and password_password'), 
    '5Z9ySau9obQ=')

WebUI.click(findTestObject('Object Repository/LoginToApp/Page_JPetStore Demo/input_Need a user name and password_signon'))

WebUI.verifyElementText(findTestObject('Object Repository/LoginToApp/Page_JPetStore Demo/div_Welcome Bruvie'), 'Welcome Bruvie!')

