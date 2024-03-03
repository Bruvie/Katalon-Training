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

WebUI.callTestCase(findTestCase('PetStoreApp/TC_16_LoginToApp'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/LoginAndPurchaseReptiles/Page_JPetStore Demo/img'))

WebUI.navigateToUrl('https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES')

WebUI.click(findTestObject('Object Repository/LoginAndPurchaseReptiles/Page_JPetStore Demo/a_RP-LI-02'))

WebUI.click(findTestObject('Object Repository/LoginAndPurchaseReptiles/Page_JPetStore Demo/a_Add to Cart'))

WebUI.setText(findTestObject('Object Repository/LoginAndPurchaseReptiles/Page_JPetStore Demo/input_true_EST-13'), '3')

WebUI.click(findTestObject('Object Repository/LoginAndPurchaseReptiles/Page_JPetStore Demo/input_Sub Total 18.50_updateCartQuantities'))

WebUI.click(findTestObject('Object Repository/LoginAndPurchaseReptiles/Page_JPetStore Demo/a_Return to Main Menu'))

WebUI.closeBrowser()

