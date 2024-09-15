package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GoogleSearchPage;

public class GoogleSearch {
    GoogleSearchPage GoogleSearchPage = new GoogleSearchPage();

    @When("User searches for {string} capital")
    public void user_searches_for_capital(String countryName) {
        GoogleSearchPage.searchBox.sendKeys("what is capital of " + countryName + Keys.ENTER);
    }

    @Then("User should see {string} in the result")
    public void user_should_see_in_the_result(String capitalCity) {

        Assert.assertEquals(capitalCity, GoogleSearchPage.capitalText.getText());
    }
}
