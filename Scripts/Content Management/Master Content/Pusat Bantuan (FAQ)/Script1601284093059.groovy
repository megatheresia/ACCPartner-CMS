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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://accseamless.stage.digitalintegrasiasia.com/h4l4m4nl091nSAdm')

WebUI.setText(findTestObject('Login/username'), varUsername)

WebUI.setText(findTestObject('Login/password'), varPassword)

WebUI.delay(10)

WebUI.click(findTestObject('Login/button sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Content Man/content management'))

WebUI.click(findTestObject('Content Man/DD master content'))

WebUI.click(findTestObject('Object Repository/Content Man/pusat bantuan (faq)'))

WebUI.click(findTestObject('Object Repository/Content Man/tambah pusat bantuan'))

WebUI.setText(findTestObject('Object Repository/Content Man/input title pusat bantuan'), varTitle)

WebUI.setText(findTestObject('Object Repository/Content Man/input deksripsi pusat bantuan'), varDeskripsi)

WebUI.click(findTestObject('Content Man/klik status faq'))

WebUI.click(findTestObject('Content Man/LOV status faq', [('text') : varStatus]))

WebUI.click(findTestObject('Object Repository/Content Man/button submit faq'))

WebUI.click(findTestObject('Object Repository/Content Man/button yes faq'))

WebUI.click(findTestObject('Object Repository/Content Man/button ok faq'))

WebUI.setText(findTestObject('Object Repository/Content Man/input search faq'), varSearch)

WebUI.click(findTestObject('Object Repository/Content Man/button search faq'))

if (varBenar == 'Y') {
    WebUI.click(findTestObject('Object Repository/Content Man/edit faq'))

    WebUI.setText(findTestObject('Object Repository/Content Man/input title pusat bantuan'), varNewTitle)

    WebUI.click(findTestObject('Object Repository/Content Man/button submit faq'))

    WebUI.click(findTestObject('Object Repository/Content Man/button yes faq'))

    WebUI.click(findTestObject('Object Repository/Content Man/button ok faq'))
} else {
    WebUI.verifyElementVisible(findTestObject('Content Man/showing 0 to 0 of 0 entries faq'))
}

