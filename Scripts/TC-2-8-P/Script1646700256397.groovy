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

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com')

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/h2_Login'), 0)

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/label_Demo account'), 0)

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/p_Please login to make appointment'), 0)

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/label_Demo account'), 0)

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/label_Username'), 0)

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/label_Password'), 0)

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Password_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center                            Hongkong CURA Healthcare Center                            Seoul CURA Healthcare Center'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/input_Apply for hospital readmission_hospital_readmission'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/input_Medicare_programs'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/input_Apply for hospital readmission_hospital_readmission'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/td_30'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/textarea_Comment_comment'), 'test')

WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Logout'))

