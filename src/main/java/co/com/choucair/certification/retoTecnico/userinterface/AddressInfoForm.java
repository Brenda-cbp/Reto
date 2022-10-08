package co.com.choucair.certification.retoTecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddressInfoForm extends PageObject {
    public static final Target CITY_INPUT= Target.the("Where we write the city ")
            .located(By.id("city"));

    public static final Target ZIP_INPUT=Target.the("Where we write the Zip or Postal Code")
            .located(By.id("zip"));

    public static final Target COUNTRY_CONTAINER_SELECT=Target.the("Where we select the country")
            .located(By.xpath("//div[contains(@class, 'ui-select-container ui-select-bootstrap dropdown ng-not-empty ng-valid ng-valid-required')]"));
    public static final Target COUNTRY_INPUT=Target.the("Where we write the country")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target NEXT_DEVICES_BUTTON= Target.the("Button to go to the next form (devices)")
            .located(By.xpath("//a[contains(@class, 'btn btn-blue pull-right')]"));
}
