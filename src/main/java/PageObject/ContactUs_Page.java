package PageObject;

import cucumber.api.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.List;

public class ContactUs_Page extends BasePage {
    public @FindBy(css = "input[name='first_name']")
    WebElement textfield_FirstName;
    public @FindBy(css = "input[name='first_name']")
    WebElement textfield_LastName;
    public @FindBy(css = "input[name='email']")
    WebElement textfield_EmailAddress;
    public @FindBy(css = "textarea[name='message']")
    WebElement textfield_Message;
    public @FindBy(xpath = "//input[@value='SUBMIT']")
    WebElement button_Submit;

    public ContactUs_Page() throws IOException {
        super();
    }

    public ContactUs_Page getContactUsPage() throws IOException {
        getDriver().get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
        return new ContactUs_Page();
    }

    public ContactUs_Page enterFirstName() throws Exception {
        sendKeysToWebElement(textfield_FirstName,"Tom");
        return new ContactUs_Page();
    }

    public ContactUs_Page enterLastName(DataTable dataTable, int row, int column) throws Exception {
        List<List<String>> data= dataTable.raw();
        sendKeysToWebElement(textfield_LastName,data.get(row).get(column));
        return new ContactUs_Page();
    }

    public ContactUs_Page enterEmailAddress(String email) throws Exception {
        sendKeysToWebElement(textfield_FirstName,email);
        return new ContactUs_Page();
    }

    public ContactUs_Page enterComments(DataTable dataTable, int row, int column) throws Exception {
        List<List<String>> data= dataTable.raw();
        sendKeysToWebElement(textfield_Message,data.get(row).get(column));
        return new ContactUs_Page();
    }

    public ContactUs_Page clickOnSubmitButton() throws Exception {
        waitAndClickElement(button_Submit);
        return new ContactUs_Page();
    }

    public ContactUs_Page confirmContactUsFormSubmissionWasSuccessful() throws Exception {
        WebElement thanksContactUsPage = getDriver().findElement(By.xpath("//h1[contains(text(),'Thank You for your Message!')]"));
        WaitUntilWebElementIsVisible(textfield_Message);
        Assert.assertEquals("thanks for your message!",thanksContactUsPage.getText());
        return new ContactUs_Page();
    }

}
