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

WebUI.scrollToElement(findTestObject('Automation Testing Practice/New Windows/button_Alert'), 0)

WebUI.click(findTestObject('Automation Testing Practice/New Windows/button_Alert'))

WebUI.acceptAlert()

WebUI.scrollToElement(findTestObject('Automation Testing Practice/New Windows/input_Date Picker'), 0)

WebUI.setText(findTestObject('Automation Testing Practice/New Windows/input_Date Picker'), '03/24/2023')

WebUI.sendKeys(findTestObject('Automation Testing Practice/New Windows/input_Date Picker'), Keys.chord(Keys.ENTER))

WebUI.scrollToElement(findTestObject('Automation Testing Practice/New Windows/select_Select a speed'), 0)

WebUI.selectOptionByLabel(findTestObject('Automation Testing Practice/New Windows/select_Select a speed'), 'Fast', true)

WebUI.closeBrowser()

