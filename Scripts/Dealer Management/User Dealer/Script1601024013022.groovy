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

WebUI.click(findTestObject('Object Repository/Dealer Management/dealer management'))

WebUI.click(findTestObject('Object Repository/Dealer Management/DD User dealer'))

WebUI.setText(findTestObject('Object Repository/Dealer Management/input search dealer'), varSearchDealer)

WebUI.click(findTestObject('Object Repository/Dealer Management/button search dealer'))

WebUI.click(findTestObject('Object Repository/Dealer Management/buttton detail dealer'))

WebUI.setText(findTestObject('Object Repository/Dealer Management/input no hp dealer'), varNoHP)

WebUI.click(findTestObject('Dealer Management/klik active  no'))

WebUI.click(findTestObject('Dealer Management/LOV active'))

WebUI.setText(findTestObject('Object Repository/Dealer Management/input alamat'), varAlamat)

WebUI.setText(findTestObject('Object Repository/Dealer Management/input kel'), varKel)

WebUI.setText(findTestObject('Object Repository/Dealer Management/input kec'), varKec)

WebUI.setText(findTestObject('Object Repository/Dealer Management/input kota'), varKota)

WebUI.setText(findTestObject('Object Repository/Dealer Management/input prov'), varProv)

WebUI.setText(findTestObject('Object Repository/Dealer Management/input kode pos'), varKodePos)

WebUI.click(findTestObject('Dealer Management/klik status'))

WebUI.click(findTestObject('Dealer Management/LOV Used', [('text') : varStatus]))

WebUI.scrollToElement(findTestObject('Dealer Management/edit user dealer'), 0)

WebUI.click(findTestObject('Object Repository/Dealer Management/button submit'))

if (varBenar == 'Y') {
    WebUI.verifyElementNotVisible(findTestObject('Dealer Management/input no hp dealer'))
} else {
    WebUI.verifyElementNotVisible(findTestObject('Dealer Management/input no hp dealer'))
}

