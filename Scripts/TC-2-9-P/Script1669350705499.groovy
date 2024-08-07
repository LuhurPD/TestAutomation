import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.util.concurrent.locks.Condition

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


String path = RunConfiguration.getProjectDir() + "/Data Files/"
path = path.replace("/", "\\")


WebUI.openBrowser('')

//WebUI.click(new TestObject(new addProperty('id',ConditionType.EQUALS,'uploader_browse')))
WebUI.navigateToUrl('https://www.plupload.com/examples')
CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile'(new TestObject().addProperty('xpath',ConditionType.EQUALS,'//input[@type="file"]'), path + "image1.jpg")
//using uploadFileUsingRobot function, works on firefox only
CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFileUsingRobot'(new TestObject().addProperty('id',ConditionType.EQUALS,'//input[@type="file"]'),
	path + "image1.jpg")

WebUI.takeScreenshotAsCheckpoint('Gambar 1')

CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile'(new TestObject('File Upload').addProperty('xpath',ConditionType.EQUALS,'//input[@type="file"]'), path + "image2.jpg")
//using uploadFileUsingRobot function, works on firefox only
CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFileUsingRobot'(new TestObject('File Upload').addProperty('id',ConditionType.EQUALS,'//input[@type="file"]'),
	path + "image2.jpg")