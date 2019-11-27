package co.com.choucair.certification.empleos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.empleos.userinterfaces.ChoucairTestingHomePage.BOTON_EMPLEOS;
import static co.com.choucair.certification.empleos.userinterfaces.ChoucairTestingJobsPage.BOTON_SER_CHOUCAIR;

public class Botones implements Task {


    public static Performable boton(){return Tasks.instrumented(Menu.class);}

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_SER_CHOUCAIR));
    }

}
