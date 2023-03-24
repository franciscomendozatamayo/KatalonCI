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

WebUI.navigateToUrl('testpages.herokuapp.com/styled/file-upload-test.html')

WebUI.maximizeWindow()

WebUI.uploadFile(findTestObject('UploadFile/Page_Upload a File/ChooseFile'), 'C:\\Users\\pakig\\Katalon Studio\\AutomationKatalonUdemyMasterEs\\Data Files\\Imagenes\\LogoKatalon.png')

WebUI.click(findTestObject('UploadFile/Page_Upload a File/input_What type is it_filetype'))

WebUI.click(findTestObject('UploadFile/Page_Upload a File/input_A General File_upload'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('UploadFile/Page_Upload a File/Label_Result'), 'LogoKatalon.png')

WebUI.delay(3)

WebUI.closeBrowser()

