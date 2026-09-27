package packageTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
    @Test(groups = "addToCart")
    public void AZaddToCart()
    {
        Reporter.log("AZaddToCart running", true);
    }

    @Test
    public void AZSearchProduct()
    {
        Reporter.log("AZSearchProduct running", true);
    }

    @Test
    public void AZCheckOutOrder()
    {
        Reporter.log("AZCheckOutOrder running", true);
    }


}
