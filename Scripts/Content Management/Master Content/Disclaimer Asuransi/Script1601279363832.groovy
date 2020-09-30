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

WebUI.click(findTestObject('Content Man/disclaimer asuransi'))

WebUI.click(findTestObject('Content Man/tambah disclaimer asuransi'))

WebUI.setText(findTestObject('Content Man/input tittle asuransi'), varTitle)

WebUI.setText(findTestObject('Content Man/input deskripsi asuransi'), varDeskripsi)

WebUI.click(findTestObject('Content Man/klik status asuransi'))

WebUI.click(findTestObject('Content Man/LOV status asuransi', [('text') : varStatus]))

WebUI.click(findTestObject('Content Man/button submit asuransi'))

WebUI.click(findTestObject('Content Man/button yes asuransi'))

WebUI.click(findTestObject('Content Man/button ok asuransi'))

WebUI.setText(findTestObject('Content Man/input search asuransi'), varSearch)

WebUI.click(findTestObject('Content Man/button search asuransi'))

if (varBenar == 'Y') {
    WebUI.click(findTestObject('Content Man/button edit'))

    WebUI.setText(findTestObject('Content Man/input tittle asuransi'), varNewTitle)

    WebUI.click(findTestObject('Content Man/button submit asuransi'))

    WebUI.click(findTestObject('Content Man/button yes asuransi'))

    WebUI.click(findTestObject('Content Man/button ok asuransi'))
} else {
    WebUI.verifyElementVisible(findTestObject('Content Man/showing 0 to 0 of 0 entries asuransi'))
}

