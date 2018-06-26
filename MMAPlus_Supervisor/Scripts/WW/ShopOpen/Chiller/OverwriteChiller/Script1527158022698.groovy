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

MobileBuiltInKeywords.verifyElementText(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Chiller/Validate_ChillerScreen'), 
    'KPI: Chiller')

MobileBuiltInKeywords.tap(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Chiller/ShopKeeperDidNotAllow'), 0)

MobileBuiltInKeywords.verifyElementText(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Chiller/Validate_CategoryRemarks'), 
    'CATEGORY REMARKS')

MobileBuiltInKeywords.tap(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Chiller/CategoryRemarks_Others'), 0)

MobileBuiltInKeywords.tap(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Chiller/CategoryRemarks_BackButton'), 
    0)

MobileBuiltInKeywords.verifyElementText(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Chiller/Validate_ChillerScreen'), 
    'KPI: Chiller')

MobileBuiltInKeywords.tap(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Chiller/ChillerNotAllocated'), 0)

MobileBuiltInKeywords.verifyElementText(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Chiller/Validate_ChillerNotAllocatedScreen'), 
    'Category:Chiller')

MobileBuiltInKeywords.tap(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Chiller/Juices-200ML'), 0)

MobileBuiltInKeywords.verifyElementText(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Chiller/Validate_JuicesScreen'), 
    'Channel: Small Kiryana')

MobileBuiltInKeywords.tap(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Chiller/Facing'), 0)

MobileBuiltInKeywords.verifyElementText(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Chiller/Validate_FacingScreen'), 
    'Facing')

CustomKeywords.'customkeywords.CustomKeywordsCollection.overwriteChillerJuices'()

MobileBuiltInKeywords.tap(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Chiller/SubmitButton'), 0)

MobileBuiltInKeywords.verifyElementText(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Chiller/Validate_JuicesScreen'), 
    'Channel: Small Kiryana')

MobileBuiltInKeywords.tap(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Chiller/StockTaking'), 0)

MobileBuiltInKeywords.verifyElementText(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Chiller/Validate_StockTakingScreen'), 
    'Stock Taking')

CustomKeywords.'customkeywords.CustomKeywordsCollection.overwriteChillerJuices'()

MobileBuiltInKeywords.tap(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Chiller/SubmitButton'), 0)

MobileBuiltInKeywords.verifyElementText(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Chiller/Validate_JuicesScreen'), 
    'Channel: Small Kiryana')

MobileBuiltInKeywords.tap(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Chiller/Juices_BackButton'), 0)

MobileBuiltInKeywords.verifyElementText(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Chiller/Validate_ChillerNotAllocatedScreen'), 
    'Category:Chiller')

MobileBuiltInKeywords.tap(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Chiller/Planogram_ImageView'), 0)

CustomKeywords.'customkeywords.CustomKeywordsCollection.checkPlanogramAvailability'()

MobileBuiltInKeywords.tap(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Chiller/Planogram_CloseButton'), 0)

MobileBuiltInKeywords.verifyElementText(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Chiller/Validate_ChillerNotAllocatedScreen'), 
    'Category:Chiller')

CustomKeywords.'customkeywords.CustomKeywordsCollection.findPictureImageView'()

MobileBuiltInKeywords.verifyElementText(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Chiller/Validate_ChillerNotAllocatedScreen'), 
    'Category:Chiller')

MobileBuiltInKeywords.tap(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Chiller/Juices_BackButton'), 0)

MobileBuiltInKeywords.verifyElementText(findTestObject('ModuleSelectionScreenElements/WW/ShopOpen/Validate_ShopModulesScreen'), 
    'Channel: Small Kiryana')

