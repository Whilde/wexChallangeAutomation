package Stepdef;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Pages.HomePage;
import Pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateNewUser {

    public  WebDriver driver;
    final String cromedriver = System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
    LoginPage login;
    HomePage home;

    public void setup() throws WebDriverException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-extensions");
        options.addArguments("--test-type");
        options.addArguments("--ignore-certificate-errors");
        driver =  new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://www.executeautomation.com/demosite/Login.html");

    }

    @Given("a {string} and {string}")
    public void a_and(String string, String string2){
        setup();
        login = new LoginPage(driver);
        login.insertUsername(string);
        login.InsertPassword(string2);
    }

    @Given("click in login")
    public void click_in_login() {
        login.clickLogin();
    }

    @Then("the site will open a home page")
    public void the_site_will_open_a_home_page() {
    home = new HomePage(driver);
    assertTrue(home.homeTitle().equals("Execute Automation Selenium Test Site"));
        
    }

    @Given("choose the  Title")
    public void choose_the_Title() {
        home.setTtitle();
    }

    @Given("insert the Initial {string}")
    public void insert_the_Initial(String string) {
       home.setInicital(string);
    }

    @Given("insert the First  Name {string}")
    public void insert_the_First_Name(String string) {
      home.setFristName(string);
    }

    @Given("insert the Middle Name {string}")
    public void insert_the_Middle_Name(String string) {
       home.setMiddleName(string);
    }

    @Given("choose the Gender Female")
    public void choose_the_Gender_Female() {
        home.gender();
    }

    @Given("deselect language English")
    public void deselect_language_English() {
      home.english();
    }

    @Given("select language Hindi")
    public void select_language_Hindi() {
        home.hindi();
    }

    @When("Click in Save")
    public void click_in_Save() {
    home.save();
    }

    @When("Click in Generate")
    public void click_in_Generate() {
       home.generate();
    }

    @Then("Confirm first alert")
    public void confirm_first_alert() {
        home.acceptAlert();
    }

    @Then("Confirm second alert")
    public void confirm_second_alert() {
       home.acceptAlert();
       //driver.quit();
    }

}
