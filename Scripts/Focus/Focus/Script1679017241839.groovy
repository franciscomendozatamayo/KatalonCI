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

WebUI.navigateToUrl('https://testingqarvn.com.es/datos-personales/')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(30)

WebUI.focus(findTestObject('Focus/Page_Datos Personales  TestingQaRvn/input_Nombre_field_21'))

WebUI.setText(findTestObject('Object Repository/Focus/Page_Datos Personales  TestingQaRvn/input_Nombre_field_21'), 'Francisco')

WebUI.focus(findTestObject('Focus/Page_Datos Personales  TestingQaRvn/input_Apellidos_field_22'))

WebUI.setText(findTestObject('Object Repository/Focus/Page_Datos Personales  TestingQaRvn/input_Apellidos_field_22'), 'Mendoza')

WebUI.focus(findTestObject('Focus/Page_Datos Personales  TestingQaRvn/input_Email_field_23'))

WebUI.setText(findTestObject('Object Repository/Focus/Page_Datos Personales  TestingQaRvn/input_Email_field_23'), 'franciscomendoza@gmail.com')

WebUI.focus(findTestObject('Focus/Page_Datos Personales  TestingQaRvn/input_Phone_field_24'))

WebUI.setText(findTestObject('Object Repository/Focus/Page_Datos Personales  TestingQaRvn/input_Phone_field_24'), '5548789654')

WebUI.focus(findTestObject('Focus/Page_Datos Personales  TestingQaRvn/textarea_Direccin_field_28'))

WebUI.setText(findTestObject('Object Repository/Focus/Page_Datos Personales  TestingQaRvn/textarea_Direccin_field_28'), 
    'Direccion Email')

WebUI.click(findTestObject('Object Repository/Focus/Page_Datos Personales  TestingQaRvn/button_Submit'))

WebUI.click(findTestObject('Object Repository/Focus/Page_Datos Personales  TestingQaRvn/p_Gracias por tu encuesta'))

WebUI.closeBrowser()

