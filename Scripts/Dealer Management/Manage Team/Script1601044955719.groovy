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

WebUI.click(findTestObject('Dealer Management/a_Manage Team'))

WebUI.click(findTestObject('Dealer Management/klik dealer manage team'))

WebUI.click(findTestObject('Dealer Management/LOV dealer manage team AI TSO-JKT CILEDUG', [('text') : varLOV]))

WebUI.click(findTestObject('Dealer Management/detail team management'))

WebUI.setText(findTestObject('Dealer Management/input team name'), varTeamName)

WebUI.click(findTestObject('Dealer Management/button save tim'))

WebUI.click(findTestObject('Dealer Management/button ok team'))

WebUI.click(findTestObject('Dealer Management/klik dealer manage team'))

WebUI.click(findTestObject('Dealer Management/LOV dealer manage team AI TSO-JKT CILEDUG'))

WebUI.setText(findTestObject('Dealer Management/input search data team'), varSearchTeamName)

WebUI.click(findTestObject('Dealer Management/button search data team'))

if (varBenar == 'Y') {
    WebUI.verifyElementVisible(findTestObject('Dealer Management/detail team management'))
} else {
    WebUI.verifyElementVisible(findTestObject('Dealer Management/showing 0 to 0 of 0 entries manage team'))
}

