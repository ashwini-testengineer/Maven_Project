package EcomTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipKartTest {

        @Test
        public void launchFlipKart()
        {
            WebDriver driver= new ChromeDriver();
            driver.get("https://www.flipkart.com/");
        }
    }


