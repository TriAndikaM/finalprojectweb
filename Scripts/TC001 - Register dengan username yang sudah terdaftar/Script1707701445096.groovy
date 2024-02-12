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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Register_Advantage Shopping/path_CHECKOUT  (0.00)_menuUserSVGPath'))

WebUI.click(findTestObject('Object Repository/Register_Advantage Shopping/a_CREATE NEW ACCOUNT'))

WebUI.setText(findTestObject('Object Repository/Register_Advantage Shopping/input__usernameRegisterPage'), 'kucing')

WebUI.setText(findTestObject('Object Repository/Register_Advantage Shopping/input__emailRegisterPage'), 'kucing@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Register_Advantage Shopping/input__passwordRegisterPage'), 'AMJRczSjP+g=')

WebUI.setEncryptedText(findTestObject('Object Repository/Register_Advantage Shopping/input__confirm_passwordRegisterPage'), 
    'AMJRczSjP+g=')

WebUI.setText(findTestObject('Object Repository/Register_Advantage Shopping/input_PERSONAL DETAILS_first_nameRegisterPage'), 
    'kucing')

WebUI.setText(findTestObject('Object Repository/Register_Advantage Shopping/input_- Use maximum 30 character_last_nameR_6ef033'), 
    'garong')

WebUI.setText(findTestObject('Object Repository/Register_Advantage Shopping/input_- Use maximum 30 character_phone_numb_7c938a'), 
    '081234')

WebUI.selectOptionByValue(findTestObject('Object Repository/Register_Advantage Shopping/select_AfganistanAlbaniaAlgeriaAmerican Sam_3cef8a'), 
    'object:162', true)

WebUI.setText(findTestObject('Object Repository/Register_Advantage Shopping/input_Country_cityRegisterPage'), 'Jakarta')

WebUI.setText(findTestObject('Object Repository/Register_Advantage Shopping/input_- Use maximum 25 character_addressReg_9e23b3'), 
    'Jakarta')

WebUI.setText(findTestObject('Object Repository/Register_Advantage Shopping/input_- Use maximum 50 character_state__pro_272a54'), 
    'Jakarta')

WebUI.setText(findTestObject('Object Repository/Register_Advantage Shopping/input_- Use maximum 10 character_postal_cod_639c2f'), 
    '123456')

WebUI.click(findTestObject('Object Repository/Register_Advantage Shopping/input_Receive exclusive offers and promotio_5c7450'))

WebUI.click(findTestObject('Object Repository/Register_Advantage Shopping/button_REGISTER'))

account_exist = WebUI.verifyElementVisible(findTestObject('Object Repository/Register_Advantage Shopping/label_User name already exists'),FailureHandling.OPTIONAL)

if (account_exist) {
	println("Akun sudah didaftarkan")
}else {
	println("Akun belum didaftarkan")
}

WebUI.delay(3)

WebUI.closeBrowser()

