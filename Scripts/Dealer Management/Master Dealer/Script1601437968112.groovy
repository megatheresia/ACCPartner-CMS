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

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Login/button sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Dealer Management/dealer management'))

WebUI.click(findTestObject('Dealer Management/a_Master Dealer'))

WebUI.click(findTestObject('Object Repository/Dealer Management/tambah master dealer'))

WebUI.click(findTestObject('Object Repository/Dealer Management/browse MD'))

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('Object Repository/Dealer Management/input search MD'), varSearch1)

WebUI.click(findTestObject('Object Repository/Dealer Management/button search MD'))

WebUI.click(findTestObject('Object Repository/Dealer Management/pilih dealer MD'))

WebUI.setText(findTestObject('Object Repository/Dealer Management/input search MD cab'), varSearch2)

WebUI.click(findTestObject('Object Repository/Dealer Management/button search MD'))

WebUI.click(findTestObject('Object Repository/Dealer Management/pilih dealer cab MD'))

WebUI.click(findTestObject('Dealer Management/klik type dealer MD'))

WebUI.click(findTestObject('Dealer Management/LOV type dealer MD', [('text') : varTypeDealer]))

WebUI.click(findTestObject('Dealer Management/klik brand MD'))

WebUI.click(findTestObject('Dealer Management/LOV brand MD', [('text') : varBrand]))

WebUI.click(findTestObject('Dealer Management/klik status MD'))

WebUI.click(findTestObject('Dealer Management/LOV status MD', [('text') : varTypeDealer]))

WebUI.delay(0)

WebUI.setText(findTestObject('Object Repository/Dealer Management/input kode pos MD'), varKodePos)

WebUI.click(findTestObject('Object Repository/Dealer Management/check kode pos'))

WebUI.setText(findTestObject('Object Repository/Dealer Management/input provinsi MD'), varProvinsi)

WebUI.setText(findTestObject('Object Repository/Dealer Management/input alamat MD'), varAlamat)

WebUI.scrollToElement(findTestObject('Dealer Management/new master dealer'), 0)

WebUI.click(findTestObject('Object Repository/Dealer Management/button save MD'))

if (varBenar == 'Y') {
    WebUI.click(findTestObject('Object Repository/Dealer Management/button ok MD'))

    WebUI.click(findTestObject('Dealer Management/button cancel'))

    WebUI.delay(3)

    WebUI.click(findTestObject('Dealer Management/breadcrumb MD'))

    WebUI.setText(findTestObject('Object Repository/Dealer Management/input search MD dashboard'), varSearch3)

    WebUI.click(findTestObject('Object Repository/Dealer Management/button search MD'))

    WebUI.click(findTestObject('Object Repository/Dealer Management/button send reff code'))

    WebUI.click(findTestObject('Object Repository/Dealer Management/input contact person MD'))

    WebUI.setText(findTestObject('Object Repository/Dealer Management/input contact person MD'), varCP)

    WebUI.setText(findTestObject('Object Repository/Dealer Management/input no hp MD'), varNoHP)

    WebUI.click(findTestObject('Object Repository/Dealer Management/button saveno hp MD'))

    WebUI.click(findTestObject('Dealer Management/button ok cp MD', [('text') : 'ok']))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Object Repository/Dealer Management/input search MD dashboard'), varSearch3)

    WebUI.click(findTestObject('Object Repository/Dealer Management/button search MD'))

    WebUI.click(findTestObject('Object Repository/Dealer Management/button alamat MD'))

    WebUI.click(findTestObject('Object Repository/Dealer Management/button close alamat MD'))

    WebUI.click(findTestObject('Object Repository/Dealer Management/button detail MD'))

    WebUI.setText(findTestObject('Object Repository/Dealer Management/input new contact person MD'), varCPedit)

    WebUI.click(findTestObject('Object Repository/Dealer Management/button save MD'))

    WebUI.click(findTestObject('Object Repository/Dealer Management/button ok MD'))
} else {
    WebUI.verifyElementVisible(findTestObject('Dealer Management/panjang kode pos tidak bisa lebih dari 5 dan kurang dari 5 karakter'))
}

