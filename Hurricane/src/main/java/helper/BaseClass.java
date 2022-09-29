package helper;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.utils;

public class BaseClass extends utils{
	
	protected WebDriver driver;
	protected static HashMap<String, String> rStrings = new HashMap<String, String>();
	InputStream input;
	utils utility;

	@BeforeSuite
	public void setUpSuite() throws Exception {
		
		
		Properties prop = new Properties();
		FileInputStream fils = new FileInputStream(System.getProperty("user.dir")+"//src//main//resources//config.properties");
		prop.load(fils);
		String browserName = prop.getProperty("browser");
		
			if(browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver();
			}else if (browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}else if(browserName.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				 driver = new EdgeDriver();
			}
		
		driver.get("https://sure-qa-challenge.vercel.app/");
		
		utility = new utils();
		String xmlFileName = "strings/strings.xml";
		input = getClass().getClassLoader().getResourceAsStream(xmlFileName);
		rStrings = utility.parseStringXML(input);
		
	}
	
	@AfterSuite
	public void quitSuite() {
		driver.quit();
	}
	
	public void waitForVisibility(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20); 
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void clear(WebElement element) {
		waitForVisibility(element);
		(element).clear();
	}
	public void click(WebElement element, String msg) {
		waitForVisibility(element);
		(element).click();
	}
	public void sendKeys(WebElement element, String txt) {
		waitForVisibility(element);
		(element).sendKeys("text");
	}
	public String getText(WebElement element, String text) {
		waitForVisibility(element);
		return (element).getText();
	}
	
	public void goback() {
		driver.navigate().back();
	}
	public void refreshBrowser() {
		driver.navigate().refresh();
	}
	public void closeBrowser() {
		driver.quit();
	}

}