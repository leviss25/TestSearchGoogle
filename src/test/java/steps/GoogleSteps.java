package steps;

import java.io.IOException;
import org.junit.Assert;
import cucumber.api.java.en.*;
import pages.GooglePage;

public class GoogleSteps {

     GooglePage google = new GooglePage();
     String expectedText= "En 1801, la patente de un telar autom\u00E1tico utilizando tarjetas perforadas fue dada a Joseph Marie Jacquard, quien revolucion\u00F3 la Industria textil.";

     @Given("^I am on the Google search page$")
     public void navigateToGoogle(){
          google.navigateToGoogle();
     }

     @When("^I enter Automatizacion in search page$")
     public void enterSearchCriteria(){
        google.enterSearchCriteria("Automatizacion");
     }

     @And("^Click on the search button$")
     public void clickSearchButton(){
          google.clickBottonSearch();
     }
     
     @Then("^The results match the criteria$")
     public void theLogoIsThere(){
        Assert.assertTrue("No se encontró logo",google.logoStatus());
     }

     @When("^Click on the Wikipedia link$")
     public void clickWikipediaLink(){
          google.clickLink();
     }

     @Then("^Verify year of the first process$")
     public void verifyYear(){
          Assert.assertEquals(expectedText, google.anioIsThere());
     }
     @And("^I do screenshot$")
     public void doScreenshot() throws IOException{
          google.screenShots("ScreenShot");
     }
}