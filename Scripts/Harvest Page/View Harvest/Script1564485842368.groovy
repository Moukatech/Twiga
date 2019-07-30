import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Common/Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

WebUI.click(findTestObject('Harvest Page/Link Harvest'))

Mobile.delay(2)

WebUI.click(findTestObject('Booking Page/Select Farmer'))

Mobile.delay(3)

WebUI.click(findTestObject('Harvest Page/Select Farmer Info'))

Mobile.delay(2)

not_run: WebUI.click(findTestObject('Booking Page/Link- Edit Farmer'))

not_run: Mobile.delay(4)

not_run: WebUI.click(findTestObject('Booking Page/Btn_ Close farmer Edit Page'))

Mobile.delay(2)

WebUI.click(findTestObject('Harvest Page/Farm Number'))

Mobile.delay(4)

WebUI.click(findTestObject('Booking Page/Btn- Close tabs'))

