package packageTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1TestNG {
    @Test
    public void launchURL()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://velocityecommerceproject-agarb0aagdcvd7fy.canadacentral-01.azurewebsites.net/");
        Reporter.log("Browser Lanched",true);
    }
}
