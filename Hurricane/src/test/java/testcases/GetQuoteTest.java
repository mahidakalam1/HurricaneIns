package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import helper.BaseClass;
import pages.GetQuote;
import utilities.utils;

public class GetQuoteTest extends BaseClass {

	GetQuote quote;

	@BeforeTest
	public void beforeTest() {
		quote = PageFactory.initElements(driver, GetQuote.class); 
	}

	@Test
	public void verifyLandingPage() throws IOException, InterruptedException {//verifying all text on main landing page

		String actualHurricaneTitle = quote.hurricaneTitle();
		String expectedHurricaneTitle = rStrings.get("title_hurricane");
		AssertJUnit.assertEquals(actualHurricaneTitle, expectedHurricaneTitle);

		String actualHurricaneDescription = quote.hurricaneDescription();
		String expectedHurricaneDescription = rStrings.get("description_hurricane");
		AssertJUnit.assertEquals(actualHurricaneDescription, expectedHurricaneDescription);

		String actualZipcode = quote.getZipcode();
		String expectedZipcode = rStrings.get("zipcode_field");
		AssertJUnit.assertEquals(actualZipcode, expectedZipcode);

		String actualQuoteText = quote.getQuoteText();
		String expectedQuoteText = rStrings.get("quote_button");
		AssertJUnit.assertEquals(actualQuoteText, expectedQuoteText);

	}

	@Test(priority=2)
	public void verifyGettingQuote() throws InterruptedException {//postive scenario of entering zipcode

		quote.enterValidZipcode();
		quote.clickGetQuote();

		String actualMaterialLandingPage = quote.materialQuestion();
		String expectedMaterialLandingPage = rStrings.get("home_material_question");
		AssertJUnit.assertEquals(actualMaterialLandingPage, expectedMaterialLandingPage);

	}

	@Test(priority=3)
	public void verifyZipcodeRequired() throws InterruptedException {//negative scenario of entering zipcode

		quote.clickGetQuote();

		String actualRequiredZipcode = quote.requiredZip();
		String expectedRequiredZipcode = rStrings.get("required_zipcode");
		AssertJUnit.assertEquals(actualRequiredZipcode, expectedRequiredZipcode);

	}

	@Test(priority=4)
	public void verifyInvalidZipcode() throws InterruptedException{//negative scenario of entering zipcode

		quote.enterInvalidZipcodeAlpha();
		quote.clickGetQuote();

		String actualInvalidZip = quote.invalidZip();
		String expectedInvalidZip = rStrings.get("invalid_zip_code");
		AssertJUnit.assertEquals(actualInvalidZip, expectedInvalidZip);

	}

	@Test(priority=5)
	public void verifyInvalidZipcode2() throws InterruptedException {//negative scenario of entering zipcode

		quote.enterInvalidZipcodeSpeChar();
		quote.clickGetQuote();

		String actualInvalidZip = quote.invalidZip();
		String expectedInvalidZip = rStrings.get("invalid_zip_code");
		AssertJUnit.assertEquals(actualInvalidZip, expectedInvalidZip);

	}

	@Test(priority=6)
	public void verifyInvalidZipcode3() throws InterruptedException {//negative scenario of entering zipcode

		quote.enterInvalidZipcodeMix();
		quote.clickGetQuote();

		String actualInvalidZip = quote.invalidZip();
		String expectedInvalidZip = rStrings.get("invalid_zip_code");
		AssertJUnit.assertEquals(actualInvalidZip, expectedInvalidZip);

	}

	@Test(priority=7)
	public void verifyBuildingMaterialLanding() throws InterruptedException {//verifying all text on home material landing page

		quote.enterValidZipcode();
		quote.clickGetQuote();

		String actualMaterialQuestion = quote.materialQuestion();
		String expectedMaterialQuestion = rStrings.get("home_material_question");
		AssertJUnit.assertEquals(actualMaterialQuestion, expectedMaterialQuestion);


		String actualStrawsText = quote.strawText();
		String expectedStrawsText = rStrings.get("button_straw");
		AssertJUnit.assertEquals(actualStrawsText, expectedStrawsText);
	
	
		String actualSticksText = quote.sticksText();
		String expectedSticksText= rStrings.get("button_sticks");
		AssertJUnit.assertEquals(actualSticksText, expectedSticksText);
	
	
		String actualBricksText = quote.bricksText();
		String expectedBricksText = rStrings.get("button_bricks");
		AssertJUnit.assertEquals(actualBricksText, expectedBricksText);


}

