package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;


import java.io.IOException;



public class ContactUsSteps extends DriverFactory {


    @Given("^I access webdriveruniversity contact us form$")
    public void i_access_webdriveruniversity_contact_us_form() throws IOException {
        contactUs_Page.getContactUsPage();
    }

    @When("^I enter a valid date first name$")
    public void i_enter_a_valid_date_first_name() throws Exception {
        contactUs_Page.enterFirstName();
           }

    @When("^I enter a valid date last name$")
    public void i_enter_a_valid_date_last_name(DataTable dataTable) throws Exception {

     contactUs_Page.enterLastName(dataTable, 0, 1);
      }

    @And("^I enter a valid email address$")
    public void i_enter_a_valid_email_address() throws Exception {
    contactUs_Page.enterEmailAddress("gonza_mol@hotmail.com");
    }

    @And("^I enter a comments$")
    public void i_enter_a_comments(DataTable dataTable) throws Exception {
        contactUs_Page.enterComments(dataTable,0,1);

    }

    @When("^I click on the submit button$")
    public void i_click_on_the_submit_button() throws Exception {
        contactUs_Page.clickOnSubmitButton();
    }

    @Then("^the information should successfuly be sumitted via the contact us form$")
    public void the_information_should_successfuly_be_sumitted_via_the_contact_us_form() throws Exception {

        contactUs_Page.confirmContactUsFormSubmissionWasSuccessful();
  }


}
