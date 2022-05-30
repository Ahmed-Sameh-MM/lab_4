import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class baseTests {

    public void setFirstName(String target) {
        first_name.sendKeys(target);
    }

    public void setLastName(String target) {
        last_name.sendKeys(target);
    }

    public void setJobTitle(String target) {
        job_title.sendKeys(target);
    }

    public void setRadioButton1() {
        radioButton1.click();
    }

    public void setRadioButton2() {
        radioButton2.click();
    }

    public void setRadioButton3() {
        radioButton3.click();
    }

    public void clickSubmit() {
        submitButton.click();
    }

    public WebElement first_name;
    public WebElement last_name;
    public WebElement job_title;

    public WebElement radioButton1;
    public WebElement radioButton2;
    public WebElement radioButton3;

    public WebElement submitButton;

    public baseTests(WebDriver driver) {

        first_name = driver.findElement(By.id("first-name"));
        last_name = driver.findElement(By.id("last-name"));
        job_title = driver.findElement(By.id("job-title"));

        radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton2 = driver.findElement(By.id("radio-button-2"));
        radioButton3 = driver.findElement(By.id("radio-button-3"));

        submitButton = driver.findElement(By.linkText("Submit"));
    }
}
