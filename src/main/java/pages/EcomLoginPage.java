package pages;

import CommonlyUsedMethods.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcomLoginPage {
    //variables-->webElements
    @FindBy(id = "tab-admin")
    private WebElement adminButton;
    @FindBy(id="admin-username")
    private WebElement userNameField;
    @FindBy(id = "admin-password")
    private WebElement passwordField;
    @FindBy(id="btn-admin-signin")
    private WebElement accessDashboardButton;

    //Constructor
    public EcomLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Methods
    public void clickOnAdminButton()
    {
        adminButton.click();
        System.out.println("clicking on admin button");
    }

    public void enterUserName(String username)
    {
        userNameField.sendKeys(username);
        System.out.println("Entering Username");
    }

    public void enterPassword(String password)
    {
        passwordField.sendKeys(password);
        System.out.println("Entering Password");
    }

    public void clickOnAccessDashBoardButton(WebDriver driver)
    {
        Utility.scrollIntoView(driver, accessDashboardButton);
        accessDashboardButton.click();
        System.out.println("clicking on access dashboard button");

    }
}
