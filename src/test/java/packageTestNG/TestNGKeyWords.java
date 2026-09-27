package packageTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGKeyWords {

//    @Test(invocationCount = 3)
//    public void a() {
//        Reporter.log("a is running", true);
//    }

//    @Test(timeOut = 100)
//    public void payment() throws InterruptedException {
//        Thread.sleep(40);
//        Reporter.log("payment is processing", true);
//    }


        @Test(priority = -1)
        public void Zlogin() {
            Reporter.log("login done", true);
        }

        @Test(priority = -1)
        public void Alogout() {
            Reporter.log("logged out..", true);
        }
    }


