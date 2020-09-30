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

WebUI.click(findTestObject('Object Repository/Rewards/rewards'))

WebUI.click(findTestObject('Object Repository/Rewards/download template rewards'))

WebUI.delay(5)

WebUI.click(findTestObject('Rewards/up file rewards'))

CustomKeywords.'web.uploadfile.uploadFile'(findTestObject('Rewards/upload file rewards'), varFile)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Rewards/button save rewards'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Rewards/button detail rewards'))

WebUI.click(findTestObject('Object Repository/Rewards/button submit rewards'))

WebUI.click(findTestObject('Object Repository/Rewards/button ok rewards'))

WebUI.setText(findTestObject('Object Repository/Rewards/input search rewards'), varSearch)

WebUI.click(findTestObject('Object Repository/Rewards/button search rewards'))

if (varBenar == 'Y') {
    WebUI.verifyElementNotVisible(findTestObject('Rewards/ID 94'))
} else {
    WebUI.verifyElementNotVisible(findTestObject('Rewards/ID 94'))
}

