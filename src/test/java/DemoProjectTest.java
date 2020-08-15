import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DemoProjectTest {

    WebDriver browser = new ChromeDriver();

    @BeforeMethod
    public void setUpBrowser(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        browser.get("https://www.tut.by/");
    }

    @Test
    public void demoMethod() {
        browser.findElement(By.xpath("test")).getAttribute("value");
        assertEquals("test", "test", "error message by assert");
    }

    @AfterMethod
    public void closeBrowser(){
        browser.quit();
    }


}
