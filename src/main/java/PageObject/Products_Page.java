package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class Products_Page extends BasePage{

    public @FindBy(css = "#container-special-offers")
    WebElement button_SpecialOffers;
    public @FindBy(css = "#container-product2")
    WebElement button_Laptops;
    public @FindBy(xpath = ".//*[@id='myModal']//b[contains((text)='NEWCUSTOMER')]")
    WebElement voucherNumber;
    public @FindBy(xpath = "//button[text()='Proceed']")
    WebElement button_Proceed_Popup;

    public Products_Page() throws IOException {
        super();
    }

    public Products_Page clickOnProccedButton_Popup() throws InterruptedException, IOException {

        waitAndClickElement(button_Proceed_Popup);
        return new Products_Page();
    }

    public String printSpecialOfferVoucherCode(){
        WaitUntilWebElementIsVisible(voucherNumber);
        String voucherCode= voucherNumber.getText();
        System.out.println("Voucher Code:"+ voucherCode);
        return voucherCode;
    }
}
