package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import java.io.IOException;
import utils.DriverFactory;



public class ProductsSteps extends DriverFactory {


    @Given("^user navigates to \"([^\"]*)\"$")
    public void user_navigates_to_something(String url) throws InterruptedException {
      getDriver().get(url);


    }

    @When("^user click on \"([^\"]*)\"$")
    public void user_click_on_something(String locator) throws InterruptedException {
    Thread.sleep(2000);
       basePage.WaitUntilWebElementIsVisibleUsingByLocator(By.cssSelector(locator));
     getDriver().findElement(By.cssSelector(locator)).click();

    }

    @Then("^user shoul be presented with a promo alert$")
    public void user_shoul_be_presented_with_a_promo_alert() throws InterruptedException, IOException {
        products_Page.printSpecialOfferVoucherCode();
        products_Page.clickOnProccedButton_Popup();
    }


}
