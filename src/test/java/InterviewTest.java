import java.net.URL;

/**
 * Created by FecheteP on 2/24/2017.
 */
public class InterviewTest {

    public static void main(String[] args) {
        URL geckoDriver = InterviewTest.class.getResource("/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", geckoDriver.getPath());

        //Instantiate a new webdriver

        //Navigate to "https://promos.betfair.com"

        //Click on Arcade in the black subnavigation bar

        //Click on second promotion

        //Verify the name of the promotion
    }
}