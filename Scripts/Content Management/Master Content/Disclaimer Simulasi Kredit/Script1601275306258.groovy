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

WebUI.click(findTestObject('Object Repository/Content Man/DD disclaimer simulasi credit'))

WebUI.click(findTestObject('Object Repository/Content Man/tambah disclaimer simulasi kredit'))

WebUI.setText(findTestObject('Object Repository/Content Man/input title SC'), varTitle)

WebUI.setText(findTestObject('Object Repository/Content Man/input deskripsi SC'), varDeskripsi)

WebUI.click(findTestObject('Content Man/klik status'))

WebUI.click(findTestObject('Content Man/LOV status sc', [('text') : varStatus]))

WebUI.click(findTestObject('Object Repository/Content Man/button submit SC'))

WebUI.click(findTestObject('Object Repository/Content Man/button sc'))

WebUI.click(findTestObject('Object Repository/Content Man/button ok sc'))

WebUI.setText(findTestObject('Object Repository/Content Man/input search sc'), varSearch)

WebUI.click(findTestObject('Object Repository/Content Man/button search sc'))

if (varBenar == 'Y') {
    WebUI.click(findTestObject('Object Repository/Content Man/edit sc'))

    WebUI.setText(findTestObject('Object Repository/Content Man/input title SC'), varTitle2)

    WebUI.click(findTestObject('Object Repository/Content Man/button submit SC'))

    WebUI.click(findTestObject('Object Repository/Content Man/button sc'))

    WebUI.click(findTestObject('Object Repository/Content Man/button ok sc'))
} else {
    WebUI.verifyElementVisible(findTestObject('Content Man/showing 0 to 0 of 0 entries sc'))
}

