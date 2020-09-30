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

WebUI.click(findTestObject('Dealer Management/menu dealer management'))

WebUI.click(findTestObject('Dealer Management/DD manage executive'))

WebUI.click(findTestObject('Dealer Management/tambah executive'))

WebUI.click(findTestObject('Dealer Management/browse executive'))

WebUI.delay(30)

WebUI.setText(findTestObject('Dealer Management/search master dealer'), varSearchMasterDealer)

WebUI.click(findTestObject('Dealer Management/button search exe'))

WebUI.click(findTestObject('Dealer Management/klik master dealer'))

WebUI.setText(findTestObject('Dealer Management/search cab'), varSearchcab)

WebUI.click(findTestObject('Dealer Management/pilih dealer cab'))

WebUI.click(findTestObject('Dealer Management/pilih jabatan'))

WebUI.click(findTestObject('Dealer Management/LOV jabatan', [('text') : varJabatan]))

WebUI.setText(findTestObject('Dealer Management/input kode grup'), varKodeGrup)

WebUI.setText(findTestObject('Dealer Management/input nama grup'), varNamaGrup)

WebUI.click(findTestObject('Dealer Management/add om'))

WebUI.setText(findTestObject('Dealer Management/search master om'), varSearchMasterOm)

WebUI.click(findTestObject('Dealer Management/button search exe'))

WebUI.click(findTestObject('Dealer Management/pilih om'))

WebUI.click(findTestObject('Dealer Management/save exe'))

WebUI.setText(findTestObject('Dealer Management/input email exe'), varEmail)

WebUI.setText(findTestObject('Dealer Management/input no hp exe'), varNoHP)

WebUI.scrollToElement(findTestObject('Dealer Management/executive new'), 0)

WebUI.click(findTestObject('Dealer Management/button save executive'))

WebUI.click(findTestObject('Dealer Management/konfirmasi exe'))

WebUI.click(findTestObject('Dealer Management/button ok manage exe'))

WebUI.setText(findTestObject('Dealer Management/input search exe'), varSearchExe)

WebUI.click(findTestObject('Dealer Management/button search exe'))

if (varBenar == 'Y') {
    WebUI.click(findTestObject('Dealer Management/button detail exe'))

    WebUI.setText(findTestObject('Dealer Management/input nama grup'), varNamaGrup1)

    WebUI.click(findTestObject('Dealer Management/button save detail exe'))

    WebUI.click(findTestObject('Dealer Management/button konfirmasi edit data exe'))

    WebUI.click(findTestObject('Dealer Management/button ok edit data exe'))
} else {
    WebUI.verifyElementVisible(findTestObject('Dealer Management/showing 0 to 0 of 0 entries exe'))
}

