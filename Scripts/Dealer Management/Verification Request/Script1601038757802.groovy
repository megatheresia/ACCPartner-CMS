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

WebUI.click(findTestObject('Object Repository/Dealer Management/DD verification request'))

WebUI.setText(findTestObject('Object Repository/Dealer Management/input search verification'), varSearchVerification)

WebUI.click(findTestObject('Object Repository/Dealer Management/button search verification'))

WebUI.click(findTestObject('Object Repository/Dealer Management/button detail'))

WebUI.setText(findTestObject('Object Repository/Dealer Management/input kode salesman'), varKodeSalesman)

WebUI.setText(findTestObject('Object Repository/Dealer Management/input nama salesman'), varNamaSalesman)

WebUI.setText(findTestObject('Object Repository/Dealer Management/input email salesman'), varEmailSalesman)

WebUI.setText(findTestObject('Object Repository/Dealer Management/input no handphone salesman'), varNoHPSalesman)

WebUI.click(findTestObject('Dealer Management/klik jabatan'))

WebUI.click(findTestObject('Dealer Management/LOV jabatan', [('text') : varJabatan]))

WebUI.setText(findTestObject('Object Repository/Dealer Management/input nama ajalan salesman'), varNamaJalan)

WebUI.setText(findTestObject('Object Repository/Dealer Management/input kode pos salesman'), varKodePos)

WebUI.setText(findTestObject('Object Repository/Dealer Management/input kelurahan salesman (1)'), varKel)

WebUI.setText(findTestObject('Object Repository/Dealer Management/input kecamatan salesman'), varKec)

WebUI.setText(findTestObject('Object Repository/Dealer Management/input nama kota salesman'), varKota)

WebUI.setText(findTestObject('Object Repository/Dealer Management/input provinsi salesman'), varProv)

WebUI.mouseOver(findTestObject('Dealer Management/button_VERIFY', [('text') : varVerify]))

WebUI.click(findTestObject('Dealer Management/button_VERIFY', [('text') : varVerify]))

WebUI.delay(10)

if (varBenar == 'Y') {
    WebUI.verifyElementNotVisible(findTestObject('Dealer Management/input kode salesman'))
} else {
    WebUI.delay(6)

    WebUI.verifyElementVisible(findTestObject('Dealer Management/warning phone num failed'))

    WebUI.click(findTestObject('Dealer Management/button ok verf req'))
}

