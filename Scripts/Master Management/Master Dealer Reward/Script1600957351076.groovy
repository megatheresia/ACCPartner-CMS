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

WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Master Management/master management'))

WebUI.click(findTestObject('Object Repository/Master Management/DD master dealer reward'))

WebUI.click(findTestObject('Object Repository/Master Management/tambah master dealer reward'))

WebUI.setText(findTestObject('Object Repository/Master Management/input name reward'), varNameReward)

WebUI.setText(findTestObject('Object Repository/Master Management/input from value'), varFromValue)

WebUI.setText(findTestObject('Object Repository/Master Management/input to value'), varToValue)

WebUI.click(findTestObject('Master Management/klik status dealer reward'))

WebUI.click(findTestObject('Master Management/LOV active dealer reward', [('text') : varStatusDealer]))

WebUI.click(findTestObject('Object Repository/Master Management/button subit'))

WebUI.click(findTestObject('Master Management/button_Ok'))

WebUI.click(findTestObject('Master Management/button cancel'))

WebUI.click(findTestObject('Master Management/button yes'))

WebUI.setText(findTestObject('Master Management/input search dealer reward'), varSearch)

WebUI.click(findTestObject('Master Management/button search dealer award'))

if (varBenar == 'Y') {
    WebUI.verifyElementVisible(findTestObject('Master Management/klik edit'))

    WebUI.click(findTestObject('Master Management/klik edit'))

    WebUI.setText(findTestObject('Master Management/input to value'), varToValueEdit)

    WebUI.click(findTestObject('Master Management/klik status dealer reward'))

    WebUI.click(findTestObject('Master Management/LOV active dealer reward'))

    WebUI.click(findTestObject('Master Management/button subit'))

    WebUI.click(findTestObject('Master Management/button_Ok'))
} else {
    WebUI.verifyElementVisible(findTestObject('Master Management/showing 0 to 0 of 0 entries dealer rewrd'))
}

