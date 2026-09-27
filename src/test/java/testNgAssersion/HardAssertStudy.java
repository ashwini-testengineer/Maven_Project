package testNgAssersion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertStudy {
    @Test(enabled = false)
    public void assertEqualsStudy() {
        String a = "test";
        String b = "test";
        Assert.assertEquals(a, b, "expected and actual are not equals, TC failed");
    }
    @Test(enabled = false)
    public void assertNotEqualsStudy() {
      String presidentOld = "Trump1";
        String presidentNew = "Trump";
       Assert.assertNotEquals(presidentNew, presidentOld, "expected and actual are equal, TC failed");
   }
    @Test(enabled = false)
     public void assertTrueStudy() {
       boolean result = true;
       Assert.assertTrue(result, "result is false, TC fail");
   }

    @Test
    public void assertFalseStudy() {
       boolean result = false;
       Assert.assertFalse(result, "result is true, TC fail");
    }

    @Test(enabled = false)
    public void assertFailStudy() {
    Assert.fail();
    }
}
