package packageTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgKeywords2 {
    @Test(dependsOnMethods = {"setUp","placeOrder"})
    public void loginTest() {
        Reporter.log("Login Test Executed",true);
    }

    @Test(priority = -1)
    public void setUp() {
        Reporter.log("Browser Launched", true);
    }

  @Test
  public void placeOrder() {
      Reporter.log("Done order", true);
  }

  @Test(enabled = false)
    public void tearDown() {
       Reporter.log("Browser Closed",true);
    }

    @Test(timeOut = 8000)
    public void searchTest() {
        Reporter.log("searhtest timeout",true);
    }



}
