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

CustomKeywords.'com.openBrowser.openBrowser.openNav'('https://testautomationpractice.blogspot.com/')

WebUI.switchToFrame(findTestObject('Automation Testing Practice/Volunteer Sign Up/iframe_Volunteer Sign Up'), 3)

WebUI.setText(findTestObject('Automation Testing Practice/Volunteer Sign Up/input_First Name'), 'Francisco')

WebUI.setText(findTestObject('Automation Testing Practice/Volunteer Sign Up/input_Last Name'), 'Mendoza')

WebUI.setText(findTestObject('Automation Testing Practice/Volunteer Sign Up/input_Phone'), '5568748521')

WebUI.setText(findTestObject('Automation Testing Practice/Volunteer Sign Up/input_Country'), 'Mexico')

WebUI.setText(findTestObject('Automation Testing Practice/Volunteer Sign Up/input_City'), 'Ciudad de Mexico')

WebUI.setText(findTestObject('Automation Testing Practice/Volunteer Sign Up/input_Email Address'), 'franciscomt@gmail.com')

WebUI.switchToDefaultContent()

