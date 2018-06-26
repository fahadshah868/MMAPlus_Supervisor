import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

MobileBuiltInKeywords.verifyElementText(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/ChillerUtilization/ChillerNotAvailable/Validate_ChillerNotAvailableScreen'), 
    'Category:Chiller Utilization')

CustomKeywords.'customkeywords.CustomKeywordsCollection.visitChillerNotAvailableProductsCategories'()

MobileBuiltInKeywords.tap(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/ChillerUtilization/ChillerNotAvailable/Planogram_ImageView'), 
    0)

CustomKeywords.'customkeywords.CustomKeywordsCollection.checkPlanogramAvailability'()

MobileBuiltInKeywords.tap(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/ChillerUtilization/ChillerNotAvailable/Planogram_CloseButton'), 
    0)

MobileBuiltInKeywords.verifyElementText(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/ChillerUtilization/ChillerNotAvailable/Validate_ChillerNotAvailableScreen'), 
    'Category:Chiller Utilization')

CustomKeywords.'customkeywords.CustomKeywordsCollection.findPictureImageView'()

MobileBuiltInKeywords.tap(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/ChillerUtilization/ChillerNotAvailable/ChillerNotAvailable_BackButton'), 
    0)

MobileBuiltInKeywords.verifyElementText(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/ChillerUtilization/Validate_ChillerUtilizationScreen'), 
    'Shops on Route')

MobileBuiltInKeywords.tap(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/ChillerUtilization/ChillerUtilization_backButton'), 
    0)

MobileBuiltInKeywords.verifyElementText(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Validate_ShopModulesScreen'), 
    'Channel: Small Kiryana')

CustomKeywords.'customkeywords.CustomKeywordsCollection.findShopProduct'('Chiller Utilization')

MobileBuiltInKeywords.verifyElementText(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/ChillerUtilization/Validate_ChillerUtilizationScreen'), 
    'Shops on Route')

MobileBuiltInKeywords.tap(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/ChillerUtilization/Chiller'), 0)

Mobile.verifyElementExist(findTestObject('CommonScreenElements/Validate_CameraScreen'), 0)

MobileBuiltInKeywords.tap(findTestObject('CommonScreenElements/TakePictureButton'), 0)

MobileBuiltInKeywords.tap(findTestObject('CommonScreenElements/DoneButton'), 0)

MobileBuiltInKeywords.verifyElementText(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/ChillerUtilization/Validate_ChillerActionsScreen'), 
    'KPI: Chiller Utilization')

