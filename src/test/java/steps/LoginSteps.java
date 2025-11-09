package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;


public class LoginSteps extends CommonMethods {

    @Given("user is able to access HRMS application")
    public void user_is_able_to_access_HRMS_application() {
        // driver = new ChromeDriver();
        // driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/leave/viewLeaveList");
        // driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        sendText(ConfigReader.read("username"), loginPage.userNameBox);
        sendText(ConfigReader.read("password"), loginPage.passwordBox);
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        clickOnElement(loginPage.loginButton);
    }

    @Then("user is able to see dashboard page")
    public void user_is_able_to_see_dashboard_page() {
        Assert.assertTrue("Admin is not logged in!!1", loginPage.welcomeAdmin.isDisplayed());
    }

    @When("user enters {string} and {string} in the app")
    public void user_enters_and_in_the_app(String fn, String ln) {
        sendText(fn, loginPage.userNameBox);
        sendText(ln, loginPage.passwordBox);
    }


    @Then("user shall see error message")
    public void user_shall_see_error_message() {
        Assert.assertTrue("Error message is not displayed", loginPage.errorMessage.isDisplayed());
        takeScreenShot("Error message");
    }

}
