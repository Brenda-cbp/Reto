package co.com.choucair.certification.retoTecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalInfoForm extends PageObject {

    public static final Target FIRST_NAME_INPUT=Target.the("Where we write the first name")
            .located(By.id("firstName"));

    public static final Target LAST_NAME_INPUT=Target.the("Where we write the last name")
            .located(By.id("lastName"));

    public static final Target EMAIL_INPUT=Target.the("Where we write the email")
            .located(By.id("email"));

    public static final Target MONTH_BIRTH_SELECT=Target.the("Where we select the birth month")
            .located(By.id("birthMonth"));

    public static final Target DAY_BIRTH_SELECT=Target.the("Where we select the birthDay")
            .located(By.id("birthDay"));

    public static final Target YEAR_BIRTH_SELECT=Target.the("Where we select the birth year")
            .located(By.id("birthYear"));

    public static final Target NEXT_LOCATION_BUTTON=Target.the("Button to go to the next form (location)")
            .located(By.xpath("//a[contains(@class,'btn btn-blue')]"));
}
