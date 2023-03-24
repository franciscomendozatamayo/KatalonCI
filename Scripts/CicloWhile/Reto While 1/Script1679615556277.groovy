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

CustomKeywords.'com.openBrowser.openBrowser.openNav'('https://www.google.com/')

WebUI.setText(findTestObject('Google/BuscarPage/input_Buscar'), 'Calculadora')
WebUI.sendKeys(findTestObject('Google/BuscarPage/input_Buscar'), Keys.chord(Keys.ENTER))

txt_Resultado1 = WebUI.getText(findTestObject('Google/ResultadoCalculadoraPage/span_Resultado'))
Resultado1 =  txt_Resultado.toInteger()

while (Resultado == 8) {
	
    int num1 = 5

    int num2 = (((Math.random() * (5 - 1)) + 1) as int)

    WebUI.setText(findTestObject('Object Repository/Google/ResultadoCalculadoraPage/inputBuscar2'), (num1 + '+') + num2)

    WebUI.sendKeys(findTestObject('Object Repository/Google/ResultadoCalculadoraPage/inputBuscar2'), Keys.chord(Keys.ENTER))

    txt_Resultado2 = WebUI.getText(findTestObject('Google/ResultadoCalculadoraPage/span_Resultado'))
	
	Resultado2 =  txt_Resultado.toInteger()
}

