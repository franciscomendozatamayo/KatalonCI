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


WebUI.openBrowser("https://demoqa.com/text-box");
WebUI.maximizeWindow();

TestObject FullName = findTestObject('Object Repository/RetoScript/Page_Text Box/input_Full Name');
TestObject Email = findTestObject('Object Repository/RetoScript/Page_Text Box/input_Email');
TestObject CurrentAddress = findTestObject('Object Repository/RetoScript/Page_Text Box/textarea_Current Address');
TestObject PermanentAddress = findTestObject('Object Repository/RetoScript/Page_Text Box/textarea_Permanent Address');
TestObject Btn_Submit = findTestObject('Object Repository/RetoScript/Page_Text Box/button_Submit');

WebUI.sendKeys(FullName, "Francisco Mendoza");
WebUI.sendKeys(Email, "franciscomendoza@gmail.com");
WebUI.sendKeys(CurrentAddress, "Direccion 1");
WebUI.sendKeys(PermanentAddress, "Direccion 2");

WebUI.scrollToElement(Btn_Submit, 5)
WebUI.click(Btn_Submit);

WebUI.delay(3);
WebUI.closeBrowser();




