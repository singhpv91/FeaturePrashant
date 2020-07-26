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

WebUI.navigateToUrl('https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fflights%2F&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_hfctl_in&openid.mode=checkid_setup&marketPlaceId=A21TJRUUN4KGV&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=Amazon&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.pape.max_auth_age=3600&siteState=clientContext%3D258-7765066-3693708%2CsourceUrl%3Dhttps%253A%252F%252Fwww.amazon.in%252Fflights%252F%2Csignature%3DreDdYeyj2BBQYl6Ee7OwZYGLKzV4Ej3D')

WebUI.setText(findTestObject('Page_Amazon Sign In/input_Email or mobile phone number_email'), '9664364993')

WebUI.click(findTestObject('Object Repository/Page_Amazon Sign In/label_Password'))

WebUI.setEncryptedText(findTestObject('Page_Amazon Sign In/input_Forgot Password_password'), 'CRqjWPeblyV95o9fznV5pg==')

WebUI.click(findTestObject('Page_Amazon Sign In/input_Enter your password_signInSubmit'))

WebUI.click(findTestObject('Object Repository/Page_Flight Bookings on Amazon/span_Mumbai'))

WebUI.click(findTestObject('Object Repository/Page_Flight Bookings on Amazon/span_New Delhi'))

WebUI.click(findTestObject('Object Repository/Page_Flight Bookings on Amazon/span_14 Aug'))

WebUI.click(findTestObject('Object Repository/Page_Flight Bookings on Amazon/span_14 Aug'))

WebUI.click(findTestObject('Page_Flight Bookings on Amazon/button_Search'))

WebUI.click(findTestObject('Page_Flight Bookings on Amazon/button_Non-stop'))

WebUI.click(findTestObject('Object Repository/Page_Flight Bookings on Amazon/button_Duration'))

WebUI.click(findTestObject('Page_Flight Bookings on Amazon/button_Book'))

WebUI.click(findTestObject('Page_Flight Bookings on Amazon/a_Proceed to traveller details'))

WebUI.click(findTestObject('Page_Flight Bookings on Amazon/i_(01)__35b71c27 e5ee2c83'))

WebUI.click(findTestObject('Page_Flight Bookings on Amazon/button_Proceed to review'))

WebUI.setText(findTestObject('Object Repository/Page_Flight Bookings on Amazon/input_Email_communication_email'), 'Singhpv91@gmail.com')

WebUI.click(findTestObject('Page_Flight Bookings on Amazon/button_Proceed to review'))

WebUI.click(findTestObject('Page_Flight Bookings on Amazon/i_Total Amount__35b71c27 e5ee2c83'))

WebUI.click(findTestObject('Page_Flight Bookings on Amazon/button_Proceed to Payment'))

WebUI.closeBrowser()

