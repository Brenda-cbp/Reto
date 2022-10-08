package co.com.choucair.certification.retoTecnico.tasks;

import co.com.choucair.certification.retoTecnico.model.UtestData;
import co.com.choucair.certification.retoTecnico.userinterface.DevicesInfoForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class Select implements Task {
    private List<UtestData> data;

    public Select(List<UtestData> data) {
        this.data = data;
    }

    public static Select theDevicesInformationForm(List<UtestData> data) {
        return Tasks.instrumented(Select.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DevicesInfoForm.COMPUTER_CONTAINER),
                Enter.theValue(data.get(0).getComputer()).into(DevicesInfoForm.COMPUTER_INPUT).thenHit(Keys.ARROW_DOWN,Keys.ENTER),

                Click.on(DevicesInfoForm.VERSION_CONTAINER),
                Enter.theValue(data.get(0).getVersion()).into(DevicesInfoForm.VERSION_INPUT).thenHit(Keys.ARROW_DOWN,Keys.ENTER),

                Click.on(DevicesInfoForm.LANGUAGE_CONTAINER),
                Enter.theValue(data.get(0).getLanguage()).into(DevicesInfoForm.LANGUAGE_INPUT).thenHit(Keys.ARROW_DOWN,Keys.ENTER),

                Click.on(DevicesInfoForm.MOBILE_CONTAINER),
                Enter.theValue(data.get(0).getMobile()).into(DevicesInfoForm.MOBILE_INPUT).thenHit(Keys.ARROW_DOWN,Keys.ENTER),

                Click.on(DevicesInfoForm.MODEL_CONTAINER),
                Enter.theValue(data.get(0).getModel()).into(DevicesInfoForm.MODEL_INPUT).thenHit(Keys.ENTER),

                Click.on(DevicesInfoForm.OPERATING_SYSTEM_CONTAINER),
                Enter.theValue(data.get(0).getOperatingSystem()).into(DevicesInfoForm.OPERATING_SYSTEM_INPUT).thenHit(Keys.ENTER),

                Click.on(DevicesInfoForm.NEXT_LAST_STEP_BUTTON)
        );

    }
}
