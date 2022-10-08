package co.com.choucair.certification.retoTecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://utest.com/")
public class UtestPage extends PageObject {
    public static final Target JOIN_TODAY_BUTTON =Target.the("Button that show us the register form")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
}
