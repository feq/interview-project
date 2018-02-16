import java.net.URL;

/**
 * Created by FecheteP on 2/24/2017.
 */
public class InterviewTest {

    public static void main(String[] args) {
        URL chromeDriver = InterviewTest.class.getResource("/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeDriver.getPath());

        //1. Instantiate a new webdriver of type ChromeDriver

        //2. Navigate to "https://promos.betfair.com"

        //3. Click on Arcade in the black subnavigation bar

        //4. Surround click of element with try catch, catch NoSuchElement exception and print exception message.

        //5. Get list of all promotions on page and click on second promotion   (Can you write this using java 8?)

        //6. Verify the name of the promotion

        //7. Get the name of the promotion

        //8. Create a new java List of Strings and add promotion name to list

        //9. Iterate over list and print list elements
    }

    //10. Write a test for the above, with before and after

    //11. Write a data provider for the test

    //12. Write an enum for all the values in the subnav and use it in the data provider to replace step 3
}