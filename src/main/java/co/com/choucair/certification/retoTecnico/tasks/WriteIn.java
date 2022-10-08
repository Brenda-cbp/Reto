package co.com.choucair.certification.retoTecnico.tasks;

import co.com.choucair.certification.retoTecnico.model.UtestData;
import co.com.choucair.certification.retoTecnico.userinterface.LastPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class WriteIn implements Task {
    private List<UtestData> data;

    public WriteIn(List<UtestData> data) {
        this.data = data;
    }

    public static WriteIn theLastPage(List<UtestData> data) {
        return Tasks.instrumented(WriteIn.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getPassword()).into(LastPage.PASSWORD_INPUT),
                Enter.theValue(data.get(0).getPassword()).into(LastPage.CONFIRM_PASSWORD_INPUT),
                Click.on(LastPage.CHECK_USE_TERMS),
                Click.on(LastPage.CHECK_PRIVACY),
                Click.on(LastPage.COMPLETE_SETUP_BUTTON)
        );

    }
}
