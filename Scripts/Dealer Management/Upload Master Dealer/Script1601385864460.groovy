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

WebUI.click(findTestObject('Dealer Management/dealer management'))

WebUI.click(findTestObject('Object Repository/Dealer Management/upload master dealer'))

WebUI.click(findTestObject('Object Repository/Dealer Management/download template master dealer'))

WebUI.click(findTestObject('Dealer Management/upload insert file master'))

CustomKeywords.'web.uploadfile.uploadFile'(findTestObject('Dealer Management/drop files to upload master dealer'), varFile)

WebUI.click(findTestObject('Object Repository/Dealer Management/button save master dealer'))

WebUI.click(findTestObject('Object Repository/Dealer Management/detail master dealer'))

WebUI.click(findTestObject('Object Repository/Dealer Management/button submit master dealer'))

WebUI.click(findTestObject('Object Repository/Dealer Management/cancel master dealer'))

WebUI.setText(findTestObject('Object Repository/Dealer Management/input search master edaler'), varSearch)

WebUI.click(findTestObject('Object Repository/Dealer Management/button search master dealer'))

if (varBenar == 'Y') {
    WebUI.verifyElementNotVisible(findTestObject('Dealer Management/ID 45'))
} else {
    WebUI.verifyElementNotVisible(findTestObject('Dealer Management/ID 45'))
}

