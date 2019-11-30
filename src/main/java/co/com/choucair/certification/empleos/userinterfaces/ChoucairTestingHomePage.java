package co.com.choucair.certification.empleos.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class ChoucairTestingHomePage extends PageObject {
public static final Target BOTON_EMPLEOS = Target.the("boton del menú principal para ingresar a la página de empleos").located(xpath("//li[@id='menu-item-550']//a[contains(text(),'Empleos')]"));
}
