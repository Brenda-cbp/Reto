package co.com.choucair.certification.retoTecnico.tasks;

import co.com.choucair.certification.retoTecnico.model.UtestData;
import co.com.choucair.certification.retoTecnico.userinterface.PersonalInfoForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class FillOut implements Task {

    private List<UtestData> data;

    public FillOut(List<UtestData> data) {
        this.data = data;
    }

    public static FillOut thePersonalInformationForm(List<UtestData> data) {
        return Tasks.instrumented(FillOut.class, data );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getFirstName()).into(PersonalInfoForm.FIRST_NAME_INPUT),
                Enter.theValue(data.get(0).getLastName()).into(PersonalInfoForm.LAST_NAME_INPUT),
                Enter.theValue(data.get(0).getEmail()).into(PersonalInfoForm.EMAIL_INPUT),
                SelectFromOptions.byVisibleText(data.get(0).getMonthBirth()).from(PersonalInfoForm.MONTH_BIRTH_SELECT),
                SelectFromOptions.byVisibleText(data.get(0).getBirthDay()).from(PersonalInfoForm.DAY_BIRTH_SELECT),
                SelectFromOptions.byVisibleText(data.get(0).getYearBirth()).from(PersonalInfoForm.YEAR_BIRTH_SELECT),
                Click.on(PersonalInfoForm.NEXT_LOCATION_BUTTON)
        );
        
    }
}