	@Test(priority=8)
	public void verifyAnsweringMaterialQues() throws InterruptedException {//verifying anwering the home materials question
	
		quote.enterValidZipcode();
		quote.clickGetQuote();
	
		String actualNextButton = quote.nextMaterialButtonText();
		String expectedNextButton = rStrings.get("button_next");
		AssertJUnit.assertEquals(actualNextButton, expectedNextButton);
	
	
	}
	
	@Test(priority=9)
	public void verifyStrawButton() throws InterruptedException {//verifying answering with straws
	
		quote.enterValidZipcode();
		quote.clickGetQuote();
		quote.clickStraw();
		quote.clickMaterialNext();
	
		String actualProximityLanding = quote.proximityQuestion();
		String expectedProximityLanding = rStrings.get("proximity_question");
		AssertJUnit.assertEquals(actualProximityLanding, expectedProximityLanding);
	
	
	}
	
	@Test(priority=10)
	public void verifySticksButton() throws InterruptedException {//verifying answering with sticks
	
		quote.enterValidZipcode();
		quote.clickGetQuote();
		quote.clickSticks();
		quote.clickMaterialNext();
	
		String actualProximityLanding = quote.proximityQuestion();
		String expectedProximityLanding = rStrings.get("proximity_question");
		AssertJUnit.assertEquals(actualProximityLanding, expectedProximityLanding);
	
	}
	
	@Test(priority=11)
	public void verifyBricksButton() throws InterruptedException {//verifying answering with bricks
	
		quote.enterValidZipcode();
		quote.clickGetQuote();
		quote.clickBricks();
		quote.clickMaterialNext();
	
		String actualProximityLanding = quote.proximityQuestion();
		String expectedProximityLanding = rStrings.get("proximity_question");
		AssertJUnit.assertEquals(actualProximityLanding, expectedProximityLanding);
	
	
	}
	
	@Test(priority=12)
	public void verifyProximityLanding() throws InterruptedException {//verifying all text in proximity landing page
	
		quote.enterValidZipcode();
		quote.clickGetQuote();
		quote.clickBricks();
		quote.clickMaterialNext();
	
		String actualProximityLanding = quote.proximityQuestion();
		String expectedProximityLanding = rStrings.get("proximity_question");
		AssertJUnit.assertEquals(actualProximityLanding, expectedProximityLanding);
	
	
		String actualYesButton = quote.yesText();
		String expectedYesButton = rStrings.get("button_yes");
		AssertJUnit.assertEquals(actualYesButton, expectedYesButton);
	
	
		String actualNoButton = quote.noText();
		String expectedNoButton = rStrings.get("button_no");
		AssertJUnit.assertEquals(actualNoButton, expectedNoButton);
	
	}
	
	@Test(priority=13)
	public void verifyAnsweringYes() throws InterruptedException { //verifying answering with yes
	
		quote.enterValidZipcode();
		quote.clickGetQuote();
		quote.clickBricks();
		quote.clickMaterialNext();
		quote.clickYes();
		quote.clickProximityNext();
	
		String actualAvailablePlans = quote.availablePlansTitle();
		String expectedAvailablePlans = rStrings.get("available_plans_title");
		AssertJUnit.assertEquals(actualAvailablePlans, expectedAvailablePlans);
	
	
	}
	
	@Test(priority=14)
	public void verifyAnsweringNo() throws InterruptedException { //verifying answering with no
	
		quote.enterValidZipcode();
		quote.clickGetQuote();
		quote.clickBricks();
		quote.clickMaterialNext();
		quote.clickNo();
		quote.clickProximityNext();
	
		String actualAvailablePlans = quote.availablePlansTitle();
		String expectedAvailablePlans = rStrings.get("available_plans_title");
		AssertJUnit.assertEquals(actualAvailablePlans, expectedAvailablePlans);
	
	}
	
