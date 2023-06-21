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

WebUI.setText(findTestObject('Object Repository/Page_LiveSust/input_Provider Log In_Username  E-Mail Address'), 'Sachin@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LiveSust/input_Username  E-Mail Address_Password'), '+p0xE3Qc9agwqAa4cuTULg==')

WebUI.click(findTestObject('Object Repository/Page_LiveSust/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_LiveSust/span_Crews'))

WebUI.click(findTestObject('Object Repository/Page_LiveSust/div_Filter Status'))

WebUI.click(findTestObject('Object Repository/Page_LiveSust/label_Active'))

WebUI.click(findTestObject('Object Repository/Page_LiveSust/ul_ActiveSelect AllUnSelect AllActiveInacti_00ceea'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_LiveSust/span_Active'))

WebUI.closeBrowser()

