package packageTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Fipkart {

    @Test(groups = "addToCart")
    public void FKaddToCart() {
        Reporter.log("FKaddToCart running", true);
    }

    @Test
    public void FKSearchProduct() {
        Reporter.log("FKSearchProduct running", true);
    }

    @Test
    public void FKCheckOutOrder() {
        Reporter.log("FKCheckOutOrder running", true);
    }

}
