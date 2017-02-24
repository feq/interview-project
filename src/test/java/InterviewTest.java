import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.URL;

/**
 * Created by FecheteP on 2/24/2017.
 */
public class InterviewTest {

    public static void main(String[] args) {
        URL geckoDriver = InterviewTest.class.getResource("/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", geckoDriver.getPath());

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
    }
}