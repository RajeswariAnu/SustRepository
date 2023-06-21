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

WebUI.navigateToUrl('https://livesust-test-web.optisolbusiness.com/login')

WebUI.setText(findTestObject('Object Repository/Page_LiveSust/input_Provider Log In_Username  E-Mail Address'), 'Benedicta@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LiveSust/input_Username  E-Mail Address_Password'), 'A6mEPJzh5E0jyMlyB9kA3w==')

WebUI.click(findTestObject('Object Repository/Page_LiveSust/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_LiveSust/em_Company Name_lnr lnr-chevron-down'))

WebUI.click(findTestObject('Object Repository/Page_LiveSust/li_Change Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LiveSust/input_Change Password_Old Password'), 'A6mEPJzh5E0zn4FxjKHQNA==')

WebUI.click(findTestObject('Object Repository/Page_LiveSust/em_Company Name_lnr lnr-chevron-down'))

WebUI.click(findTestObject('Object Repository/Page_LiveSust/em_Company Name_lnr lnr-chevron-down'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LiveSust/input_Old Password_New Password'), 'A6mEPJzh5E0jyMlyB9kA3w==')

WebUI.click(findTestObject('Object Repository/Page_LiveSust/em_Company Name_lnr lnr-chevron-down'))

WebUI.click(findTestObject('Object Repository/Page_LiveSust/em_Company Name_lnr lnr-chevron-down'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LiveSust/input_Maximum of 20 Characters_Confirm Password'), 
    'A6mEPJzh5E0jyMlyB9kA3w==')

WebUI.click(findTestObject('Object Repository/Page_LiveSust/em_Company Name_lnr lnr-chevron-down'))

WebUI.click(findTestObject('Object Repository/Page_LiveSust/em_Company Name_lnr lnr-chevron-down'))

WebUI.click(findTestObject('Object Repository/Page_LiveSust/button_Save Password'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_LiveSust/div_Password has been changed successfully'), 
    0)

