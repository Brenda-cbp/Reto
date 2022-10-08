package co.com.choucair.certification.retoTecnico.stepdefinitions;

import co.com.choucair.certification.retoTecnico.model.UtestData;
import co.com.choucair.certification.retoTecnico.questions.Answer;
import co.com.choucair.certification.retoTecnico.tasks.*;
import cucumber.api.java.Before;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RegisterStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Camilo wants to register on UTest platform$")
    public void thanCamiloWantsToRegisterOnUTestPlatform() {
        OnStage.theActorCalled("Camilo").wasAbleTo(OpenUp.thePage());
    }

    @When("^he completes the registration form with his data$")
    public void heCompletesTheRegistrationFormWithHisData(List<UtestData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillOut.thePersonalInformationForm(data), Complete.theAdressInformationForm(data),
                Select.theDevicesInformationForm(data), WriteIn.theLastPage(data) );
    }

    @Then("^he finds the final button and registration is successful$")
    public void heFindsTheFinalButtonAndRegistrationIsSuccessful(List<UtestData> data ) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(data)));
    }

}
