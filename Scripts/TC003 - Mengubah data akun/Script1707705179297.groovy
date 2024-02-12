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

WebUI.callTestCase(findTestCase('TC002 - Sign In'), [('account') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Edit Details_Advantage Shopping/svg_kucing_menuUser'))

WebUI.click(findTestObject('Object Repository/Edit Details_Advantage Shopping/label_My account'))

WebUI.click(findTestObject('Object Repository/Edit Details_Advantage Shopping/a_Edit'))

WebUI.doubleClick(findTestObject('Object Repository/Edit Details_Advantage Shopping/input_- Use maximum 30 character_phone_numb_65665d'))

WebUI.setText(findTestObject('Object Repository/Edit Details_Advantage Shopping/input_- Use maximum 30 character_phone_numb_65665d'), 
    '0813318728302')

WebUI.setText(findTestObject('Object Repository/Edit Details_Advantage Shopping/input_Country_cityAccountDetails'), 'Jakarta')

WebUI.doubleClick(findTestObject('Object Repository/Edit Details_Advantage Shopping/input_Country_cityAccountDetails'))

WebUI.setText(findTestObject('Object Repository/Edit Details_Advantage Shopping/input_Country_cityAccountDetails'), 'Tangerang')

WebUI.setText(findTestObject('Object Repository/Edit Details_Advantage Shopping/input_- Use maximum 25 character_addressAcc_127d32'), 
    'Jakarta')

WebUI.doubleClick(findTestObject('Object Repository/Edit Details_Advantage Shopping/input_- Use maximum 25 character_addressAcc_127d32'))

WebUI.setText(findTestObject('Object Repository/Edit Details_Advantage Shopping/input_- Use maximum 25 character_addressAcc_127d32'), 
    'Tangerang')

WebUI.setText(findTestObject('Object Repository/Edit Details_Advantage Shopping/input_- Use maximum 10 character_state__pro_cfb8b5'), 
    'Jakarta')

WebUI.doubleClick(findTestObject('Object Repository/Edit Details_Advantage Shopping/input_- Use maximum 10 character_state__pro_cfb8b5'))

WebUI.setText(findTestObject('Object Repository/Edit Details_Advantage Shopping/input_- Use maximum 10 character_state__pro_cfb8b5'), 
    'Tangerang Selatan')

WebUI.setText(findTestObject('Object Repository/Edit Details_Advantage Shopping/input_- Use maximum 50 character_postal_cod_af6569'), 
    '88')

WebUI.doubleClick(findTestObject('Object Repository/Edit Details_Advantage Shopping/input_- Use maximum 50 character_postal_cod_af6569'))

WebUI.setText(findTestObject('Object Repository/Edit Details_Advantage Shopping/input_- Use maximum 50 character_postal_cod_af6569'), 
    '897213')

WebUI.setText(findTestObject('Object Repository/Edit Details_Advantage Shopping/input_- Use maximum 10 character_state__pro_cfb8b5'), 
    'Tangerang')

WebUI.click(findTestObject('Object Repository/Edit Details_Advantage Shopping/button_SAVE'))

WebUI.closeBrowser()

