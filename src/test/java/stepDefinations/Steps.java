package stepDefinations;

import com.Cucumber_project.qa.pages.LoginPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {

   public WebDriver driver;
   public LoginPage lp;
    @Given("Launch chrome browser")
    public void launch_chrome_browser() {
           System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
           driver=new ChromeDriver();
           lp=new LoginPage(driver);

    }

    @When("Enter the URL {string}")
    public void enter_the_url(String url) {
           driver.get(url);
    }
    @Then("Enter the Email as {string} and Password as {string}")
    public void enter_the_email_as_and_password_as(String email, String password) {
           lp.uName(email);
           lp.pwd(password);
    }
    @Then("Click on login button")
    public void click_on_login_button() {
       lp.clickLogin();
    }
    @Then("Page title should be {string}")
    public void page_title_should_be(String title) {

        if(driver.getTitle().equals(title)){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }

    }
    @Then("Click on logout button")
    public void click_on_logout_button() throws InterruptedException {
       lp.clickLogout();
       Thread.sleep(3000);
    }

    @And("Close the browser")
    public void close_the_browser() {

        driver.quit();
    }

}
