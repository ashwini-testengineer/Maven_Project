import CommonlyUsedMethods.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.EcomDashBoardPage;
import pages.EcomLoginPage;

import java.io.IOException;
import java.time.Duration;

public class LoginEcomApp {
    static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://velocityecommerceproject-agarb0aagdcvd7fy.canadacentral-01.azurewebsites.net/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        EcomLoginPage ecomLoginPage = new EcomLoginPage(driver);
        ecomLoginPage.clickOnAdminButton();

        ecomLoginPage.enterUserName(Utility.readDataFromExcel(0,0));
        ecomLoginPage.enterPassword(Utility.readDataFromExcel(0,1));
        Thread.sleep(5000);

        ecomLoginPage.clickOnAccessDashBoardButton(driver);
        Thread.sleep(2000);

        EcomDashBoardPage ecomDashBoardPage = new EcomDashBoardPage(driver);
        String actualTotalOrders = ecomDashBoardPage.getTotalOrders();
        String actualTotalProducts = ecomDashBoardPage.getTotalProducts();
        String actualLowStockItems = ecomDashBoardPage.getLowStockItems();
        String actualPendingOrders = ecomDashBoardPage.getPendingOrders();
        String actualBackOrders = ecomDashBoardPage.getBackOrders();

        String expTotalOrders = "48";
        String expTotalProducts = "50";
        String expLowStockItems="7";
        String expPendingOrders="12";
        String expBackOrders="5";
        System.out.println("===========================================");
        System.out.println("validating Total orders ");
        if(actualTotalOrders.equals(expTotalOrders))
        {
            System.out.println("Total orders validation pass");
        } else {
            System.out.println("Total orders validation failed");
        }
        if(actualTotalProducts.equals(expTotalProducts))
        {
            System.out.println("Total products validation pass");
        } else {
            System.out.println("Total products validation failed");
        }
        System.out.println("===========================================");
        System.out.println("validating Total Low Stock Items ");

        if(actualLowStockItems.equals(expLowStockItems))
        {
            System.out.println("Low Stock Items validation pass");
        } else {
            System.out.println("Stock Items validation failed");
        }
        System.out.println("===========================================");
        System.out.println("validating Pending Orders");
        if(actualPendingOrders.equals(expPendingOrders))
        {
            System.out.println("Pending Order validation pass");
        } else {
            System.out.println("Pending Order validation failed");
        }
        System.out.println("===========================================");
        System.out.println("validating Back Orders ");
       // System.out.println(actualBackOrders);
       if(actualBackOrders.equals(expBackOrders))
        {
            System.out.println("Back Order validation pass");
        } else {
            System.out.println("Back Order validation failed");
        }

        Utility.takeScreenShot(driver,"TC123");



    }
}
