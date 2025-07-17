package com.ilcarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver driver) {
        super(driver);
    }
   @FindBy(id = "city")
    WebElement inputCity;
    public SearchPage enterCity(String city) {
        type(inputCity,city);
        return this;
    }
    @FindBy(id = "dates")
    WebElement inputDates;
    public SearchPage selectDate(String dateFrom, String dateTo) {
        click(inputDates);
        String os = System.getProperty("os.name");
       // System.out.println("My OS is " + os);
        if (os.startsWith("Mac")) {
            inputDates.sendKeys(Keys.COMMAND, "a");
        } else {
            inputDates.sendKeys(Keys.CONTROL, "a");
        }

        inputDates.sendKeys(dateFrom + " - " + dateTo);
        inputDates.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(css = "button[type='submit']")
    WebElement yallaButton;
    public SearchPage clickOnYallaButton() {
        click(yallaButton);
        return this;
    }
    @FindBy(tagName = "h3")
     WebElement availableMessage;
    public SearchPage isMessageTextPresent(String message) {
        assert  availableMessage.getText().contains(message);
        return this;
    }

}
