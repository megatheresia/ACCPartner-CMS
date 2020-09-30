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

WebUI.click(findTestObject('Object Repository/Content Man/perhitungan cash rewards'))

WebUI.click(findTestObject('Object Repository/Content Man/tambah perhitungan cash rewards'))

WebUI.setText(findTestObject('Object Repository/Content Man/input title cash rewards'), varTitle)

CustomKeywords.'web.uploadfile.uploadFile'(findTestObject('Content Man/upload file CR'), varFile)

WebUI.click(findTestObject('Content Man/klik status CR'))

WebUI.click(findTestObject('Content Man/status CR'))

WebUI.click(findTestObject('Content Man/div out CR'))

WebUI.scrollToElement(findTestObject('Content Man/button submit CR'), 0)

WebUI.click(findTestObject('Object Repository/Content Man/button submit CR'))

WebUI.click(findTestObject('Object Repository/Content Man/button yes CR'))

if (varBenar == 'Y') {
    WebUI.click(findTestObject('Object Repository/Content Man/button ok CR'))

    WebUI.setText(findTestObject('Object Repository/Content Man/input search CR'), varSearch)

    WebUI.click(findTestObject('Object Repository/Content Man/button search CR'))

    WebUI.click(findTestObject('Object Repository/Content Man/edit CR'))

    WebUI.setText(findTestObject('Object Repository/Content Man/input title cash rewards'), varNewTitle)

    WebUI.click(findTestObject('Object Repository/Content Man/button submit CR'))

    WebUI.click(findTestObject('Object Repository/Content Man/button yes CR'))

    WebUI.click(findTestObject('Object Repository/Content Man/button ok CR'))
} else {
    WebUI.verifyElementNotVisible(findTestObject('Content Man/success ring CR'))
}

