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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl(url, FailureHandling.CONTINUE_ON_FAILURE)

KeywordUtil.logInfo('Browser is launched')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/SwagLab_InvalidLogins/Page_Swag Labs/input_Swag Labs_user-name'), username)

WebUI.setText(findTestObject('Object Repository/SwagLab_InvalidLogins/Page_Swag Labs/input_Swag Labs_password'), password)

WebUI.click(findTestObject('Object Repository/SwagLab_InvalidLogins/Page_Swag Labs/input_Swag Labs_login-button'))

WebUI.verifyElementText(findTestObject('Object Repository/SwagLab_InvalidLogins/Page_Swag Labs/h3_Epic sadface Username and password do no_0e8909'), 
    'Epic sadface: Username and password do not match any user in this service')

WebUI.click(findTestObject('Object Repository/SwagLab_InvalidLogins/Page_Swag Labs/div_Epic sadface Username and password do n_e703ed'))

WebUI.closeBrowser()

