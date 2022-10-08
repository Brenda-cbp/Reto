package co.com.choucair.certification.retoTecnico.questions;

import co.com.choucair.certification.retoTecnico.model.UtestData;
import co.com.choucair.certification.retoTecnico.userinterface.LastPage;
import com.gargoylesoftware.htmlunit.javascript.host.Console;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Answer implements Question<Boolean> {

    private List<UtestData> data;

    public Answer(List<UtestData> data) {
        this.data = data;
    }

    public static Answer toThe(List<UtestData> data) {
        return new Answer(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String finalButton= Text.of(LastPage.COMPLETE_SETUP_BUTTON).viewedBy(actor).asString();
        return (finalButton.contains(data.get(0).getFinalButtonText()));
    }

}
