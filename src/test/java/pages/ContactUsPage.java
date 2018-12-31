package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.pages.PageObject;

@At(urls={"#HOST"})
public class ContactUsPage extends PageObject {

    @FindBy(css = "section [name=\"FNAME\"]")
    private WebElementFacade firstNameInputField;

    @FindBy(css = "section [name=\"LNAME\"]")
    private WebElementFacade lastNameInputField;

    public ContactUsPage enterFirstName(String firstName){
        firstNameInputField
                .waitUntilPresent()
                .then()
                .type(firstName);
        return this;
    }

    public ContactUsPage enterLastName(String lastName){
        lastNameInputField
                .type(lastName);
        return this;
    }
}
