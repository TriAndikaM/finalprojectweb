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

WebUI.callTestCase(findTestCase('TC009 - Menambahkan Produk Ke Keranjang'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/checkout_page/button_CHECKOUT (1,099.98)'))

WebUI.click(findTestObject('Object Repository/checkout_page/button_NEXT'))

switch(payment_method) {
	case payment_method = "safepay":
		println("Metode pembayaran safepay")
		WebUI.waitForElementVisible(findTestObject('Object Repository/checkout_page/img_safepay'), 10)
		WebUI.click(findTestObject('Object Repository/checkout_page/img_safepay'))
		WebUI.waitForElementClickable(findTestObject('Object Repository/checkout_page/button_pay_safepay'), 10)
		WebUI.click(findTestObject('Object Repository/checkout_page/button_pay_safepay'))
	break
	
	case payment_method = "mastercard":
		println("Metode pembayaran mastercard")
		WebUI.waitForElementVisible(findTestObject('Object Repository/checkout_page/img_1'), 10)
		WebUI.click(findTestObject('Object Repository/checkout_page/img_1'))
		WebUI.waitForElementClickable(findTestObject('Object Repository/checkout_page/button_PAY NOW'), 10)
		WebUI.click(findTestObject('Object Repository/checkout_page/button_PAY NOW'))
	break
}



WebUI.delay(8)

WebUI.closeBrowser()