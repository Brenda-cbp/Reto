package co.com.choucair.certification.retoTecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LastPage extends PageObject {

    public static final Target PASSWORD_INPUT= Target.the("Where we write the password")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD_INPUT= Target.the("Where we write the password again (confirm password)")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_USE_TERMS= Target.the("Where we check terms of use")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_PRIVACY = Target.the("Where we check the terms of privacy")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE_SETUP_BUTTON = Target.the("Button to go to the next form (Last step)")
            .located(By.xpath("//a[contains(@class, 'btn btn-blue')]"));

}


