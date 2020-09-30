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

WebUI.click(findTestObject('Master Management/master management'))

WebUI.click(findTestObject('Master Management/a_Master Periode (1)'))

WebUI.click(findTestObject('Object Repository/Master Management/tambah master periode'))

WebUI.setText(findTestObject('Object Repository/Master Management/input mulai periode'), varMulai)

WebUI.setText(findTestObject('Object Repository/Master Management/input periode selesai'), varSelesai)

WebUI.click(findTestObject('Object Repository/Master Management/button submit periode'))

WebUI.click(findTestObject('Object Repository/Master Management/button ok periode'))

WebUI.setText(findTestObject('Object Repository/Master Management/input search periode'), varSearch)

WebUI.click(findTestObject('Object Repository/Master Management/button input periode'))

if (varBenar == 'Y') {
    WebUI.click(findTestObject('Object Repository/Master Management/detail periode'))

    WebUI.setText(findTestObject('Object Repository/Master Management/input periode selesai'), varUbahSelesai)

    WebUI.click(findTestObject('Object Repository/Master Management/button submit periode'))

    WebUI.click(findTestObject('Object Repository/Master Management/button ok periode'))

    WebUI.click(findTestObject('Object Repository/Master Management/button delete periode'))

    WebUI.click(findTestObject('Object Repository/Master Management/button yes periode'))
} else {
    WebUI.verifyElementVisible(findTestObject('Master Management/showing 0 to 0 of 0 entries master periode'))
}

