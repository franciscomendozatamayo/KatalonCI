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

WebUI.openBrowser('https://testingqarvn.com.es/combobox/')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('TestingQARvn/Modulo ComboBox/Label_TitlePage'), 10)

WebUI.waitForElementClickable(findTestObject('TestingQARvn/Modulo ComboBox/Select_SistemaOperativo'), 10)

WebUI.scrollToElement(findTestObject('TestingQARvn/Modulo ComboBox/Select_SistemaOperativo'), 0)

WebUI.selectOptionByLabel(findTestObject('TestingQARvn/Modulo ComboBox/Select_SistemaOperativo'), 'Mac', true)

WebUI.takeScreenshot('C:\\Users\\pakig\\Katalon Studio\\AutomationKatalonUdemyMasterEs\\Data Files\\Screenshots\\imageSelectOption.png')

WebUI.delay(Tiempo)

WebUI.selectOptionByIndex(findTestObject('TestingQARvn/Modulo ComboBox/Select_SistemaOperativo'), 1)

WebUI.delay(Tiempo)

WebUI.selectOptionByValue(findTestObject('TestingQARvn/Modulo ComboBox/Select_SistemaOperativo'), 'Windows', true)

WebUI.delay(Tiempo)

WebUI.closeBrowser()

