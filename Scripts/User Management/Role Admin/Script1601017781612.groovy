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

WebUI.delay(2)

WebUI.click(findTestObject('CMS Management/user management'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/CMS Management/DD Role Admin'))

WebUI.setText(findTestObject('Object Repository/CMS Management/input serach admin'), varSearch)

WebUI.click(findTestObject('Object Repository/CMS Management/button search admin'))

if (varBenar == 'Y') {
    WebUI.verifyElementVisible(findTestObject('CMS Management/detail admin'))

    WebUI.click(findTestObject('CMS Management/detail admin'))

    WebUI.setText(findTestObject('CMS Management/admin name'), varNamaAdmin)

    WebUI.click(findTestObject('CMS Management/uncheck GCM'))

    WebUI.click(findTestObject('CMS Management/submit admin'))

    WebUI.click(findTestObject('CMS Management/button ok admin'))
} else {
    WebUI.verifyElementNotVisible(findTestObject('CMS Management/detail admin'))
}

