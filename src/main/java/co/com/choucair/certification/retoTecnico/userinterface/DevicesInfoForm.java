package co.com.choucair.certification.retoTecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class DevicesInfoForm extends PageObject {

    public static final Target COMPUTER_CONTAINER = Target.the("Where we select the computer")
            .located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div"));
    public static final Target COMPUTER_INPUT = Target.the("Where we write the computer")
            .located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/input[1]"));


    public static final Target VERSION_CONTAINER = Target.the("Where we write the version")
            .located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div"));
    public static final Target VERSION_INPUT = Target.the("Where we write the version")
            .located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/input[1]"));


    public static final Target LANGUAGE_CONTAINER = Target.the("Where we write the language")
            .located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div"));
    public static final Target LANGUAGE_INPUT = Target.the("Where we write the language")
            .located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/input[1]"));


    public static final Target MOBILE_CONTAINER = Target.the("Where we write the mobile")
            .located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div"));
    public static final Target MOBILE_INPUT = Target.the("Where we write the mobile")
            .located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/input[1]"));


    public static final Target MODEL_CONTAINER = Target.the("Where we write the mobile model")
            .located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div"));
    public static final Target MODEL_INPUT = Target.the("Where we write the mobile model")
            .located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/input[1]"));


    public static final Target OPERATING_SYSTEM_CONTAINER= Target.the("Where we write the mobile operating system")
            .located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div"));
    public static final Target OPERATING_SYSTEM_INPUT= Target.the("Where we write the mobile operating system")
            .located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/input[1]"));

    public static final Target NEXT_LAST_STEP_BUTTON = Target.the("Button to Complete Setup ")
            .located(By.xpath("//a[contains(@class, 'btn btn-blue pull-right')]"));
}
