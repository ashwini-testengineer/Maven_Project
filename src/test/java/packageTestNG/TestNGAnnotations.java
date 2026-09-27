package packageTestNG;

import org.testng.Reporter;
import org.testng.annotations.*;

public class TestNGAnnotations {
        @AfterMethod
        public void postCondition() {
            Reporter.log("logout", true);
            Reporter.log("clear history", true);
            Reporter.log("close browser", true);
        }

        @BeforeMethod
        public void preCondition() {
            Reporter.log("open browser", true);
            Reporter.log("login", true);
            Reporter.log("navigate to recharge module",true);
        }

        @Test   //method
        public void rechargeMobile() {
            Reporter.log("==========================================", true);
            Reporter.log("enter mobile Number", true);
            Reporter.log("enter amount", true);
            Reporter.log("click recharge now button", true);
            Reporter.log("check confirmation msg", true);
            Reporter.log("==========================================", true);
        }

        @Test   //method
        public void rechargeTV() {
            Reporter.log("==========================================", true);
            Reporter.log("enter subscriber Number", true);
            Reporter.log("enter amount", true);
            Reporter.log("click recharge now button", true);
            Reporter.log("check confirmation msg", true);
            Reporter.log("==========================================", true);
        }

        @BeforeClass
        public void beforeClass() {
            Reporter.log("select browser eg:chrome, edge", true);
            Reporter.log("user specifications", true);

        }

        @AfterClass
        public void afterClass() {
            Reporter.log("destroy object", true);
            Reporter.log("generate test reports", true);
        }

    }


