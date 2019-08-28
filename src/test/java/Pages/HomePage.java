package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how = How.XPATH, using = "//h1[text() = 'Execute Automation Selenium Test Site']")
    private WebElement homePageTitle;

}
