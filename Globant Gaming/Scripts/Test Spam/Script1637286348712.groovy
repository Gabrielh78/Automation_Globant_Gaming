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

WebUI.navigateToUrl('https://more.globant.com/webmail/497451/853623151/9db0f38a75f465e708becff6a7543dd34ae33c79aa5f3efbea583b1e07ed1b17')

WebUI.scrollToElement(findTestObject('Page_Globant Gaming Studio/span_Check it out here'), 0)

WebUI.click(findTestObject('Object Repository/Page_Globant Gaming Studio/span_Check it out here'))

WebUI.scrollToElement(findTestObject('Page_Globant Gaming Studio/span_VIEW MORE'), 0)

WebUI.click(findTestObject('Object Repository/Page_Globant Gaming Studio/span_VIEW MORE'))

WebUI.scrollToElement(findTestObject('Page_Globant Gaming Studio/span_MORE INFO'), 0)

WebUI.click(findTestObject('Object Repository/Page_Globant Gaming Studio/span_MORE INFO'))

WebUI.scrollToElement(findTestObject('Page_Globant Gaming Studio/span_LISTEN'), 0)

WebUI.click(findTestObject('Object Repository/Page_Globant Gaming Studio/span_LISTEN'))

WebUI.scrollToElement(findTestObject('Page_Globant Gaming Studio/span_Click here to know more'), 0)

WebUI.click(findTestObject('Object Repository/Page_Globant Gaming Studio/span_Click here to know more'))

