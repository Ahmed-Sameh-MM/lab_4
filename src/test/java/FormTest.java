import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;

public class FormTest {

    String[] first_names = {"Ahmed", "Amr", "Osama", "Hamza", "Ben", "Ten"};
    String[] last_names = {"Sameh", "John", "Jake", "Mazda", "Ben", "Ten"};
    String[] job_titles = {"Doctor", "Engineer", "Mechanic", "Developer"};

    @Test
    public void test_form() throws InterruptedException {
        // Five test cases
        for(int i = 0; i < 5; i++) {
            System.setProperty("webdriver.chrome.driver", "Web_Driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://formy-project.herokuapp.com/form");

            driver.manage().window().maximize();
            baseTests test = new baseTests(driver);
            Random rand = new Random();

            test.setFirstName(first_names[rand.nextInt(4)]);
            test.setLastName(last_names[rand.nextInt(4) ]);
            test.setJobTitle(job_titles[(int)(Math.random() * job_titles.length)]);

            if (rand.nextBoolean()) {
                test.setRadioButton1();
            }
            if (rand.nextBoolean()) {
                test.setRadioButton2();
            }
            if (rand.nextBoolean()) {
                test.setRadioButton3();
            }
            Thread.sleep(1000);
            test.clickSubmit();
            Thread.sleep(750);
            driver.quit();
        }

    }
}