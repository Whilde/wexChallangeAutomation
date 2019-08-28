package Stepdef;

import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateNewUser {

    public  WebDriver driver;
    final String cromedriver = System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
    LoginPage login;

    public void setup() throws WebDriverException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-extensions");
        options.addArguments("--test-type");
        options.addArguments("--ignore-certificate-errors");
        driver =  new ChromeDriver(options);
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
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("choose the  Title")
    public void choose_the_Title() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("insert the Initial")
    public void insert_the_Initial() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("insert the First Name")
    public void insert_the_First_Name() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("insert the Middle Name")
    public void insert_the_Middle_Name() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("choose the Gender")
    public void choose_the_Gender() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("choose the Languages Know")
    public void choose_the_Languages_Know() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Click in Save")
    public void click_in_Save() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Click in Generate")
    public void click_in_Generate() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Confirm first alert")
    public void confirm_first_alert() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Confirm second alert")
    public void confirm_second_alert() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
