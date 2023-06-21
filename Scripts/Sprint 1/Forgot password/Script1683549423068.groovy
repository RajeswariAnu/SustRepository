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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_LiveSust/a_Forgot Password'))

WebUI.setText(findTestObject('Object Repository/Page_LiveSust/input_Having trouble logging in_E-Mail Address'), 'benedicta@yopmail.com')

WebUI.click(findTestObject('Object Repository/Page_LiveSust/button_Continue'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_LiveSust/div_Email Sent successfully'), 0)

WebUI.setText(findTestObject('Object Repository/Page_LiveSust/input_Having trouble logging in_otp_0_sel5c_9fb327'), '6')

WebUI.setText(findTestObject('Object Repository/Page_LiveSust/input_Having trouble logging in_otp_1_sel5c_45af05'), '0')

WebUI.setText(findTestObject('Object Repository/Page_LiveSust/input_Having trouble logging in_otp_2_sel5c_195f70'), '7')

WebUI.setText(findTestObject('Object Repository/Page_LiveSust/input_Having trouble logging in_otp_3_sel5c_df0db2'), '9')

WebUI.click(findTestObject('Object Repository/Page_LiveSust/button_Continue'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_LiveSust/div_OTP verified successfully'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LiveSust/input_Enter New Password_Enter Password'), 'A6mEPJzh5E0zn4FxjKHQNA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LiveSust/input_Maximum of 20 Characters_Re-Enter Password'), 
    'A6mEPJzh5E0zn4FxjKHQNA==')

WebUI.click(findTestObject('Object Repository/Page_LiveSust/button_Save Password'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_LiveSust/div_Password has been changed successfully'), 
    0)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

