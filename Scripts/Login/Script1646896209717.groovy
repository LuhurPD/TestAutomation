import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.chrome.ChromeOptions
import com.kms.katalon.core.webui.driver.DriverFactory

// Buka browser dulu via Katalon
WebUI.openBrowser('')

// Ambil driver yang sudah berjalan, lalu tidak perlu set prefs via script
// Langsung navigasi ke URL
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com')
WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))
WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/h2_Login'), 0)
WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/label_Demo account'), 0)
WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/p_Please login to make appointment'), 0)
WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/label_Username'), 0)
WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/label_Password'), 0)
WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Username_username'), 'John Doe')
WebUI.setEncryptedText(findTestObject('Page_CURA Healthcare Service/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')
WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))