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

WebUI.click(findTestObject('Master Management/DD master active time'))

WebUI.setText(findTestObject('Master Management/input search active time'), varSearch)

WebUI.click(findTestObject('Master Management/ikon search active time'))

if (varBenar == 'Y') {
    WebUI.verifyElementVisible(findTestObject('Master Management/search verified'))

    WebUI.click(findTestObject('Master Management/edit master active time'))

    WebUI.setText(findTestObject('Master Management/input jangka waktu'), varJangkaWaktu)

    WebUI.click(findTestObject('Master Management/submit active time'))

    WebUI.click(findTestObject('Master Management/ok active time'))
} else {
    WebUI.verifyElementVisible(findTestObject('Master Management/0 to 0 entries master active time'))
}

