package CommonlyUsedMethods;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Utility {

    public static String readDataFromPropertiesFile(String key) throws IOException {
        FileInputStream myFile = new FileInputStream("C:\\Users\\User\\IdeaProjects\\Selenium_Project\\application.properties");
        Properties properties = new Properties();
        properties.load(myFile);
        System.out.println("reading data from properties file " + key);
        String value = properties.getProperty(key);
        return value;
    }

    public static String readDataFromExcel(int row, int cell) throws IOException {
        FileInputStream myFile = new FileInputStream("G:\\Test.xlsx");
        String value = WorkbookFactory.create(myFile).getSheet("Sheet6").getRow(row).getCell(cell).getStringCellValue();
        System.out.println("Reading data from excel sheet row " + row + " cell " + cell);
        return value;
    }

    public static void takeScreenShot(WebDriver driver, String fileName) throws IOException {
        String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //File dest = new File("./screenshotEvidences/" + fileName + timeStamp + ".png");
        File dest=new File("G:\\ScreenShot\\ "+fileName + timeStamp+".png");
        System.out.println("screenshot taken, saved at " + dest);
        FileHandler.copy(src, dest);
    }

    public static void scrollIntoView(WebDriver driver, WebElement element)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        System.out.println("scrolling into view");
    }
}


