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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://demoqa.com/automation-practice-form')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(30)

WebUI.setText(findTestObject('Form/Page_DEMOQA/input_Name_firstName'), Nombre)

WebUI.setText(findTestObject('Form/Page_DEMOQA/input_Name_lastName'), Apellido)

WebUI.setText(findTestObject('Form/Page_DEMOQA/input_Email_userEmail'), Email)

WebUI.setText(findTestObject('Form/Page_DEMOQA/input_(10 Digits)_userNumber'), '5548932154')

WebUI.delay(tiempo)

WebUI.check(findTestObject('Form/Page_DEMOQA/label_Male'))

WebUI.scrollToElement(findTestObject('Form/Page_DEMOQA/CheckBox_Sports'), 0)

WebUI.check(findTestObject('Form/Page_DEMOQA/CheckBox_Sports'))

WebUI.delay(tiempo)

WebUI.scrollToElement(findTestObject('Form/Page_DEMOQA/CheckBox_Sports'), 0)

WebUI.check(findTestObject('Form/Page_DEMOQA/CheckBox_Sports'))

WebUI.takeScreenshot()

WebUI.delay(tiempo)

WebUI.scrollToElement(findTestObject('Form/Page_DEMOQA/Link'), 0)

WebUI.click(findTestObject('Form/Page_DEMOQA/Link'))

WebUI.delay(tiempo)

WebUI.closeBrowser()

