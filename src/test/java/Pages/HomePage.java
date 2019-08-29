package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.sun.org.apache.bcel.internal.generic.Select;

public class HomePage {

	@FindBy(how = How.XPATH, using = "//h1[text() = 'Execute Automation Selenium Test Site']") 
	private WebElement homePageTitle;
	@FindBy(how = How.XPATH, using = "//form[@id = 'details']//select[@id = 'TitleId']")
	private WebElement title;
	@FindBy(how = How.XPATH, using = "//form[@id = 'details']//input[@id = 'Initial']") 
	private WebElement initial;
	@FindBy(how = How.XPATH, using = "//form[@id = 'details']//input[@id = 'FirstName']")
	private WebElement fristName;
	@FindBy(how = How.XPATH, using = "//form[@id = 'details']//input[@id = 'MiddleName']")
	private WebElement middleName;
	@FindBy(how = How.XPATH, using = "//form[@id = 'details']//input[@name = 'Female']")
	private WebElement femaleRadio;
	@FindBy(how = How.XPATH, using = "//form[@id = 'details']//input[@name = 'english']")
	private WebElement englishCheck;
	@FindBy(how = How.XPATH, using = "//form[@id = 'details']//input[@name = 'Hindi']")
	private WebElement hindiCheck;
	@FindBy(how = How.XPATH, using = "//form[@id = 'details']//input[@name = 'Save']")
	private WebElement save;
	@FindBy(how = How.XPATH, using = "//form[@id = 'details']//input[@name = 'generate']")
	private WebElement generate;
	WebDriver driverPage;
	
	public HomePage(WebDriver driver) {
		  this.driverPage = driver;
	       PageFactory.initElements(driverPage,this);
	}
	public void setTtitle() {
		org.openqa.selenium.support.ui.Select selectTitle = new org.openqa.selenium.support.ui.Select(title);
		selectTitle.selectByValue("1");
	}
	public void setInicital(String initialName) {
		initial.sendKeys(initialName);
	}
	public void setFristName(String name) {
		fristName.sendKeys(name);
	}
	
	public void setMiddleName(String middle) {
		middleName.sendKeys(middle);
	}
	public void gender() {
		femaleRadio.click();
	}
	public void english() {
		englishCheck.click();
	}
	public void hindi() {
		hindiCheck.click();
	}
	public void save () {
		save.click();
	}
	public void generate() {
		generate.click();
	}
	public void acceptAlert() {
		driverPage.switchTo().alert().accept();
	}
	public String homeTitle() {
		return homePageTitle.getText();
	}
	
	
		
		
		
		
		
		
		
}
