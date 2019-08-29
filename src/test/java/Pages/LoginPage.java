package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driverPage;

    @FindBy(how = How.XPATH, using = "//form[@id = 'userName']//p[1]//input[@name = 'UserName']") 
    private WebElement userName;

    @FindBy(how = How.XPATH, using = "//form[@id = 'userName']//p[2]//input[@name = 'Password']") 
    private WebElement userPassword;

    @FindBy(how = How.XPATH, using = "//form[@id = 'userName']//p[3]//input[@name = 'Login']") 
    private WebElement loginButton;


    public LoginPage(WebDriver driver){
        this.driverPage = driver;
        PageFactory.initElements(driverPage,this);
    }

    public void insertUsername (String name){

        userName.sendKeys(name);
    }

    public void InsertPassword(String password){

        userPassword.sendKeys(password);

    }

    public void clickLogin(){
        loginButton.click();
    }



}
