package packageTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodsStudy1 {
    @Test
    public void f() {
        Reporter.log("f is running", true);
    }

    @Test
    public void g() {
        Reporter.log("g is running", true);
    }

    @Test
    public void h() {
        Reporter.log("h is running", true);
    }

    @Test
    public void i() {
        Reporter.log("i is running", true);
    }

    @Test
    public void j() {
        Reporter.log("j is running", true);
    }

}
