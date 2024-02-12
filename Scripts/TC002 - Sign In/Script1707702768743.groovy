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

WebUI.navigateToUrl('https://advantageonlineshopping.com/?authuser=0#/')

WebUI.click(findTestObject('Object Repository/Sign In_Advantage Shopping/a_My account                        My orde_124641'))

WebUI.setText(findTestObject('Object Repository/Sign In_Advantage Shopping/input_OR_username'), GlobalVariable.username)

WebUI.setText(findTestObject('Object Repository/Sign In_Advantage Shopping/input_Username_password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Sign In_Advantage Shopping/input_Email_remember_me'))

WebUI.click(findTestObject('Object Repository/Sign In_Advantage Shopping/button_SIGN IN'))

account = WebUI.verifyElementVisible(findTestObject('Object Repository/Sign In_Advantage Shopping/account_name'),FailureHandling.OPTIONAL)

if (account) {
	println("Berhasil Masuk")
}else {
	println("Gagal Masuk")
}

WebUI.delay(3)
