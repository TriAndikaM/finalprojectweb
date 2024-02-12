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

WebUI.selectOptionByValue(findTestObject('Object Repository/contact_us/select_Select CategoryLaptopsHeadphonesTabl_1ef56f'), 
    'object:60', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/contact_us/select_Select ProductHP Chromebook 14 G1(EN_361ba3'), 
    'object:127', true)

WebUI.click(findTestObject('Object Repository/contact_us/input__emailContactUs'))

WebUI.setText(findTestObject('Object Repository/contact_us/input__emailContactUs'), 'kucing@gmail.com')

WebUI.setText(findTestObject('Object Repository/contact_us/textarea__subjectTextareaContactUs'), 'laptopnya masih ada stoknya gak?')

WebUI.click(findTestObject('Object Repository/contact_us/button_SEND'))

WebUI.closeBrowser()

