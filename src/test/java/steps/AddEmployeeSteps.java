package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AddEmployeePage;
import utils.CommonMethods;

import java.util.List;
import java.util.Map;

public class AddEmployeeSteps extends CommonMethods {

    @When("admin click on PIM option")
    public void admin_click_on_pim_option() {
        clickOnElement(addEmployeePage.pimLocator);
    }

    @When("admin click on Add employee option")
    public void admin_click_on_Add_employee_option() {
        clickOnElement(addEmployeePage.addEmployeeLocator);
    }

    @When("admin enters firstname and last name")
    public void admin_enters_firstname_and_last_name() {
        sendText("Margarita", addEmployeePage.firstNameBoxLocator);
        sendText("Arsovska", addEmployeePage.lastNameBoxLocator);
    }

    @When("admin clicks on save button")
    public void admin_clicks_on_save_button() {
        clickOnElement(addEmployeePage.saveButtonLocator);
    }

    @Then("admin is able to see employee has been added successfully")
    public void admin_is_able_to_see_employee_has_been_added_successfully() {
        Assert.assertTrue("The employee was not added!!! Try Again!", addEmployeePage.personalDetailHeaderLocator.isDisplayed());
    }

    @When("admin enters firstname and middle name and last name")
    public void admin_enters_firstname_and_middle_name_and_last_name() {
        sendText("Margarita", addEmployeePage.firstNameBoxLocator);
        sendText("MS", addEmployeePage.middleNameLocator);
        sendText("Arsovska", addEmployeePage.lastNameBoxLocator);
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String firstName, String lastName) {
        sendText(firstName, addEmployeePage.firstNameBoxLocator);
        sendText(lastName, addEmployeePage.lastNameBoxLocator);
    }

    @When("user adds multiple employees using data table and saves them")
    public void user_adds_multiple_employees_using_data_table_and_saves_them
            (io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> employeeNames = dataTable.asMaps();
        for (Map<String, String> name : employeeNames) {

            sendText(name.get("FirstName"), addEmployeePage.firstNameBoxLocator);
            sendText(name.get("MiddleName"), addEmployeePage.middleNameLocator);
            sendText(name.get("LastName"), addEmployeePage.lastNameBoxLocator);

            clickOnElement(addEmployeePage.saveButtonLocator);
            clickOnElement(addEmployeePage.addEmployeeLocator);


        }
    }
}
