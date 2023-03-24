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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(30)

WebUI.dragAndDropToObject(findTestObject('Object Repository/DragAndDrop/Capital_Rome'), findTestObject('Object Repository/DragAndDrop/Country_Italy'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.dragAndDropToObject(findTestObject('Object Repository/DragAndDrop/Capital_Madrid'), findTestObject('Object Repository/DragAndDrop/Country_Spain'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.dragAndDropToObject(findTestObject('Object Repository/DragAndDrop/Capital_Oslo'), findTestObject('Object Repository/DragAndDrop/Country_Norway'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.dragAndDropToObject(findTestObject('Object Repository/DragAndDrop/Capital_Copenhagen'), findTestObject('Object Repository/DragAndDrop/Country_Denmark'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.dragAndDropToObject(findTestObject('Object Repository/DragAndDrop/Capital_Seoul'), findTestObject('Object Repository/DragAndDrop/Copuntry_SouthKorea'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.dragAndDropToObject(findTestObject('Object Repository/DragAndDrop/Capital_Stockholm'), findTestObject('Object Repository/DragAndDrop/Country_Sweden'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.dragAndDropToObject(findTestObject('Object Repository/DragAndDrop/Capital_Washington'), findTestObject('Object Repository/DragAndDrop/Country_United_States'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.closeBrowser()

