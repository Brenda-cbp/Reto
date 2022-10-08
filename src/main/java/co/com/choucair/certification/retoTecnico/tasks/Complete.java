package co.com.choucair.certification.retoTecnico.tasks;

import co.com.choucair.certification.retoTecnico.model.UtestData;
import co.com.choucair.certification.retoTecnico.userinterface.AddressInfoForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class Complete implements Task {

    private List<UtestData> data;

    public Complete(List<UtestData> data) {
        this.data = data;
    }

    public static Complete theAdressInformationForm(List<UtestData> data) {
        return Tasks.instrumented(Complete.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getCity()).into(AddressInfoForm.CITY_INPUT).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Enter.theValue(data.get(0).getZip()).into(AddressInfoForm.ZIP_INPUT),
                Click.on(AddressInfoForm.COUNTRY_CONTAINER_SELECT),
                Enter.theValue(data.get(0).getCountry()).into(AddressInfoForm.COUNTRY_INPUT),
                Click.on(AddressInfoForm.NEXT_DEVICES_BUTTON)
        );

    }
}
