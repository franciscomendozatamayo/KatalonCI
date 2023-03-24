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

CustomKeywords.'com.openBrowser.openBrowser.openNav'('https://demoqa.com/text-box')


for(int i=1; i<=10;i++) {
	
	
	def z=["Carlos","Rodrigo","Paco","Adrian","Sebastian"]
	
	Random rn = new Random()
	
	tx_nombre = z[rn.nextInt(z.size())]
	
	WebUI.setText(findTestObject('QADemo/Modulo Text Box/input_FullName'), tx_nombre)
	
	WebUI.setText(findTestObject('QADemo/Modulo Text Box/input_Email'), tx_nombre + '@gmail.com')
	
	WebUI.setText(findTestObject('QADemo/Modulo Text Box/textarea_CurrentAddress'), 'Current Address #'+ i)
	
	WebUI.setText(findTestObject('QADemo/Modulo Text Box/textarea_PermanentAddress'), 'Permanent Address #'+ i)
	
	WebUI.scrollToElement(findTestObject('QADemo/Modulo Text Box/button_Submit'), 3)
	
	WebUI.click(findTestObject('QADemo/Modulo Text Box/button_Submit'))
}



WebUI.closeBrowser()
