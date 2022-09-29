package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.utils;

public class GetQuote extends utils {

	WebDriver driver;

	public GetQuote(WebDriver d) {
		this.driver = d;
	}

	@FindBy(css = "#__next > div > div.MuiBox-root.jss5.jss2 > div > div > div > div > div > div.MuiBox-root.jss7 > h1")
	WebElement hurricaneTitle;

	@FindBy(css = "#__next > div > div.MuiBox-root.jss5.jss2 > div > div > div > div > div > div.MuiBox-root.jss8 > p")
	WebElement hurricaneDescription;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/div/div/div/div/div[3]/form/div[1]/div")
	WebElement zipCode;

	@FindBy(css = "#__next > div > div.MuiBox-root.jss5.jss2 > div > div > div > div > div > div.MuiBox-root.jss9 > form > div.MuiBox-root.jss11 > button > span.MuiButton-label")
	WebElement getQuote;

	@FindBy(css = "#__next > div > div.MuiBox-root.jss5.jss2 > div > div > div > div > div > div.MuiBox-root.jss9 > form > div.MuiBox-root.jss10 > div > p")
	WebElement invalidZip;

	@FindBy(css = "#__next > div > div.MuiBox-root.jss5.jss2 > div > div > div > div > div > div.MuiBox-root.jss9 > form > div.MuiBox-root.jss10 > div > p")
	WebElement requiredZip;

	@FindBy(css = "#__next > div > div > div > div > div > div > h1")
	WebElement materialQuestion;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div/div/form/div[2]/button") 
	WebElement nextMaterialButton;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div/div/form/div[1]/fieldset/div/label[1]") 
	WebElement strawButton;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div/div/form/div[1]/fieldset/div/label[2]/span[2]") 
	WebElement sticksButton;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div/div/form/div[1]/fieldset/div/label[3]/span[2]") 
	WebElement bricksButton;

	@FindBy(xpath = "#__next > div > div > div > div > div > div > h1") 
	WebElement proximityQuestion;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div/div/form/div[1]/fieldset/div/label[1]/span[2]") 
	WebElement yesButton;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div/div/form/div[1]/fieldset/div/label[2]/span[2]")
	WebElement noButton;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div/div/form/div[2]/button/span[1]") 
	WebElement nextProximityButton;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div/div/div/h1") 
	WebElement availablePlansTitle;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div/div/form/div/div/div[1]/div/div/div[1]/h3") 
	WebElement standardPackageTitle;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div/div/form/div/div/div[2]/div/div/div[1]/h3") 
	WebElement completePackageTitle;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div/div/form/div/div/div[1]/div/div/div[3]/p") 
	WebElement standardPackageText;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div/div/form/div/div/div[2]/div/div/div[3]/p") 
	WebElement completePackageText;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div/div/form/div/div/div[1]/div/div/div[2]/h3") 
	WebElement priceStandard;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div/div/form/div/div/div[2]/div/div/div[2]/h3") 
	WebElement priceComplete;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div/div/form/div/div/div[2]/div/div/div[5]/label/span[2]") 
	WebElement includeProtectionButton;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div/div/form/div/div/div[1]/div/div/div[4]/button") 
	WebElement chooseStandardButton;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div/div/form/div/div/div[2]/div/div/div[6]/button/span[1]") 
	WebElement chooseCompleteButton;

	public String hurricaneTitle() {
			return hurricaneTitle.getText();
	}

	public String hurricaneDescription() {
		return hurricaneDescription.getText();
	}

	public String getZipcode()  {
		return zipCode.getText();
	}
	
	public String getQuoteText()  {
		return getQuote.getText();
	}

	public void enterValidZipcode()  {//???????
		 waitForWebElement(driver, zipCode).sendKeys("11223");
	}
	
	public void enterInvalidZipcodeAlpha()  {//???????
		 waitForWebElement(driver, zipCode).sendKeys("abcde");
	}
	
	public void enterInvalidZipcodeSpeChar()  {//???????
		 waitForWebElement(driver, zipCode).sendKeys("!@#$%");	}
	
	public void enterInvalidZipcodeMix()  {//???????
		 waitForWebElement(driver, zipCode).sendKeys("12as!");	}
	
	public void clickGetQuote()  {
		 getQuote.click();
	}
	
	public String invalidZip()  {
		return invalidZip.getText();
		
	}
	
	public String requiredZip()  {
		return requiredZip.getText();
	}
	
	public String materialQuestion()  {
		return materialQuestion.getText();
	}
	
	public String nextMaterialButtonText()  {
		return nextMaterialButton.getText();
	}
	
	public void clickMaterialNext()  {
		 nextMaterialButton.click();
	}
	
	public String strawText()  {
		return strawButton.getText();
	} 
	
	public String sticksText()  {
		return sticksButton.getText();
	} 
	
	public String bricksText()  {
		return bricksButton.getText();
	} 
	
	public void clickStraw()  {
		 strawButton.click();
	}
	
	public void clickSticks()  {
		 sticksButton.click();
	}
	
	public void clickBricks()  {
		 bricksButton.click();	
	}
	
	public void strawButtonSelected()  {
		waitForWebElement(driver, strawButton).isSelected();
	}
	
	public void sticksButtonSelected()  {
		waitForWebElement(driver, sticksButton).isSelected();
	}
	
	public void bricksButtonSelected()  {
		waitForWebElement(driver, bricksButton).isSelected();
	}
	
	public String proximityQuestion()  {
		return proximityQuestion.getText();
	} 
	
	public String yesText()  {
		return yesButton.getText();
	} 
	
	public String noText()  {
		return noButton.getText();
	} 
	
	public void yesButtonSelected()  {
		waitForWebElement(driver, yesButton).isSelected();
	}
	
	public void noButtonSelected()  {
		waitForWebElement(driver, noButton).isSelected();
	}
	
	public void clickYes()  {
		 yesButton.click();
	}
	
	public void clickNo()  {
		noButton.click();
	}	
	public void clickProximityNext()  {
		nextProximityButton.click();
	}
	
	public String availablePlansTitle()  {
		return availablePlansTitle.getText();
	} 
	
	public String standardPackageTitle()  {
		return standardPackageTitle.getText();
	}

	public String completePackageTitle()  {
		return completePackageTitle.getText();
	}
	
	public String standardPackageText()  {
		return standardPackageText.getText();
	}

	public String completePackageText()  {
		return completePackageText.getText();
	}
	
	public String chooseStandardButton()  {
		return chooseStandardButton.getText();
	}
	
	public String chooseCompleteButton()  {
		return chooseCompleteButton.getText();
	}
	
	public String includeProtectionButton()  {
		return includeProtectionButton.getText();
	}
	
	public void clickIncludeProtection()  {
		 includeProtectionButton.click();
	}
	
}