	@Test(priority=15)
	public void verifyAvailablePlansLanding() throws InterruptedException { //verifying all text in available plans landing
	
		quote.enterValidZipcode();
		quote.clickGetQuote();
		quote.clickBricks();
		quote.clickMaterialNext();
		quote.clickNo();
		quote.clickProximityNext();
	
		String actualAvailablePlans = quote.availablePlansTitle();
		String expectedAvailablePlans = rStrings.get("available_plans_title");
		AssertJUnit.assertEquals(actualAvailablePlans, expectedAvailablePlans);
	
	
		String actualStandardTitle= quote.standardPackageTitle();
		String expectedStandardTitle = rStrings.get("standard_title");
		AssertJUnit.assertEquals(actualStandardTitle, expectedStandardTitle);
	
	
		String actualCompleteTitle= quote.completePackageTitle();
		String expectedCompleteTitle = rStrings.get("complete_title");
		AssertJUnit.assertEquals(actualCompleteTitle, expectedCompleteTitle);
	
	
		String actualStandardText= quote.standardPackageText();
		String expectedStandardText = rStrings.get("description_standard");
		AssertJUnit.assertEquals(actualStandardText, expectedStandardText);
	
	
		String actualCompleteText= quote.completePackageText();
		String expectedCompleteText = rStrings.get("description_complete_one");
		AssertJUnit.assertEquals(actualCompleteText, expectedCompleteText);
	
	
		String actualStandardButton = quote.chooseStandardButton();
		String expectedStandardButton = rStrings.get("button_standard");
		AssertJUnit.assertEquals(actualStandardButton, expectedStandardButton);
	
	
		String actualCompleteButton = quote.chooseCompleteButton();
		String expectedCompleteButton = rStrings.get("button_complete");
		AssertJUnit.assertEquals(actualCompleteButton, expectedCompleteButton);
	
	
	}
	
	@Test(priority=16)
	public void verifyIncludeProtButton() throws InterruptedException  {//verifying include flood protection button
	
		quote.enterValidZipcode();
		quote.clickGetQuote();
		quote.clickBricks();
		quote.clickMaterialNext();
		quote.clickNo();
		quote.clickProximityNext();
	
	
		String actualIncludeProtection = quote.includeProtectionButton();
		String expectedIncludeProtection = rStrings.get("button_include_protection");
		AssertJUnit.assertEquals(actualIncludeProtection, expectedIncludeProtection);
	
	
	}
	
	@Test(priority=17)
	public void verifyStrawPersists() throws InterruptedException {//verifying refreshing for straw
	
		quote.enterValidZipcode();
		quote.clickGetQuote();
		quote.clickStraw();
		//quote.refreshBrowser();
		quote.strawButtonSelected();
	
	}
	
	@Test(priority=18)
	public void verifySticksPersists() throws InterruptedException {//verifying refreshing for sticks
	
		quote.enterValidZipcode();
		quote.clickGetQuote();
		quote.clickSticks();
		//quote.refreshBrowser();
		quote.sticksButtonSelected();
	
	
	}
	
	@Test(priority=19)
	public void verifyBricksPersists() throws InterruptedException {//verifying refreshing for bricks
	
		quote.enterValidZipcode();
		quote.clickGetQuote();
		quote.clickBricks();
		//quote.refreshBrowser();
		quote.bricksButtonSelected();
	
	
	}
	
	@Test(priority=20)
	public void verifyYesPersists() throws InterruptedException {//verifying refreshing for yes
	
		quote.enterValidZipcode();
		quote.clickGetQuote();
		quote.clickBricks();
		quote.clickMaterialNext();
		quote.clickYes();
		//quote.refreshBrowser();
		quote.yesButtonSelected();
	
	}
	
	@Test(priority=21)
	public void verifyNoPersists() throws InterruptedException {//verifying refreshing for no
	
		quote.enterValidZipcode();
		quote.clickGetQuote();
		quote.clickBricks();
		quote.clickMaterialNext();
		quote.clickNo();
		//quote.refreshBrowser();
		quote.noButtonSelected();
	
	} 

	
	@AfterTest
	public void afterTest() {
		driver.close();
	} 
	
	}