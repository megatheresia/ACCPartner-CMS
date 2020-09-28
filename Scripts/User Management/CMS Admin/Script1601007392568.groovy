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

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/CMS Management/user management'))

WebUI.click(findTestObject('Object Repository/CMS Management/DD CMS admin'))

WebUI.click(findTestObject('Object Repository/CMS Management/klik add admin'))

WebUI.setText(findTestObject('Object Repository/CMS Management/input username'), varUsername)

WebUI.setText(findTestObject('Object Repository/CMS Management/input nama admin'), varNama)

WebUI.setText(findTestObject('Object Repository/CMS Management/input email admin'), varEmail)

WebUI.setText(findTestObject('Object Repository/CMS Management/input npk'), varNPK)

WebUI.click(findTestObject('CMS Management/klik brand'))

WebUI.click(findTestObject('CMS Management/LOV NEW DAIHATSU', [('text') : varBrand]))

WebUI.click(findTestObject('CMS Management/klik active'))

WebUI.click(findTestObject('CMS Management/LOV Active', [('text') : varACT]))

WebUI.setText(findTestObject('Object Repository/CMS Management/input password'), varPassword)

WebUI.setText(findTestObject('Object Repository/CMS Management/retype password'), varPassword)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('CMS Management/tambah CMS Admin'), 0)

WebUI.click(findTestObject('CMS Management/buttn save'))

WebUI.click(findTestObject('CMS Management/button ok'))

WebUI.setText(findTestObject('CMS Management/input search'), varSearch)

WebUI.click(findTestObject('CMS Management/button search'))

if (varBenar == 'Y') {
    WebUI.click(findTestObject('CMS Management/a_DETAIL (1)'))

    WebUI.setText(findTestObject('CMS Management/input username'), varUsername1)

    WebUI.click(findTestObject('CMS Management/submit cms admin'))

    WebUI.click(findTestObject('CMS Management/button ok'))
} else {
    WebUI.verifyElementVisible(findTestObject('CMS Management/showing 0 to 0 of 0 entries'))
}

