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

CustomKeywords.'com.openBrowser.openBrowser.openNav'('https://demoqa.com/automation-practice-form')

WebUI.scrollToElement(findTestObject('QADemo/Modulo Practice Form/button_Submit'), 3)

WebUI.sendKeys(findTestObject('QADemo/Modulo Practice Form/button_Submit'), Keys.chord(Keys.ENTER))

FirstName = WebUI.waitForElementAttributeValue(findTestObject('QADemo/Modulo Practice Form/input_FirstNameElement'), '0', 
    '0', 3)

print(FirstName)

if (FirstName == false) {
    WebUI.setText(findTestObject('QADemo/Modulo Practice Form/input_FirstNameElement'), 'Francisco')

    WebUI.delay(3)
}

LastName = WebUI.waitForElementAttributeValue(findTestObject('QADemo/Modulo Practice Form/input_LastNameElement'), '0', 
    '0', 3)

print(LastName)

if (LastName == false) {
    WebUI.setText(findTestObject('QADemo/Modulo Practice Form/input_LastNameElement'), 'Mendoza')

    WebUI.delay(3)
}

WebUI.closeBrowser()

